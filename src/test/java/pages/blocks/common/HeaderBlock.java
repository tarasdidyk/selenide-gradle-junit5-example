package pages.blocks.common;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderBlock extends BaseBlock {
  private SelenideElement searchField = $(By.id("query"));
  private SelenideElement searchButton = $(By.xpath("//input[@value = 'Search']"));

  @Step("Enter data in the 'search field")
  public HeaderBlock enterDataInTheSearchField(String data) {
    searchField.sendKeys(data);
    return this;
  }

  @Step("Click the 'Search' button")
  public HeaderBlock clickSearchButton() {
    searchButton.click();
    return this;
  }

}
