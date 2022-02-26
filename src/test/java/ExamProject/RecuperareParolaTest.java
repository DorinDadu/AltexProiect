package ExamProject;

import Baza.Hooks;
import Pages.LoginPage;
import Pages.RecuperareParolaPage;
import Pages.RevenireinSitePage;
import org.junit.Test;

public class RecuperareParolaTest extends Hooks {

    public LoginPage loginPage;
    public RecuperareParolaPage recuperareParolaPage;
    public RevenireinSitePage revenireinSitePage;

    @Test
    public void recuperareparolaTest() {
        loginPage = new LoginPage(getDriver());
        recuperareParolaPage = new RecuperareParolaPage(getDriver());
        revenireinSitePage = new RevenireinSitePage(getDriver());

        revenireinSitePage.clickBackinSite();
        loginPage.clickCont();
        recuperareParolaPage.recuperareparolaProcess(inputData);
    }
}
