package Maven_Projects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Store {
    WebDriver driver;

    By item = By.xpath("//*[@id=\"item_4_img_link\"]/img");
    By logo = By.cssSelector("div[class='app_logo']");

    public Store(WebDriver driver){
        this.driver = driver;
    }

    public void clickItem(){
        driver.findElement(item).click();
    }

    public boolean checkLogo(){
        return driver.findElement(logo).isDisplayed();
    }

    public void selectItem(){
        this.clickItem();
    }
}
