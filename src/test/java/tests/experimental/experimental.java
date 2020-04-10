package tests.experimental;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.main.MainPage;
import pages.search.SearchResultPage;
import tests.common.BaseTest;
import utils.enums.RepositoryGroup;

import static com.codeborne.selenide.Selenide.open;

public class experimental extends BaseTest {

  @Tag("search")
  @DisplayName("Is the 0.2.0 version of the Github TrieMap collection displayed")
  @Test
  public void isTheLastVersionOfTheGitHubTrieMapCollectionDisplayed() {
    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    open("");
    mainPage.headerBlock.enterDataInTheSearchField("TrieMap");
    mainPage.headerBlock.clickSearchButton();
    searchResultPage.leftSearchResultMenuFiltersBlock.filterByGroup(RepositoryGroup.GITHUB);
    searchResultPage.searchResultBlock.isRepositoryDisplayed("dw", "dw");
  }
}
