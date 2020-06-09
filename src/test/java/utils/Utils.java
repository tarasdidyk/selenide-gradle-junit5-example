package utils;

public class Utils {

  public static boolean isEnvironmentRemote() {
   return System.getProperty("os.name").toLowerCase().contains("linux");
  }
}
