package ExamProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InregistrareCont {

    public WebDriver driver;

    @Test

    public void register(){


        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://altex.ro/");
        driver.manage().window().maximize();

        WebElement contElement = driver.findElement(By.xpath("//*[text()='Cont']"));
        contElement.click();

        WebElement inregistrareElement = driver.findElement(By.xpath("//*[text()='Inregistrare']"));
        inregistrareElement.click();

       //WebElement firstNameElement= driver.findElement();
        //firstNameElement.click();
        //String firstName="Dorin";
        //firstNameElement.sendKeys(firstName);

        //WebElement lastNameElement= driver.findElement();
        //lastNameElement.click();
        //String lastName="P";
        //lastNameElement.sendKeys(lastName);

        //WebElement emailElement= driver.findElement();
        //emailElement.click();
        //String email="dorinP@yahoo.com";
        //emailElement.sendKeys(email);




    }

}
