package by.itacademy.ivanchikov;

import by.itacademy.ivanchikov.pages.RwByPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RwByTest extends BaseTest {
    @BeforeEach
    public void start() throws InterruptedException {
        RwByPage rwByPage = new RwByPage();
        rwByPage.openHomePage();
        rwByPage.clickLinkPersonalAccount();
        Thread.sleep(2000);
    }

    @Test
    public void testAuthorizationFormExists() {
        RwByPage rwByPage = new RwByPage();
        Assertions.assertEquals("Авторизация", rwByPage.getTextAuthorizationLoginForm());
    }

    @Test
    public void testAuthorizationFormEmptyValues() {
        RwByPage rwByPage = new RwByPage();
        rwByPage.clickButtonSubmitLoginForm();
        Assertions.assertEquals("Заполните поле", rwByPage.getTextErrorMessageEmailLoginForm());
        Assertions.assertEquals("Заполните поле", rwByPage.getTextErrorMessagePasswordLoginForm());
    }

    @Test
    public void testAuthorizationFormEmptyPassword() {
        RwByPage rwByPage = new RwByPage();
        rwByPage.sendKeysInputEmailLoginForm("dmitry@mail.ru");
        rwByPage.clickButtonSubmitLoginForm();
        Assertions.assertEquals("Заполните поле", rwByPage.getTextErrorMessagePasswordLoginForm());
    }

    @Test
    public void testAuthorizationFormValidValuesUserDoesNotExist() throws InterruptedException {
       RwByPage rwByPage=new RwByPage();
        rwByPage.sendKeysInputEmailLoginForm("dmitry@mail.ru");
        rwByPage.sendKeysInputPasswordLoginForm("Test123");
        rwByPage.clickButtonSubmitLoginForm();
        Thread.sleep(2000);
        Assertions.assertEquals("Пользователь не найден", rwByPage.getTextErrorMessageWrongCredentials());
    }

}

