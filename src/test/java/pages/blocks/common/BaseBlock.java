package pages.blocks.common;

import utils.DriverHelper;

public abstract class BaseBlock {
  public DriverHelper h;

  public BaseBlock() {
    h = new DriverHelper();
  }
}
