package ExamProject;

import Baza.Hooks;
import Pages.CautaProdusPage;
import org.junit.Test;

public class CautaProdusTest extends Hooks {
    public CautaProdusPage cautaProdusPage;

    @Test
    public void cautaprodusTest() {
        cautaProdusPage = new CautaProdusPage(getDriver());
        cautaProdusPage.cautaProduseProcess();

    }

}