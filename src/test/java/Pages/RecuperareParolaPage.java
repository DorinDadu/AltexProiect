package Pages;

import Help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecuperareParolaPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public RecuperareParolaPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "a[href='https://altex.ro/cont/parola-uitata/']")
    public WebElement recuperareParolaElement;
    @FindBy(css = "form>input[name='email']")
    public WebElement emailElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/main/div/form/button")
    public WebElement trimiteElement;


    public void recuperareparola(){
        elementMethods.clickElement(recuperareParolaElement);
    }

    public void fillEmail(String value){
        elementMethods.fillElement(emailElement, value);
    }

    public void clickTrimite(){
        elementMethods.clickElement(trimiteElement);
    }
}
