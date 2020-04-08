package tests.experimental;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.main.MainPage;
import pages.search.SearchResultPage;
import tests.common.BaseTest;
import utils.enums.RepositoryNames;

import static com.codeborne.selenide.Selenide.open;

public class experimental extends BaseTest {

  @Tag("test")
  @Test
  public void test() {
    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    open("");
    mainPage.headerBlock.enterDataInTheSearchField("java");
    mainPage.headerBlock.clickSearchButton();
    searchResultPage.leftSearchResultMenuFiltersBlock.selectRepositoryFilter(RepositoryNames.CENTRAL);
  }
}
