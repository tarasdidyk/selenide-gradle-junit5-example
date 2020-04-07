package pages.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.blocks.common.BaseBlock;

import static com.codeborne.selenide.Selenide.$;

public class HeaderBlock extends BaseBlock {
  private SelenideElement searchField = $(By.id("query"));
  private SelenideElement searchButton = $(By.xpath("//input[@value = 'Search']"));

  public HeaderBlock enterDataInTheSearchField(String data) {
    searchField.sendKeys(data);
    return this;
  }

  public HeaderBlock clickSearchButton() {
    searchButton.click();
    return this;
  }

}
