package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProdusePage extends BasePage{


    public ProdusePage(WebDriver driver) {super(driver);}


    @FindBy(css = "a[href='#produse']")
    private WebElement produseElement;
    @FindBy(css = "a[href='/telefoane-tablete/cpl/']")
    private WebElement telefoanetableteElement;
    @FindBy(css = "a[href='https://altex.ro/telefoane/cpl/']")
    private WebElement telefoaneElement;
    @FindBy(xpath = "//*[@id=\"notice-cookie-block\"]/div/button/span/span")
    private WebElement acceptcookieElement;
    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/main/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div/button/span/span")
    private WebElement addtoCartElement;

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
        elementMethods.waitElement(addtoCartElement);
        elementMethods.clickElement(addtoCartElement);
    }

    public void acceptcookie(){
        elementMethods.clickElement(acceptcookieElement);
    }

    public void scrollBy(){
        elementMethods.scrollElement("window.scrollBy(0,400)");
    }


}
