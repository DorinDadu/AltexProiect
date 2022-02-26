package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;

public class RecuperareParolaPage extends BasePage {


    public RecuperareParolaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='https://altex.ro/cont/parola-uitata/']")
    private WebElement recuperareParolaElement;
    @FindBy(css = "form>input[name='email']")
    private WebElement emailElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/main/div/form/button")
    private WebElement trimiteElement;

    public void recuperareparola() {
        elementMethods.clickElement(recuperareParolaElement);
    }

    public void fillEmail(String value) {
        elementMethods.fillElement(emailElement, value);
    }

    public void clickTrimite() {
        elementMethods.clickElement(trimiteElement);
    }

    public void recuperareparolaProcess(HashMap<String, String> inputData) {
        recuperareparola();
        fillEmail(inputData.get("email"));
        clickTrimite();
    }
}
