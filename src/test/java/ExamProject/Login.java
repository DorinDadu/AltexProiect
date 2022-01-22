package ExamProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

    public WebDriver driver;

    @Test

    public void loginTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://altex.ro/");
        driver.manage().window().maximize();

        WebElement contElement = driver.findElement(By.xpath("//*[text()='Cont']"));
        contElement.click();

        WebElement emailElement = driver.findElement(By.cssSelector("input[placeholder='Introdu adresa de email']"));
        String emailvalue = "dorinP@yahoo.com";
        emailElement.sendKeys(emailvalue);

        WebElement parolalEment = driver.findElement(By.cssSelector("input[placeholder='Parola']"));
        String passwordvalue = "44d22";
        parolalEment.sendKeys(passwordvalue);

        WebElement autentificareElement = driver.findElement(By.xpath("//*[text()='Autentificare']"));
        autentificareElement.click();
        driver.close();


    }
}
