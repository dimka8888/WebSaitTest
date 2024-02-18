package by.itacademy.ivanchikov;

import by.itacademy.ivanchikov.driver.MyDriver;
import by.itacademy.ivanchikov.pages.PizzaPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testPizza extends BaseTest {
    @BeforeEach
    @Test
    public void start() throws InterruptedException {
        MyDriver.getDriver();
        PizzaPage pizzaPage=new PizzaPage();
        pizzaPage.clickInputButtonPizza();
        Thread.sleep(3000);
        pizzaPage.clickorderPizzaButton();
        Thread.sleep(3000);
        pizzaPage.clickorderBtnPizza();
        Thread.sleep(2000);
        pizzaPage.clickcartButton();
        Thread.sleep(2000);
        pizzaPage.gettextPlacingOrder();
        Thread.sleep(3000);
        Assertions.assertEquals("Оформление заказа",pizzaPage.gettextPlacingOrder());
    }
}
