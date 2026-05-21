package org.tzi.use.useCap.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.tzi.use.useCap.util.CommonVar.CAP_ROOT;


public class FileUtils {

  // get the current available CAPs from USE
  public static List<String> getCurrentCAP() {

    List<String> currentCAPs = new ArrayList<>();

    Path parentDir = CAP_ROOT;

    try {
      Files.createDirectories(parentDir);
      // get all objects int the parent directory and filter only the directories, then add their names to the currentCAPs list
      try (DirectoryStream<Path> stream =
               Files.newDirectoryStream(parentDir, Files::isDirectory)) {
        for (Path path : stream) {
          currentCAPs.add(path.getFileName().toString());
        }
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return currentCAPs;
  }

  // delete a CAP folder by name
  public static void deleteCapFolder(String name) throws IOException {
    Path target = CAP_ROOT.resolve(name);

    // if the target folder does not exist or is not a directory, throw an exception
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

  /**
   * Save content to a file, if the file already exists, it will be overwritten.
   * @param content
   * @param path
   * @throws IOException
   */
  public static void saveContentToFixedFile(String content, String path) throws IOException {
    Path filePath = Path.of(
        path
    );

    Files.createDirectories(filePath.getParent());

    Files.write(
        filePath,
        content.getBytes(StandardCharsets.UTF_8),
        StandardOpenOption.CREATE,
        StandardOpenOption.TRUNCATE_EXISTING
    );
  }

  /**
   * Remove excessive blank lines from the content. A blank line is defined as a line that contains only whitespace characters (spaces, tabs) or is completely empty.
   * @param content the input content that may contain excessive blank lines
   * @return the cleaned content with excessive blank lines removed, ensuring that there are no more than two consecutive blank lines
   */
  public static String cleanExcessiveBlankLines(String content) {
    if (content == null || content.isEmpty()) {
      return content;
    }

    // \r\n - window
    // \n - linux
    // convert all line endings to \n
    String normalized = content.replace("\r\n", "\n");

    // delete all lines that contain only whitespace characters (spaces, tabs)
    normalized = normalized.replaceAll("(?m)^[ \t]+$", "");

    // replace 3 lines of consecutive block with \n and then a newline
    return normalized.replaceAll("\\n{3,}", "\n\n");
  }
}
