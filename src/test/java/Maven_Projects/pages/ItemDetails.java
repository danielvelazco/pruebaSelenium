package Maven_Projects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemDetails {
    WebDriver driver;

    By btnAddToCart = By.cssSelector("button[class='btn_primary btn_inventory']");
    By btnCart = By.className("shopping_cart_container");
    By price = By.cssSelector("div[class='inventory_details_price']");

    public ItemDetails(WebDriver driver){
        this.driver = driver;
    }

    public void clickBtnAddToCart(){
        driver.findElement(btnAddToCart).click();
    }

    public void clickBtnCart() {
        driver.findElement(btnCart).click();
    }

    public void addItemToCart(){
        this.clickBtnAddToCart();
    }

    public boolean priceShown(){
        return driver.findElement(price).isDisplayed();
    }

    public void goToCart(){
        this.clickBtnCart();
    }
}
