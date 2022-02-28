package Help;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ElementMethods {

    public WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement element) {
        waitElement(element);
        element.click();

    }

    public void scrollElement(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+x+", "+y+")");
    }

    public void waitImplicitElement(long time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

    }

    public void waitElement(WebElement element) {
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void fillElement(WebElement element, String value) {
        waitElement(element);
        element.sendKeys(value);
    }

    public void validateElementText(WebElement element, String value) {
        waitElement(element);
        String actualmsg = element.getText();
        Assert.assertEquals("textul cautat nu e corect", value, actualmsg);
    }

    public void sendEnter(WebElement element) {
        element.sendKeys(Keys.ENTER);
    }


}





