package by.itacademy.ivanchikov;

import by.itacademy.ivanchikov.driver.MyDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static by.itacademy.ivanchikov.driver.MyDriver.getDriver;

public class ArrayListTest extends BaseTest {
    private String menuItonLocator = "//div[@class='mainmenu']/ul/li";

    @Test
    public void findMenuItonLocator() {
        MyDriver.getDriver().get("https://www.pizzatempo.by/");
        List<WebElement> menuItems = getDriver().findElements(By.xpath(menuItonLocator));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<String> menuItems2 = new ArrayList<>();
        for (int i = 0; i < menuItems.size(); i++) {
            menuItems.get(i).getText();
            System.out.println(menuItems.get(i).getText());
        }
        List<String> expectedMenuItemsList = new ArrayList<>();
        expectedMenuItemsList.add("ПИЦЦА");
        expectedMenuItemsList.add("АКЦИИ");
        expectedMenuItemsList.add("БУРГЕРЫ, ЗАКУСКИ, ФРИ");
        expectedMenuItemsList.add("САЛАТЫ, СУПЫ, ХЛЕБ");
        expectedMenuItemsList.add("ГОРЯЧИЕ БЛЮДА");
        expectedMenuItemsList.add("НАПИТКИ");
        expectedMenuItemsList.add("ДЕСЕРТЫ");
        expectedMenuItemsList.add("ДЕТСКОЕ МЕНЮ");
        expectedMenuItemsList.add("ПРИБОРЫ");
        Assertions.assertEquals(expectedMenuItemsList, menuItems2);

    }

}
