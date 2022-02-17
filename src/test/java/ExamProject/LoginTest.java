package ExamProject;

import Baza.SharedData;
import Pages.LoginPage;
import org.junit.Test;

public class LoginTest extends SharedData {
    public LoginPage loginPage;

    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);

        loginPage.clickCont();
        loginPage.loginValidprocess("DorinP@dogmail.com", "444Dadu222");

    }
}
