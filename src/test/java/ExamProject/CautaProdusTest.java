package ExamProject;

import Baza.Hooks;
import Help.ElementMethods;
import Pages.CautaProdusPage;
import org.junit.Test;


public class CautaProdusTest extends Hooks {
    public CautaProdusPage cautaProdusPage;
    public ElementMethods elementMethods;

    @Test
    public void cautaprodusTest() {
        cautaProdusPage = new CautaProdusPage(getDriver());
        elementMethods = new ElementMethods(getDriver());

        cautaProdusPage.cautaProduseProcess();

    }

}