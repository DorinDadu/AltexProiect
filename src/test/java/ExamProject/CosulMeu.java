package ExamProject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CosulMeu {
    public WebDriver driver;

    @Test

    public void MyBasket(){

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://altex.ro/");
        driver.manage().window().maximize();

        WebElement contElement = driver.findElement(By.xpath("//*[text()='Cosul meu']"));
        contElement.click();
        driver.close();
    }
}
