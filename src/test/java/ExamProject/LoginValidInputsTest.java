package ExamProject;

import Baza.SharedData;
import Pages.LoginPage;
import org.junit.Test;

public class LoginValidInputsTest extends SharedData {
    public LoginPage loginPage;

    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);

        loginPage.clickCont();
        loginPage.fillEmail("DorinP@dogmail.com");
        loginPage.fillPassword("444Dadu222");
        loginPage.clickSubmit();

    }
}
