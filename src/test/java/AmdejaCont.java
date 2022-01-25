import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmdejaCont {


    public WebDriver driver;

    @Test

    public void amCont() {


        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://altex.ro/cont/intra/");
        driver.manage().window().maximize();

        WebElement emailElement= driver.findElement(By.cssSelector("section>form>div>input[autocomplete='username']"));
        emailElement.click();
        String email="dorinP@yahoo.com";
        emailElement.sendKeys(email);

        WebElement passwordElement= driver.findElement(By.cssSelector("section>form>div>input[autocomplete='current-password']"));
        passwordElement.click();
        String password="44d22";
        passwordElement.sendKeys(password);

        WebElement submitElement=driver.findElement(By.xpath("//*[@id=\"section-login\"]/form/div[3]/button/span/span"));
        submitElement.click();
        driver.close();

    }
}
