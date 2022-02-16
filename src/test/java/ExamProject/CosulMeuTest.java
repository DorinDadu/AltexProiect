package ExamProject;

import Baza.SharedData;
import Pages.CosulmeuPage;
import org.junit.Test;


public class CosulMeuTest extends SharedData {
    public CosulmeuPage cosulmeuPage;

    @Test
    public void cosulmeuTest(){
        cosulmeuPage = new CosulmeuPage(driver);

        cosulmeuPage.cosulMeu();



    }
}
