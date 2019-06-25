package Maven_Projects;

import static org.junit.Assert.assertTrue;

import Maven_Projects.pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class AppTest 
{
    WebDriver driver;
    Login objLogin;

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
    }

    @AfterTest
    public void close() {
        driver.quit();
    }

}
