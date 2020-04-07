package pages.blocks.common;

import com.codeborne.selenide.ElementsContainer;
import utils.DriverHelper;

public abstract class BaseBlock extends ElementsContainer {
  public DriverHelper h;

  public BaseBlock() {
    h = new DriverHelper();
  }
}
