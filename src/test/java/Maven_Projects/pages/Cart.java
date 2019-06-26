package Maven_Projects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
    WebDriver driver;

    By btnCheckout = By.cssSelector("a[class='btn_action checkout_button']");
    By cartContainer = By.id("cart_contents_container");

    public Cart(WebDriver driver){
        this.driver = driver;
    }

    public void clickBtnCheckout(){
        driver.findElement(btnCheckout).click();
    }

    public void checkout(){
        this.clickBtnCheckout();
    }

    public boolean cartContainer(){
        return driver.findElement(cartContainer).isDisplayed();
    }
}
