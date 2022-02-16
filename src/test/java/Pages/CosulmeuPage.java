package Pages;

import Help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CosulmeuPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public CosulmeuPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "a[href='https://altex.ro/cos-cumparaturi/']")
    public WebElement cosulMeuElement;

    public void cosulMeu(){
        elementMethods.clickElement(cosulMeuElement);
    }
}
