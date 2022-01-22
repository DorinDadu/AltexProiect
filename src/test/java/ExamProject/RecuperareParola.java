package ExamProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RecuperareParola {

    public WebDriver driver;

    @Test

    public void recoverPass(){

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://altex.ro/cont/parola-uitata/");
        driver.manage().window().maximize();

        WebElement contElement = driver.findElement(By.xpath("//*[text()='Cont']"));
        contElement.click();


        WebElement emailElement= driver.findElement(By.cssSelector("form>input[name='email']"));
        String email="dorinP@yahoo.com";
        emailElement.sendKeys(email);



    }
}
