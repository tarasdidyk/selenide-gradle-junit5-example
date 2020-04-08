package pages.common;

import pages.blocks.common.HeaderBlock;
import utils.DriverHelper;

public abstract class BasePage {
  public HeaderBlock headerBlock;
  public DriverHelper h;

  public BasePage() {
    h = new DriverHelper();
    headerBlock = new HeaderBlock();
  }
}
