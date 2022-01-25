package ExamProject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CautaProdus {

    public WebDriver driver;

    @Test

    public void search(){

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://altex.ro/");
        driver.manage().window().maximize();

        WebElement cautaprodusElement=driver.findElement(By.cssSelector("input[placeholder='Cauta produsul dorit']"));
        cautaprodusElement.click();
        cautaprodusElement.sendKeys("biciclete");
        cautaprodusElement.sendKeys(Keys.ENTER);

    }
}
