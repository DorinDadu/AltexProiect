package ExamProject;

import Baza.Hooks;
import Help.ElementMethods;
import Pages.CautaProdusPage;
import Pages.RevenireinSitePage;
import org.junit.Test;


public class CautaProdusTest extends Hooks {
    public CautaProdusPage cautaProdusPage;
    public ElementMethods elementMethods;
    public RevenireinSitePage revenireinSitePage;


    @Test
    public void cautaprodusTest() {
        cautaProdusPage= new CautaProdusPage(getDriver());
        elementMethods= new ElementMethods(getDriver());
        revenireinSitePage = new RevenireinSitePage(getDriver());

        revenireinSitePage.clickBackinSite();
        cautaProdusPage.fillsearchfield("Biciclete");
        cautaProdusPage.clickEnter();
        elementMethods.waitImplicitElement(10);
        elementMethods.scrollElement("window.scrollBy(0,700)");
        cautaProdusPage.produseOption(0);
        cautaProdusPage.checkCart();
        cautaProdusPage.cleanthecart();

    }


}