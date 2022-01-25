import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Produse {

    public WebDriver driver;

    @Test

    public void butonProduse() {

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://altex.ro/");
        driver.manage().window().maximize();


        WebElement produseElement= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[2]/ul/li[1]/a/span"));
        produseElement.click();

        WebElement gamingElement= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div[2]/ul/li[1]/ul/li[3]/a"));
        gamingElement.click();





        }
    }


