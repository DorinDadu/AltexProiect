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
        driver.get("https://altex.ro/cont/intra/");
        driver.manage().window().maximize();


        WebElement firstNameElement= driver.findElement(By.cssSelector("section>form>div>input[name='first_name']"));
        firstNameElement.click();
        String firstName="Dorin";
        firstNameElement.sendKeys(firstName);



        WebElement lastNameElement= driver.findElement(By.cssSelector("section>form>div>input[name='last_name']"));
        lastNameElement.click();
        String lastName="Puscasu";
        lastNameElement.sendKeys(lastName);

        WebElement emailElement= driver.findElement(By.cssSelector("section>form>div>input[name='email']"));
        emailElement.click();
        String email="dorinP@yahoo.com";
        emailElement.sendKeys(email);

        WebElement telefonElement= driver.findElement(By.cssSelector("section>form>div>input[name='telephone']"));
        telefonElement.click();
        String telefon="0740060532";
        telefonElement.sendKeys(telefon);

        //WebElement passwordElement= driver.findElement();
        //passwordElement.click();
        //String password="Alibaba_40";
        //passwordElement.sendKeys(password);




    }

}
