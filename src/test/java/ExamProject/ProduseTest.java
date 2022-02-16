package ExamProject;

import Baza.SharedData;
import Pages.CautaProdusPage;
import Pages.ProdusePage;
import org.junit.Test;

public class ProduseTest extends SharedData {
   public ProdusePage produsePage;
   public CautaProdusPage cautaProdusPage;


    @Test

    public void produseTest() {

        produsePage = new ProdusePage(driver);
        cautaProdusPage =new CautaProdusPage(driver);


        produsePage.produse();
        produsePage.telefoaneTablete();
        produsePage.telefoane();
        produsePage.telefoaneOption(4);
        produsePage.acceptcookie();
        produsePage.addtoCart();
        cautaProdusPage.checkCart();
        cautaProdusPage.cleanthecart();


    }

    }

