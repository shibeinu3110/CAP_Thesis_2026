package org.tzi.use.useCap.util;

import java.nio.file.Path;

public class CommonVar {

  // use relative path
  public static final Path CAP_ROOT =
      Path.of(System.getProperty("user.home"), ".use", "cap_storage");
  public static final String CAP_STORAGE_URL = CAP_ROOT.toString();

  public static final String SELF = "self";
}
