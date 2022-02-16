package ExamProject;

import Baza.SharedData;
import Help.ElementMethods;
import Pages.InregistrareContPage;
import Pages.LoginPage;
import org.junit.Test;

public class InregistrareContTest extends SharedData {
      public InregistrareContPage inregistrareContPage;
      public LoginPage loginPage;
      public ElementMethods elementMethods;


    @Test
    public void inregistrarecontTest() {
        inregistrareContPage = new InregistrareContPage(driver);
        loginPage = new LoginPage(driver);
        elementMethods= new ElementMethods(driver);

        loginPage.clickCont();
        inregistrareContPage.clickInregistrare();
        inregistrareContPage.fillFirstName("Dorin");
        inregistrareContPage.fillLastName("P");
        inregistrareContPage.fillEmail("DorinP@dogmail.com");
        inregistrareContPage.fillTelefon("0740060532");
        elementMethods.scrollElement("window.scrollBy(0,700)");
        inregistrareContPage.clickAcceptCokie();
        inregistrareContPage.clickNewsLetter();
        inregistrareContPage.fillpassword("444Dadu222");
        inregistrareContPage.fillConfirmpassword("444Dadu222");
        inregistrareContPage.clickTermenesiConditii();
        inregistrareContPage.clickSubmit();


    }

}
