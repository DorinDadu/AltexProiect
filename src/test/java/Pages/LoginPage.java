package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='https://altex.ro/cont/']")
    private WebElement contElement;
    @FindBy(css = "input[placeholder='Introdu adresa de email']")
    private WebElement emailElement;
    @FindBy(css = "input[placeholder='Parola']")
    private WebElement passwordElement;
    @FindBy(xpath = "//*[text()='Autentificare']")
    private WebElement submitElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[1]/div/div/div[2]/div[2]/div/div/div/form/div[2]/div")
    private WebElement errorMessageElement;

    public void clickCont() {
        elementMethods.clickElement(contElement);
    }

    public void fillEmail(String value) {
        elementMethods.fillElement(emailElement, value);
    }

    public void fillPassword(String value) {
        elementMethods.fillElement(passwordElement, value);
    }

    public void clickSubmit() {
        elementMethods.clickElement(submitElement);
    }

    public void loginValidprocess(HashMap<String, String> inputData) {
        clickCont();
        fillEmail(inputData.get("email"));
        fillPassword(inputData.get("password"));
        clickSubmit();
    }

    public void invalidLoginprocess(HashMap<String, String> inputData) {
        clickCont();
        fillEmail(inputData.get("email"));
        clickSubmit();
        elementMethods.validateElementText(errorMessageElement, inputData.get("errorMsg"));
    }
}
