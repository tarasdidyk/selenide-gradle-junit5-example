package pages.main;

import pages.blocks.HeaderBlock;
import pages.common.BasePage;

public class MainPage extends BasePage {
  public HeaderBlock headerBlock;

  public MainPage() {
    headerBlock = new HeaderBlock();
  }
}
