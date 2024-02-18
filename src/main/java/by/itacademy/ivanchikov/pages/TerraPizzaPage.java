package by.itacademy.ivanchikov.pages;

import by.itacademy.ivanchikov.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TerraPizzaPage {
    private String MenuButton = "//li[@class='main-menu__item']";
    private String PizzaMenuButton = "//div[@class='menu-cats-list-item'][9]//span[text()='Пицца']";
    private String AddToCartButton = "//div[@class='main-index-menu-364']//div[@class='cart-button']";
    private String DrinksButton = "//ul[@class='menu-navigation__main active']//a[text()='Бар']";
    private String AmericanoOrderButton = "//div[@class='main-index-menu-496']//div[@class='cart-button']";
    private String CarButton = "//div[@class='shopping-cart-btn page-cap__shopping-cart-btn shopping-cart-btn_scroll']";
    private String PizzaMargherita = "basket-el-0";//поиск по ид
    private String CoffeeAmericano = "  basket-el-1";//поиск по ид
    private WebDriver driver;

    public TerraPizzaPage() {
        this.driver = MyDriver.getDriver();
    }
    public void openHomePage(){
        driver.get("https://terrapizza.by/");
    }
    public void clickMenuButton() {
        driver.findElement(By.xpath(MenuButton)).click();
    }
    public void clickPizzaMenuButton() {
        driver.findElement(By.xpath(PizzaMenuButton)).click();
    }
    public void clickAddToCartButton() {
        driver.findElement(By.xpath(AddToCartButton)).click();
    }
    public void clickDrinksButton() {
        driver.findElement(By.xpath(DrinksButton)).click();
    }
    public void clickAmericanoOrderButton() {
        driver.findElement(By.xpath(AmericanoOrderButton)).click();
    }
    public void clickCarButton() {
        driver.findElement(By.xpath(CarButton)).click();
    }
    public String TextPizzaMargherita() {
        return driver.findElement(By.id(PizzaMargherita)).getText();
    }
    public String TextCoffeeAmericano() {
        return driver.findElement(By.id(CoffeeAmericano)).getText();
    }
}
