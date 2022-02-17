package ExamProject;

import Baza.SharedData;
import Pages.LoginPage;
import org.junit.Test;

public class InvalidLoginTest extends SharedData {

    public LoginPage loginPage;

    @Test

    public void invalidLogin(){
        loginPage=new LoginPage(driver);

        loginPage.clickCont();
        loginPage.invalidLoginprocess("DorinP@dogmail.com", "Acest camp este obligatoriu");

    }

}
