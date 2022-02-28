package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    @FindBy(css = "span[class='pl-1 -tracking-0.29']")
    private WebElement cleanthecartElement;

    public void fillsearchfield(String value) {
        elementMethods.fillElement(searchElement, value);
    }

    public void clickEnter() {
        elementMethods.sendEnter(enterElement);
    }

    public void produseOption(int index) {
        List<WebElement> produseOption = driver.findElements(By.xpath("//ul[@class='Products  flex flex-wrap relative -mx-1 sm:-mx-2']/li/a/div[6]/button"));
        produseOption.get(index).click();
    }

    public void checkCart() {
        elementMethods.clickElement(checkthecartElement);
    }

    public void cleanthecart() {
        elementMethods.clickElement(cleanthecartElement);
    }

    public void scrollBy() {
        elementMethods.scrollElement(0, 400);
    }

    public void cautaProduseProcess() {

        fillsearchfield("Biciclete");
        clickEnter();
        scrollBy();
        elementMethods.waitImplicitElement(60);
        produseOption(0);
        checkCart();
        cleanthecart();
    }


}



