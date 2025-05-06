package pages.components;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.$$;


public class HeaderMenuComponents {
  public void checkItemsOfHeaderMenu(String[] headerMenuItems) {
    $$(".layout-menu__item").shouldHave(texts(headerMenuItems));
  }
}
