package Pages;

import Help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='https://altex.ro/cont/']")
    public WebElement contElement;
    @FindBy(css = "input[placeholder='Introdu adresa de email']")
    public WebElement emailElement;
    @FindBy(css = "input[placeholder='Parola']")
    public WebElement passwordElement;
    @FindBy(xpath = "//*[text()='Autentificare']")
    public WebElement submitElement;

    public void clickCont(){
        elementMethods.clickElement(contElement);
    }

    public void fillEmail(String value){
        elementMethods.fillElement(emailElement, value);
    }

    public void fillPassword(String value){
        elementMethods.fillElement(passwordElement, value);
    }

    public void clickSubmit(){
        elementMethods.clickElement(submitElement);
    }
}
