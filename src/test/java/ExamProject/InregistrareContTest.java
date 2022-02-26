package ExamProject;

import Baza.Hooks;
import Help.ElementMethods;
import Pages.InregistrareContPage;
import Pages.LoginPage;
import Pages.RevenireinSitePage;
import org.junit.Test;

public class InregistrareContTest extends Hooks {
    public InregistrareContPage inregistrareContPage;
    public LoginPage loginPage;
    public ElementMethods elementMethods;
    public RevenireinSitePage revenireinSitePage;


    @Test
    public void inregistrarecontTest() {
        inregistrareContPage = new InregistrareContPage(getDriver());
        loginPage = new LoginPage(getDriver());
        elementMethods = new ElementMethods(getDriver());
        revenireinSitePage = new RevenireinSitePage(getDriver());

        revenireinSitePage.clickBackinSite();
        loginPage.clickCont();
        inregistrareContPage.inregistrareContValidProcess(inputData);


    }

}
