package pages.blocks.searchresult;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.blocks.common.BaseBlock;
import utils.enums.RepositoryGroup;

import static com.codeborne.selenide.Selenide.$;

public class LeftSearchResultMenuFiltersBlock extends BaseBlock {
  private SelenideElement filterMenuContainer = $(By.xpath("//div[@id = 'left']"));

  private SelenideElement groupContainer = filterMenuContainer.$(By.xpath(".//h3[text() = 'Group']/.."));

  @Step("select repository filter")
  public LeftSearchResultMenuFiltersBlock filterByGroup(RepositoryGroup repositoryGroupName) {
    String locator = String.format(".//span[text() = '%s']", repositoryGroupName.toString());
    SelenideElement selectItem = groupContainer.$(By.xpath(locator));
    selectItem.click();
    return this;
  }
}
