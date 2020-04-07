package tests.experimental;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.main.MainPage;
import tests.common.BaseTest;

import static com.codeborne.selenide.Selenide.open;

public class experimental extends BaseTest {

  @Tag("test")
  @Test
  public void test() {
    MainPage mainPage = new MainPage();
    open("");
    mainPage.headerBlock.enterDataInTheSearchField("maven");
    mainPage.headerBlock.clickSearchButton();
    Selenide.sleep(3000);
  }
}
