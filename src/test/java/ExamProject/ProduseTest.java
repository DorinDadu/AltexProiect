package ExamProject;

import Baza.Hooks;
import Help.ElementMethods;
import Pages.CautaProdusPage;
import Pages.ProdusePage;
import Pages.RevenireinSitePage;
import org.junit.Test;

public class ProduseTest extends Hooks {
    public ProdusePage produsePage;
    public CautaProdusPage cautaProdusPage;
    public RevenireinSitePage revenireinSitePage;
    public ElementMethods elementMethods;


    @Test

    public void produseTest() {

        produsePage = new ProdusePage(getDriver());
        cautaProdusPage = new CautaProdusPage(getDriver());
        revenireinSitePage = new RevenireinSitePage(getDriver());
        elementMethods = new ElementMethods(getDriver());


        revenireinSitePage.clickBackinSite();
        produsePage.produse();
        produsePage.telefoaneTablete();
        produsePage.telefoane();
        produsePage.telefoaneOption(4);
        produsePage.acceptcookie();
        produsePage.scrollBy();
        produsePage.addtoCart();
        cautaProdusPage.checkCart();
        cautaProdusPage.cleanthecart();


    }

}

