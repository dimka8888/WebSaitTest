package by.itacademy.ivanchikov;

import by.itacademy.ivanchikov.pages.KvitkiByPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KvitkiByTest extends BaseTest {
    @BeforeEach
    public void start() throws InterruptedException {
        KvitkiByPage kvitkiByPage = new KvitkiByPage();
        kvitkiByPage.openHomePage();
        kvitkiByPage.clickButtonAcceptCookie();
        kvitkiByPage.clickButtonCloseCircusBanner();
        kvitkiByPage.clickLinkEnter();
        Thread.sleep(2000);
    }

    @Test
    public void testTextEnterLoginFormExists() {
        KvitkiByPage kvitkiByPage = new KvitkiByPage();
        Assertions.assertEquals("Вход", kvitkiByPage.getTextEnterLoginForm());
    }

    @Test
    public void testEmptyEmailLoginForm() {
        KvitkiByPage kvitkiByPage = new KvitkiByPage();
        kvitkiByPage.clickInputEmail();
        kvitkiByPage.clickInputPassword();
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", kvitkiByPage.getTextErrorMessageEmail());
    }

    @Test
    public void testEmptyPasswordLoginForm() {
        KvitkiByPage kvitkiByPage = new KvitkiByPage();
        kvitkiByPage.clickInputPassword();
        kvitkiByPage.clickInputEmail();
        Assertions.assertEquals("Пожалуйста, заполните поле (Пароль)", kvitkiByPage.getTextErrorMessagePassword());
    }

    @Test
    public void testWrongEmailFormatLoginForm() {
        KvitkiByPage kvitkiByPage = new KvitkiByPage();
        kvitkiByPage.sendKeysInputEmail("test");
        kvitkiByPage.clickInputPassword();
        Assertions.assertEquals("Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com", kvitkiByPage.getTextErrorMessageEmailWrongFormat());
    }

    @Test
    public void testEmailSuggestionLoginForm() throws InterruptedException {
        KvitkiByPage kvitkiByPage = new KvitkiByPage();
        kvitkiByPage.sendKeysInputEmail("dmitry@mail.ru");
        Thread.sleep(2000);
        Assertions.assertEquals("Возможно вы имели в виду dmitry@ee.ru ?", kvitkiByPage.getTextEmailSuggestion());
    }

    @Test
    public void testValidValuesWrongCredentialsLoginForm() throws InterruptedException {
        KvitkiByPage kvitkiByPage = new KvitkiByPage();
        kvitkiByPage.sendKeysInputEmail("dmitry@mail.ru");
        kvitkiByPage.sendKeysInputPassword("Test123");
        kvitkiByPage.clickButtonEnterLoginForm();
        Thread.sleep(2000);
        Assertions.assertEquals("Электронная почта или пароль недействительны. Система была обновлена, и в связи с этим мы перешли на вход по электронной почте.", kvitkiByPage.getTextWrongCredentials());
    }

}

