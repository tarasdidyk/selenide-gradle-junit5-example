package pages.common;

import utils.DriverHelper;

public abstract class BasePage {
  public DriverHelper h;

  public BasePage() {
    h = new DriverHelper();
  }
}
