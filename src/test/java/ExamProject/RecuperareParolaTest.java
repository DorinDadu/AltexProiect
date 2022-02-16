package ExamProject;

import Baza.SharedData;
import Pages.LoginPage;
import Pages.RecuperareParolaPage;
import org.junit.Test;

public class RecuperareParolaTest extends SharedData {
    public LoginPage loginPage;
    public RecuperareParolaPage recuperareParolaPage;

    @Test
    public void recuperareparolaTest(){
        loginPage = new LoginPage(driver);
        recuperareParolaPage = new RecuperareParolaPage(driver);

        loginPage.clickCont();
        recuperareParolaPage.recuperareparola();
        recuperareParolaPage.fillEmail("DorinP@dogmail.com");
        recuperareParolaPage.clickTrimite();

    }
}
