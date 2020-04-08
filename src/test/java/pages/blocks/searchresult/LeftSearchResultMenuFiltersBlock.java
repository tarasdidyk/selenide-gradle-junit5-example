package pages.blocks.searchresult;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.blocks.common.BaseBlock;
import utils.enums.RepositoryNames;

import static com.codeborne.selenide.Selenide.$;

public class LeftSearchResultMenuFiltersBlock extends BaseBlock {
  SelenideElement filterMenuContainer = $(By.xpath("//div[@id = 'left']"));

  @Step("select repository filter")
  public LeftSearchResultMenuFiltersBlock selectRepositoryFilter(RepositoryNames repositoryName) {
    String locator = String.format(".//span[text() = '%s']", repositoryName.toString());
    SelenideElement selectItem = filterMenuContainer.$(By.xpath(locator));
    selectItem.click();
    return this;
  }
}
