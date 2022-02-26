package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class InregistrareContPage extends BasePage {

    public InregistrareContPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div>a[href='https://altex.ro/cont/intra/']")
    private WebElement clickInregistrareElement;
    @FindBy(css = "section>form>div>input[name='first_name']")
    private WebElement firstNameElement;
    @FindBy(css = "section>form>div>input[name='last_name']")
    private WebElement lastNameElement;
    @FindBy(css = "section>form>div>input[name='email']")
    private WebElement emailElement;
    @FindBy(css = "section>form>div>input[name='telephone']")
    private WebElement telefonelement;
    @FindBy(xpath = "//*[@id=\"notice-cookie-block\"]/div/button")
    private WebElement acceptcokieElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/div[1]/section[1]/form/div[5]/input")
    private WebElement passwordElement;
    @FindBy(css = "[name='password_confirm']")
    private WebElement confirmPasswordElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/div[1]/section[1]/form/div[7]/label/span[1]")
    private WebElement termenesiconditiiElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/div[1]/section[1]/form/div[8]/label/span[1]")
    private WebElement newsletterElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/div[1]/section[1]/form/div[10]/button/span/span")
    private WebElement submitElement;


    public void clickInregistrare() {
        elementMethods.clickElement(clickInregistrareElement);
    }

    public void fillFirstName(String value) {
        elementMethods.fillElement(firstNameElement, value);
    }

    public void fillLastName(String value) {
        elementMethods.fillElement(lastNameElement, value);
    }

    public void fillEmail(String value) {
        elementMethods.fillElement(emailElement, value);
    }

    public void fillTelefon(String value) {
        elementMethods.fillElement(telefonelement, value);
    }

    public void clickAcceptCokie() {
        elementMethods.clickElement(acceptcokieElement);
    }

    public void fillpassword(String value) {
        elementMethods.fillElement(passwordElement, value);
    }

    public void fillConfirmpassword(String value) {
        elementMethods.fillElement(confirmPasswordElement, value);
    }

    public void clickTermenesiConditii() {
        elementMethods.clickElement(termenesiconditiiElement);
    }

    public void clickNewsLetter() {
        elementMethods.clickElement(newsletterElement);
    }

    public void clickSubmit() {
        elementMethods.clickElement(submitElement);
    }

    public void inregistrareContValidProcess(HashMap<String, String> inputData) {
        clickInregistrare();
        fillFirstName(inputData.get("firstName"));
        fillLastName(inputData.get("lastName"));
        fillEmail(inputData.get("email"));
        fillTelefon(inputData.get("telefon"));
        clickAcceptCokie();
        fillpassword(inputData.get("password"));
        fillConfirmpassword(inputData.get("confirmPassword"));
        clickTermenesiConditii();
        clickNewsLetter();
        clickSubmit();


    }


}
