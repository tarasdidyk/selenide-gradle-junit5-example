package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.main.MainPage;
import pages.search.SearchResultPage;
import tests.common.BaseTest;

import static com.codeborne.selenide.Selenide.open;

public class SearchTest extends BaseTest {

  @Tag("search")
  @DisplayName("Is the 'Github TrieMap' repository displayed after searching")
  @Test
  public void isTheGithubTrieMapRepositoryDisplayedAfterSearching() {
    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    open("");
    mainPage.headerBlock.enterDataInTheSearchField("TrieMap");
    mainPage.headerBlock.clickSearchButton();
    Assertions.assertTrue(searchResultPage.searchResultBlock.isRepositoryDisplayed("TrieMap", "com.github")
        , "The repository is not displayed");
  }
}
