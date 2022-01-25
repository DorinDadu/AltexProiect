import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmuitatParola {

    public WebDriver driver;

    @Test

    public void uitatParola(){

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://altex.ro/cont/intra/");
        driver.manage().window().maximize();

        WebElement amuitatParolaElement= driver.findElement(By.xpath("//*[@id=\"section-login\"]/div/a"));
        amuitatParolaElement.click();




    }
}
