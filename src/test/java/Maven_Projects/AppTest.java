package Maven_Projects;

import static org.junit.Assert.assertTrue;

import Maven_Projects.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;

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

    @BeforeClass
    @Parameters({"app"})
    public void setup(String app){
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.saucedemo.com/");
        driver.get(app);
    }

    @Test(priority = 1)
    @Parameters({"user", "pass"})
    public void login(String user, String pass) {
        objLogin = new Login(driver);
        //objLogin.Login("standard_user", "secret_sauce");
        objLogin.Login(user, pass);
        System.out.println(driver.getTitle());
    }

    @Test(priority = 2)
    public void selectItemFromStore(){
        objStore = new Store(driver);
        objStore.selectItem();
    }

    @Test(priority = 3)
    public void addItem_goToCart(){
        objItemDetails = new ItemDetails(driver);
        objItemDetails.addItemToCart();
        objItemDetails.goToCart();
    }

    @Test(priority = 4)
    public void checkout(){
        objCart = new Cart(driver);
        objCart.checkout();
    }

    @Test(priority = 5)
    @Parameters({"firstName","lastName","zipCode"})
    public void setCheckoutData(String firstName, String lastName, String zipCode){
        objCheckout = new Checkout(driver);
        objCheckout.checkout(firstName,lastName,zipCode);
    }

    @Test(priority = 6)
    public void checkoutFinish(){
        objCheckoutFinish = new CheckoutFinish(driver);
        objCheckoutFinish.checkoutFinish();
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
}
