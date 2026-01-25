package org.tzi.use.examplePlugin.util;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.tzi.use.examplePlugin.util.CommonVar.CAP_ROOT;
import static org.tzi.use.examplePlugin.util.CommonVar.CAP_STORAGE_URL;


public class FileUtils {

  // get the current available CAPs from USE
  public static List<String> getCurrentCAP() {

    List<String> currentCAPs = new ArrayList<>();

    Path parentDir = Paths.get(CAP_STORAGE_URL);

    try (DirectoryStream<Path> stream =
             Files.newDirectoryStream(parentDir, Files::isDirectory)) {
      for (Path path : stream) {
        currentCAPs.add(path.getFileName().toString());
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return currentCAPs;
  }

  // delete a CAP folder by name
  public static void deleteCapFolder(String name) throws IOException {
    Path target = CAP_ROOT.resolve(name);

    // Không tồn tại → bỏ qua
    if (!Files.exists(target) || !Files.isDirectory(target)) {
      throw new IOException("CAP folder not found: " + name);
    }

    Files.walk(target)
        .sorted(Comparator.reverseOrder())
        .forEach(path -> {
          try {
            Files.delete(path);
          } catch (IOException e) {
            throw new RuntimeException("Cannot delete: " + path, e);
          }
        });
  }

  // ensure a directory exists, if not create it
  public static Path ensureDirectory(Path path) throws IOException {
    if (!Files.exists(path)) {
      Files.createDirectories(path);
    }
    return path;
  }
}
