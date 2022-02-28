package ExamProject;

import Baza.Hooks;
import Pages.ProdusePage;
import org.junit.Test;

public class ProduseTest extends Hooks {
    public ProdusePage produsePage;

    @Test
    public void produseTest() {
        produsePage = new ProdusePage(getDriver());

        produsePage.produseProcess();

    }

}

