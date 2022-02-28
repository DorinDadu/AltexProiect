package ExamProject;

import Baza.Hooks;
import Pages.InregistrareContPage;
import Pages.LoginPage;
import org.junit.Test;

public class InregistrareContTest extends Hooks {
    public InregistrareContPage inregistrareContPage;
    public LoginPage loginPage;

    @Test
    public void inregistrarecontTest() {
        inregistrareContPage = new InregistrareContPage(getDriver());
        loginPage = new LoginPage(getDriver());

        loginPage.clickCont();
        inregistrareContPage.inregistrareContValidProcess(inputData);
    }

}
