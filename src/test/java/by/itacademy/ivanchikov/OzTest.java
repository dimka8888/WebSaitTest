package by.itacademy.ivanchikov;

import by.itacademy.ivanchikov.domain.User;
import by.itacademy.ivanchikov.driver.MyDriver;
import by.itacademy.ivanchikov.pages.OzPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class OzTest extends BaseTest {
    @BeforeEach
    public void start() {
        WebDriver driver = MyDriver.getDriver();
        driver.get("https://oz.by/");
        OzPage ozpage = new OzPage(driver);
        ozpage.clickLinkEnter();
    }

    @Test
    public void testLoginFormValidValuesUserDoesNotExist() throws InterruptedException {
        OzPage ozpage = new OzPage(MyDriver.getDriver());
        ozpage.clickLinkEmailLoginForm();
        ozpage.sendKeysInputEmail("getRandomNoCorrectEmail");
        ozpage.sendKeysInputPassword(User.getRandomPassvord());
        ozpage.clickButtonEnter();
        Thread.sleep(2000);
        Assertions.assertEquals("Адрес электронной почты не зарегистрирован. Зарегистрироваться", ozpage.getTextErrorMessageEmailDoesNotExist());
    }

    @Test
    public void testLoginFormTextEnterExists() throws InterruptedException {
        OzPage ozpage = new OzPage(MyDriver.getDriver());
        Assertions.assertEquals("Вход", ozpage.getTextEnterLoginForm());
        Thread.sleep(2000);
        MyDriver.getDriver().quit();
    }

}

