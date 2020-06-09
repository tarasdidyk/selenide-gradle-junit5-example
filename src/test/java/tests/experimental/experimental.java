package tests.experimental;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.common.BaseTest;

import static com.codeborne.selenide.Selenide.open;

public class experimental extends BaseTest {

  @Tag("test")
  @Test
  public void test() {
    open("");
    System.out.println(System.getProperty("os.name").toLowerCase().contains("window"));
  }
}
