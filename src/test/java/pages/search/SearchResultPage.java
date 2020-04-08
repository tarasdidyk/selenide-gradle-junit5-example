package pages.search;

import pages.blocks.searchresult.LeftSearchResultMenuFiltersBlock;
import pages.common.BasePage;

public class SearchResultPage extends BasePage {
  public LeftSearchResultMenuFiltersBlock leftSearchResultMenuFiltersBlock;

  public SearchResultPage() {
    leftSearchResultMenuFiltersBlock = new LeftSearchResultMenuFiltersBlock();
  }
}
