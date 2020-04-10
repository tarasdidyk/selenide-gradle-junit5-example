package tests.common;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Utils;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class BaseTest {

  @BeforeAll
  static void setUpDriver() {
    if (Utils.isEnvironmentRemote()) {
      Configuration.driverManagerEnabled = false;
      Configuration.remote = "http://192.168.0.105:4444/wd/hub";
    }
    Configuration.screenshots = true;
    Configuration.baseUrl = "https://mvnrepository.com/";
    Configuration.startMaximized = true;
    Configuration.downloadsFolder = "src/test/resources/download/";
  }

  @AfterEach
  public void tearDown() {
    saveScreenshot();
  }

  @Attachment(value = "Page screenshot", type = "image/png")
  public static byte[] saveScreenshot() {
    return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
  }

  @Attachment(type = "text/plain")
  public String saveOutput(String data) {
    return data;
  }
}
