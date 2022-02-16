package Pages;

import Help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InregistrareContPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public InregistrareContPage(WebDriver driver){
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div>a[href='https://altex.ro/cont/intra/']")
    public WebElement clickInregistrareElement;
    @FindBy(css = "section>form>div>input[name='first_name']")
    public WebElement firstNameElement;
    @FindBy(css = "section>form>div>input[name='last_name']")
    public WebElement lastNameElement;
    @FindBy(css = "section>form>div>input[name='email']")
    public WebElement emailElement;
    @FindBy(css = "section>form>div>input[name='telephone']")
    public WebElement telefonelement;
    @FindBy(xpath = "//*[@id=\"notice-cookie-block\"]/div/button")
    public WebElement acceptcokieElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/div[1]/section[1]/form/div[5]/input")
    public WebElement passwordElement;
    @FindBy(css = "[name='password_confirm']")
    public WebElement confirmPasswordElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/div[1]/section[1]/form/div[7]/label/span[1]")
    public WebElement termenesiconditiiElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/div[1]/section[1]/form/div[8]/label/span[1]")
    public WebElement newsletterElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/div[1]/section[1]/form/div[10]/button/span/span")
    public WebElement submitElement;


    public void clickInregistrare(){
        elementMethods.clickElement(clickInregistrareElement);
    }

    public void fillFirstName(String value){
        elementMethods.fillElement(firstNameElement, value);
    }

    public void fillLastName(String value){
        elementMethods.fillElement(lastNameElement, value);
    }

    public void fillEmail(String value){
        elementMethods.fillElement(emailElement, value);
    }

    public void fillTelefon(String value){
        elementMethods.fillElement(telefonelement, value);
    }

    public void clickAcceptCokie(){
        elementMethods.clickElement(acceptcokieElement);
    }

    public void fillpassword(String value){
        elementMethods.fillElement(passwordElement, value);
    }

    public void fillConfirmpassword(String value){
        elementMethods.fillElement(confirmPasswordElement, value);
    }

    public void clickTermenesiConditii(){
        elementMethods.clickElement(termenesiconditiiElement);
    }

    public void clickNewsLetter(){
        elementMethods.clickElement(newsletterElement);
    }

    public void clickSubmit(){
        elementMethods.clickElement(submitElement);
    }



}
