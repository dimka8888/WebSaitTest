package by.itacademy.ivanchikov.pages;

import by.itacademy.ivanchikov.driver.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DominosPizzaPage {
    private String closingBanner = " //button[@class='custom-button custom-button--transparent custom-button--no-paddings custom-button--size-small custom-modal__close-button'] ";
    private String useOfSookies = "//div[@class='sm-notify-accept']";
    private String pizzaSelectionButton = "//span[@class='horizontal-menu__list-item-title']";
    private String margheritaPizzaOrderButton = "//*[@class='product-card product-card--vertical'][30]//*[text()='В корзину']";
    private String cartButton = "//div[@class='composed-navigation__extra']//span[@class='cart-button__button-text']";
    private String Checkout = "//div[@class='cart-button__mini-bag']//*[text()='Оформить заказ']";
    private WebDriver driver;

    public DominosPizzaPage() {
        this.driver = MyDriver.getDriver();}
        public void openHomePage(){
            driver.get("https://dominos.by/");
        }
        public void clickclosingBanner () {
            driver.findElement(By.xpath(closingBanner)).click();
        }
        public void clickUseOfSookies () {
            driver.findElement(By.xpath(useOfSookies)).click();
        }

        public void clickpizzaSelectionButton () {
            driver.findElement(By.xpath(pizzaSelectionButton)).click();
        }
        public void clickmargheritaPizzaOrderButton () {
            driver.findElement(By.xpath(margheritaPizzaOrderButton)).click();
        }

        public void clickcartButton () {
            driver.findElement(By.xpath(cartButton)).click();
        }

        public String getCheckout () {
            return driver.findElement(By.xpath(Checkout)).getText();

        }
    }

