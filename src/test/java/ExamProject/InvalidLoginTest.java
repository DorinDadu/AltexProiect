package ExamProject;

import Baza.Hooks;
import Pages.LoginPage;
import org.junit.Test;

public class InvalidLoginTest extends Hooks {
    public LoginPage loginPage;

    @Test
    public void invalidLogin() {
        loginPage = new LoginPage(getDriver());

        loginPage.invalidLoginprocess(inputData);

    }

}
