package by.itacademy.ivanchikov;

import by.itacademy.ivanchikov.driver.MyDriver;
import by.itacademy.ivanchikov.pages.DominosPizzaPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DominisPizzaTest extends BaseTest {
    @Test
    public void start() throws InterruptedException {
        MyDriver.quitDriver();
        DominosPizzaPage dominosPizzaPage = new DominosPizzaPage();
        dominosPizzaPage.openHomePage();
        dominosPizzaPage.clickclosingBanner();
        dominosPizzaPage.clickUseOfSookies();
        dominosPizzaPage.clickpizzaSelectionButton();
        dominosPizzaPage.clickmargheritaPizzaOrderButton();
        dominosPizzaPage.clickcartButton();
        dominosPizzaPage.getCheckout();
        Thread.sleep(4000);
        Assertions.assertEquals("Оформить заказ", dominosPizzaPage.getCheckout());
    }
}
