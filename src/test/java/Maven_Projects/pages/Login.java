package Maven_Projects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;

    By inputUserName = By.id("user-name");
    By inputPassword = By.id("password");
    By btnLogin = By.className("btn_action");
    By title = By.cssSelector("title");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String strUserName){
        driver.findElement(inputUserName).sendKeys(strUserName);
    }

    public void setPassword(String strPassword){
        driver.findElement(inputPassword).sendKeys(strPassword);
    }

    public void clickLogin(){
        driver.findElement(btnLogin).click();
    }

    public String getLoginTitle(){
        return driver.getTitle();
    }

    public void Login(String strUserName,String strPassword){
        this.setUserName(strUserName);
        this.setPassword(strPassword);
        this.clickLogin();
    }

}
