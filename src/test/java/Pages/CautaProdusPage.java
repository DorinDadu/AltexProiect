package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CautaProdusPage extends BasePage {

    public CautaProdusPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[placeholder='Cauta produsul dorit']")
    private WebElement searchElement;
    @FindBy(css = "div>div>[type='submit']")
    private WebElement enterElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/ul/li/div[1]/div/div[2]/div[3]/a/span/span")
    private WebElement checkthecartElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div[1]/div/div/div[2]/div[1]/a/span[2]")
    private WebElement continuaCumparaturileElement;
    @FindBy(xpath = "//*[@id=\"notice-cookie-block\"]/div/button/span/span")
    private WebElement acceptCokieElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div/button")
    private WebElement addtoCartElement;

    public void fillsearchfield(String value) {
        elementMethods.fillElement(searchElement, value);
    }

    public void clickEnter() {
        elementMethods.sendEnter(enterElement);
    }

    public void produseOption(int index) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[text()='Adauga in cos']")));
        List<WebElement> produseOption = driver.findElements(By.xpath("//h1/..//span[text()='Adauga in cos']"));
        produseOption.get(index).click();
    }

    public void checkCart() {
        elementMethods.clickElement(checkthecartElement);
    }

    public void continuaCumparaturile() {
        elementMethods.clickElement(continuaCumparaturileElement);
    }

    public void bicicleteAdultiOption(int index) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[text()='Adauga in cos']")));
        List<WebElement> produseOption = driver.findElements(By.cssSelector("[class='Product-photoWrapper']"));
        produseOption.get(index).click();

    }

    public void clickAddToCart() {
        elementMethods.clickElement(addtoCartElement);
    }

    public void scrollBy() {
        elementMethods.scrollElement(0, 400);
    }

    public void scrollByAgain() {
        elementMethods.scrollElement(0, 600);
    }

    public void clickAcceptCookie() {
        elementMethods.clickElement(acceptCokieElement);
    }

    public void cautaProduseProcess() {

        fillsearchfield("Biciclete");
        clickEnter();
        scrollBy();
        elementMethods.waitImplicitElement(60);
        produseOption(0);
        continuaCumparaturile();
        fillsearchfield("Biciclete adulti");
        clickEnter();
        scrollByAgain();
        clickAcceptCookie();
        bicicleteAdultiOption(6);
        clickAddToCart();
        checkCart();


    }


}



