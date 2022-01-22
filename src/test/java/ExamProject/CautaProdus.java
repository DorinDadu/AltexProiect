package ExamProject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CautaProdus {

    public WebDriver driver;

    @Test

    public void search(){

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://altex.ro/");
        driver.manage().window().maximize();

        WebElement cautaprodusElement=driver.findElement(By.cssSelector("input[placeholder='Cauta produsul dorit']"));
        String cautaProdus="Biciclete";
        cautaprodusElement.sendKeys(cautaProdus);
        driver.close();
    }
}
