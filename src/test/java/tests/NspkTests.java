package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AboutCompanyPage;
import pages.MainPage;
import pages.ProcessingOfPersonalDataPage;

@Tag("nspk_tests")
public class NspkTests extends TestBase {

  MainPage mainPage = new MainPage();
  AboutCompanyPage aboutCompanyPage = new AboutCompanyPage();
  ProcessingOfPersonalDataPage processingOfPersonalDataPage = new ProcessingOfPersonalDataPage();

  @Test
  @DisplayName("Проверка открытия главной страницы и заголовка")
  void openMainPageAndCheckTitleTest() {
    mainPage.openMainPage()
            .checkTitleOnMainPage("Национальная система платежных карт");
  }

  @Test
  @DisplayName("Проверка пунктов основного меню на главной странице")
  void checkHeaderMenuOnMainPageTest() {
    String[] headerMenuItems = new String[]{"О компании", "Платежная система «Мир»", "Банкам", "Центр знаний",
            "Вакансии", "Пресс-центр", "Контакты"};
    mainPage.openMainPage()
            .checkHeaderMenuItems(headerMenuItems);
  }

  @Test
  @DisplayName("Проверка подпунктов меню пункта 'О компании' на главной странице")
  void checkSubmenuItemsOfAboutItemMenuOnMainPageTest() {
    String headerMenuItem = "О компании";
    String[] subMenuItems = new String[]{"Компания АО «НСПК»", "Обработка персональных данных",
            "Оценка условий труда на рабочих местах", "Официальные сайты", "Акционерам и инвесторам",
            "Устойчивое развитие", "Противодействие коррупции", "Соответствие PCI DSS",
            "Деятельность в области информационных технологий", "Реквизиты"};
    mainPage.openMainPage()
            .checkSubMenuItems(headerMenuItem, subMenuItems);
  }

  @Test
  @DisplayName("Переход на страницу 'О компании АО «НСПК»' c главной страницы через меню")
  void openPageAboutCompanyFromMenuOnMainPageTest() {
    mainPage.openMainPage()
            .clickOnSubMenuItem("О компании", "Компания АО «НСПК»");
    aboutCompanyPage.checkTitleOnAboutCompanyPage("О компании АО «НСПК»");
  }

  @Test
  @DisplayName("Переход на страницу 'Обработка персональных данных' c главной страницы через меню")
  void openPageProcessingOfPersonalDataFromMenuOnMainPageTest() {
    mainPage.openMainPage()
            .clickOnSubMenuItem("О компании", "Обработка персональных данных");
    processingOfPersonalDataPage.checkTitleProcessingOfPersonalDataPage("Обработка персональных данных");
  }
}

