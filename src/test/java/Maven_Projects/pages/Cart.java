package Maven_Projects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {
    WebDriver driver;

    By btnCheckout = By.cssSelector("a[class='btn_action checkout_button']");

    public Cart(WebDriver driver){
        this.driver = driver;
    }

    public void clickBtnCheckout(){
        driver.findElement(btnCheckout).click();
    }

    public void checkout(){
        this.clickBtnCheckout();
    }
}
