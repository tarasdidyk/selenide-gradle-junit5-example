package pages.blocks.searchresult;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.blocks.common.BaseBlock;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultBlock extends BaseBlock {
  private SelenideElement searchResultBlock = $(By.xpath("//div[@id = 'maincontent']"));

  private ElementsCollection searchResults = $$(By.xpath(".//div[@class = 'im']"));

  @Step("Is repository displayed")
  public boolean isRepositoryDisplayed(String name, String Group) {
    for(SelenideElement result: searchResults) {
      System.out.println(result.getText());
    }
    return true;
  }
}
