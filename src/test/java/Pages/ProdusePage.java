package Pages;

import Help.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProdusePage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public ProdusePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='#produse']")
    public WebElement produseElement;
    @FindBy(css = "a[href='/telefoane-tablete/cpl/']")
    public WebElement telefoanetableteElement;
    @FindBy(css = "a[href='https://altex.ro/telefoane/cpl/']")
    public WebElement telefoaneElement;
    @FindBy(xpath = "//*[@id=\"notice-cookie-block\"]/div/button/span/span")
    public WebElement acceptcookieElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div/button")
    public WebElement addtoCartElement;

    public void produse(){
        elementMethods.clickElement(produseElement);
    }

    public void telefoaneTablete(){
        elementMethods.clickElement(telefoanetableteElement);
    }

    public void telefoane(){
        elementMethods.clickElement(telefoaneElement);
    }
    public void telefoaneOption(int index){
        List<WebElement> telefoaneOptions= driver.findElements(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/main/div[2]/div/div[2]/div/ul[2]/li"));
        telefoaneOptions.get(index).click();
    }


    public void addtoCart(){
        elementMethods.clickElement(addtoCartElement);
    }

    public void acceptcookie(){
        elementMethods.clickElement(acceptcookieElement);
    }
}
