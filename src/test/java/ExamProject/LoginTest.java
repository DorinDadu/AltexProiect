package ExamProject;

import Baza.Hooks;
import Pages.LoginPage;
import org.junit.Test;

public class LoginTest extends Hooks {
    public LoginPage loginPage;

    @Test
    public void loginTest() {
        loginPage = new LoginPage(getDriver());

        loginPage.loginValidprocess(inputData);
    }
}
