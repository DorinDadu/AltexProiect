import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class emailrecuperareParola {

    public WebDriver driver;

    @Test

    public void emailRecuperare(){

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://altex.ro/cont/parola-uitata/");
        driver.manage().window().maximize();

        WebElement emailElement= driver.findElement(By.cssSelector("form>input[name='email']"));
        emailElement.click();
        String email="DorinP@yahoo.com";
        emailElement.sendKeys(email);

        WebElement trimiteElement= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/main/main/div/form/button"));
        trimiteElement.click();
        driver.close();
    }

}