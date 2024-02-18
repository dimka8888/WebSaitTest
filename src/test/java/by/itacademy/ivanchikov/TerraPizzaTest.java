package by.itacademy.ivanchikov;

import by.itacademy.ivanchikov.pages.TerraPizzaPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TerraPizzaTest extends BaseTest {
    @BeforeEach
    @Test
    public void start() throws InterruptedException {
        TerraPizzaPage terraPizzaPage = new TerraPizzaPage();
        terraPizzaPage.openHomePage();
        terraPizzaPage.clickMenuButton();
        Thread.sleep(5500);
        terraPizzaPage.clickPizzaMenuButton();
        Thread.sleep(10000);
        terraPizzaPage.clickAddToCartButton();
        Thread.sleep(10000);
        terraPizzaPage.clickDrinksButton();
        Thread.sleep(6500);
        terraPizzaPage.clickAmericanoOrderButton();
        Thread.sleep(6500);
        terraPizzaPage.clickCarButton();
        Thread.sleep(6500);
        terraPizzaPage.TextPizzaMargherita();
        terraPizzaPage.TextCoffeeAmericano();
        Assertions.assertEquals(terraPizzaPage.TextPizzaMargherita(), terraPizzaPage.TextCoffeeAmericano());
    }
}
