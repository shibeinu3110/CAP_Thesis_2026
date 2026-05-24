package org.tzi.use.useCap.util;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CommonVar {

  // use relative path
  public static final Path CAP_ROOT =
      Path.of(System.getProperty("user.home"), ".use", "cap_storage");
  public static final String CAP_STORAGE_URL = CAP_ROOT.toString();

  private static final String TEMP_DIR =
      System.getProperty("java.io.tmpdir");

  public static final String corePath = Paths.get(
      TEMP_DIR,
      "temp-core.txt"
  ).toString();

  public static final String oclPath = Paths.get(
      TEMP_DIR,
      "temp-ocl.txt"
  ).toString();
}
