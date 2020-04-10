package pages.search;

import pages.blocks.searchresult.LeftSearchResultMenuFiltersBlock;
import pages.blocks.searchresult.SearchResultBlock;
import pages.common.BasePage;

public class SearchResultPage extends BasePage {
  public LeftSearchResultMenuFiltersBlock leftSearchResultMenuFiltersBlock;
  public SearchResultBlock searchResultBlock;

  public SearchResultPage() {
    leftSearchResultMenuFiltersBlock = new LeftSearchResultMenuFiltersBlock();
    searchResultBlock = new SearchResultBlock();
  }
}
