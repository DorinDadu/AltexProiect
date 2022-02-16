package Pages;

import Help.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CautaProdusPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public CautaProdusPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "input[placeholder='Cauta produsul dorit']")
    public WebElement searchElement;
    @FindBy(css = "div>div>[type='submit']")
    public WebElement enterElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/ul/li/div[1]/div/div[2]/div[3]/a/span/span")
    public WebElement checkthecartElement;
    @FindBy(css = "span[class='pl-1 -tracking-0.29']")
    public WebElement cleanthecartElement;

    public void fillsearchfield(String value){
        elementMethods.fillElement(searchElement, value);
    }

    public void clickEnter(){
        elementMethods.sendEnter(enterElement);
    }

    public void produseOption(){
        List<WebElement> produseOption = driver.findElements(By.xpath("//ul[@class='Products  flex flex-wrap relative -mx-1 sm:-mx-2']/li/a/div[6]/button"));
        produseOption.get(0).click();
    }
    public void checkCart(){
        elementMethods.clickElement(checkthecartElement);
    }
    public void cleanthecart(){
        elementMethods.clickElement(cleanthecartElement);
    }


}



