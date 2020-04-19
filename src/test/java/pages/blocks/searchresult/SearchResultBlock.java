package pages.blocks.searchresult;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.blocks.common.BaseBlock;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultBlock extends BaseBlock {
  private ElementsCollection searchResults = $$(By.xpath(".//div[@class = 'im']"));

  @Step("Is repository displayed")
  public boolean isRepositoryDisplayed(String name, String group) {
    for (SelenideElement result : searchResults) {
      if (result.is(Condition.text(name)) && result.is(Condition.text(group))) {
        return true;
      }
    }
    return false;
  }
}
