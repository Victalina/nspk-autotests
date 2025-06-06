
# Проект по автоматизации тестирования для компании [Национальная система платежных карт](https://www.nspk.ru/)

> НСПК обеспечивает обработку операций по картам «Мир» и картам международных платежных систем, развитие продуктов и сервисов ПС «Мир», совместно с Банком России развивает Систему быстрых платежей, а также обеспечивает удобные и безопасные платежи по универсальному QR-коду и с помощью биоэквайринга.

## **Содержание:**
____

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Примеры автоматизированных тест-кейсов</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>
____
<a id="tools"></a>
## **Технологии и инструменты:**

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/intellij-idea.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/allure.svg" width="50" height="50"  alt="Allure"/></a>  
<a href="https://www.jenkins.io/"><img src="images/logo/jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

____
<a id="cases"></a>
## **Примеры автоматизированных тест-кейсов:**
____
- ✓ Проверка открытия главной страницы и заголовка
- ✓ Проверка пунктов основного меню на главной странице
- ✓ Проверка подпунктов меню пункта 'О компании' на главной странице
- ✓ Переход на страницу 'О компании АО «НСПК»' с главной страницы через меню
- ✓ Переход на страницу 'Обработка персональных данных' c главной страницы через меню
____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/logo/jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/C34-Vicktalina-unit14/)
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/C34-Vicktalina-unit14/"><img src="images/screenshot/jenkins_build.png" alt="Jenkins" width="950"/></a>  
</p>

### **Параметры сборки в Jenkins:**

- BROWSER (браузер, по умолчанию chrome)
- VERSION (версия браузера, по умолчанию 128.0)
- WINDOW_SIZE (размер окна браузера, по умолчанию 1920x1080)
- BASE_URL (адрес тестируемого веб-сайта)
- REMOTE_BROWSER (логин, пароль и адрес удаленного сервера Selenoid)

<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
```bash  
gradle clean nspk_tests
```

***Удалённый запуск через Jenkins:***
```bash  
clean nspk_tests
"-Dbrowser=${BROWSER}"
"-Dversion=${VERSION}"
"-DwindowSize=${WINDOW_SIZE}"
"-DbaseUrl=${BASE_URL}"
"-DremoteBrowser=${REMOTE_BROWSER}"
```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/logo/allure.svg" width="25"/> Allure [отчет](https://jenkins.autotests.cloud/job/C34-Vicktalina-unit14/4/allure/)
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshot/allure_report.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screenshot/allure_report_test.png" width="850">  
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/screenshot/allure_report_graphs1.png" width="850">

<img title="Allure Graphics" src="images/screenshot/allure_report_graphs2.png" width="850">  
</p>

____

<a id="telegram"></a>
## <img alt="Allure" height="25" src="images/logo/telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshot/telegram_alert.png" width="550">  
</p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/logo/selenoid.svg" width="25"/> Пример видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="images/video/video1.gif" width="550"  alt="video">   
</p>

