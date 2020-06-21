package airbnbTestHomePage;

import airbnbHomePage.SignUpPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSignUpPage extends WebAPI {
    SignUpPage signUpPage;
    public void getInitElements(){
        signUpPage= PageFactory.initElements(driver,SignUpPage.class);
    }
   @Test(enabled = false)
    public void testsignUp1() throws InterruptedException {
        getInitElements();
        signUpPage.signUp1();
   }
}
