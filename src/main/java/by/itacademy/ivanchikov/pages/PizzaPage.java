package by.itacademy.ivanchikov.pages;

import by.itacademy.ivanchikov.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzaPage {
    private String inputButtonPizza = " //div[@ class='mainmenu']//span[text()='Пицца']  ";
    private String orderPizzaButton = "//*[@id=\"1\"]/div/div[2]/div[3]/div[3]/button/span/span";
    private String orderBtnPizza = "//div[@ class='popup']//button[text()='Заказ']";
    private String cartButton = "//*[@id=\"basket_placeholder\"]/div/div/div[1]/div[1]/a/div";
    private String textPlacingOrder = "//*[text()='Оформление заказа']";

    private WebDriver driver;

    public PizzaPage() {
        driver= MyDriver.getDriver();}
        public void openHomePage(){
            driver.get("https://terrapizza.by/");
    }

    public void clickInputButtonPizza() {
        driver.findElement(By.xpath(inputButtonPizza)).click();
    }

    public void clickorderPizzaButton() {
        driver.findElement(By.xpath(orderPizzaButton)).click();
    }

    public void clickorderBtnPizza() {
        driver.findElement(By.xpath(orderBtnPizza)).click();
    }

    public void clickcartButton() {
        driver.findElement(By.xpath(cartButton)).click();
    }

    public String gettextPlacingOrder() {
        return driver.findElement(By.xpath(textPlacingOrder)).getText();
        }
}

