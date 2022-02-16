package ExamProject;

import Baza.SharedData;
import Help.ElementMethods;
import Pages.CautaProdusPage;
import org.junit.Test;


public class CautaProdusTest extends SharedData {
    public CautaProdusPage cautaProdusPage;
    public ElementMethods elementMethods;


    @Test
    public void cautaprodusTest() {
        cautaProdusPage= new CautaProdusPage(driver);
        elementMethods= new ElementMethods(driver);

        cautaProdusPage.fillsearchfield("Biciclete");
        cautaProdusPage.clickEnter();
        elementMethods.waitImplicitElement(10);
        elementMethods.scrollElement("window.scrollBy(0,700)");
        cautaProdusPage.produseOption(0);
        cautaProdusPage.checkCart();
        cautaProdusPage.cleanthecart();

    }


}