package ExamProject;

import Baza.Hooks;
import Pages.LoginPage;
import Pages.RecuperareParolaPage;
import org.junit.Test;

public class RecuperareParolaTest extends Hooks {

    public LoginPage loginPage;
    public RecuperareParolaPage recuperareParolaPage;

    @Test
    public void recuperareparolaTest() {
        loginPage = new LoginPage(getDriver());
        recuperareParolaPage = new RecuperareParolaPage(getDriver());

        loginPage.clickCont();
        recuperareParolaPage.recuperareparolaProcess(inputData);
    }
}
