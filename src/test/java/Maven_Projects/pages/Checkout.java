package Maven_Projects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
    WebDriver driver;

    By inputFirstName = By.id("first-name");
    By inputLastName = By.id("last-name");
    By inputZipCode = By.id("postal-code");
    By btnContinue = By.cssSelector("input[class='btn_primary cart_button']");

    public Checkout(WebDriver driver){
        this.driver = driver;
    }

    public void setFirstName(String strFirstName){
        driver.findElement(inputFirstName).sendKeys(strFirstName);
    }

    public void setLastName(String strLastName){
        driver.findElement(inputLastName).sendKeys(strLastName);
    }

    public void setZipCode(String strZipCode){
        driver.findElement(inputZipCode).sendKeys(strZipCode);
    }

    public void clickBtnContinue(){
        driver.findElement(btnContinue).click();
    }

    public void checkout(String firstName, String lastName, String zipCode){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setZipCode(zipCode);
        this.clickBtnContinue();
    }
}
