package Maven_Projects;

import static org.junit.Assert.assertTrue;

import Maven_Projects.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class AppTest 
{
    WebDriver driver;
    Login objLogin;
    Store objStore;
    ItemDetails objItemDetails;
    Cart objCart;
    Checkout objCheckout;
    CheckoutFinish objCheckoutFinish;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testLogin(){
        objLogin = new Login(driver);
        objLogin.Login("standard_user","secret_sauce");
        System.out.println(driver.getTitle());

        objStore = new Store(driver);
        objStore.selectItem();

        objItemDetails = new ItemDetails(driver);
        objItemDetails.addItemToCart();
        objItemDetails.goToCart();

        objCart = new Cart(driver);
        objCart.checkout();

        objCheckout = new Checkout(driver);
        objCheckout.checkout("daniel","velazco","4001");

        objCheckoutFinish = new CheckoutFinish(driver);
        objCheckoutFinish.checkoutFinish();
    }

    @AfterTest
    public void close() {
        driver.quit();
    }
}
