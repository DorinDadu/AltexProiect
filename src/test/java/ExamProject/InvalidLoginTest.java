package ExamProject;

import Baza.Hooks;
import Pages.LoginPage;
import Pages.RevenireinSitePage;
import org.junit.Test;

public class InvalidLoginTest extends Hooks {

    public LoginPage loginPage;
    public RevenireinSitePage revenireinSitePage;

    @Test

    public void invalidLogin(){
        loginPage=new LoginPage(getDriver());
        revenireinSitePage=new RevenireinSitePage(getDriver());

        revenireinSitePage.clickBackinSite();
        loginPage.invalidLoginprocess(inputData);

    }

}
