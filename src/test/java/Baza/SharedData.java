package Baza;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SharedData {

    public WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://altex.ro/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }
}
