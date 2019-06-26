package Maven_Projects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckoutFinish {
    WebDriver driver;
    By btnFinish = By.cssSelector("a[class='btn_action cart_button']");
    By checkoutOverview = By.cssSelector("div[class='summary_info_label']");

    public CheckoutFinish(WebDriver driver){
        this.driver = driver;
    }

    public void clickBtnFinish(){
        driver.findElement(btnFinish).click();
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void checkoutFinish(){
        this.scrollDown();
        this.clickBtnFinish();
    }

    public boolean checkoutOverview(){
        return driver.findElement(checkoutOverview).isDisplayed();
    }
}
