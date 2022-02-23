package Pages;

import Help.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RevenireinSitePage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public RevenireinSitePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div[2]/div[1]/a")
    private WebElement backinSite;

    public void clickBackinSite(){
        elementMethods.clickElement(backinSite);
    }

}
