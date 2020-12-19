package citiBankTestRunner;

import common.WebAPI;
import myAccount.MyCitiBankPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CitiBankTests extends WebAPI {
    MyCitiBankPage citibank;
    public void init(){
        citibank= PageFactory.initElements(driver,MyCitiBankPage.class);
    }
    @BeforeMethod
    public void setFindAtm(){
        init();
        citibank.findAtm();
    }
    @Test(priority=1)
    public void setLocationTest() {
        citibank.clickSignOn();
    }
    @Test(priority=2)
    public void checkUserNameTest(){
        citibank.clickSignOn();
        citibank.checkUserName();
    }
    @Test(priority=3)
    public void checkPassWordTest() {
        citibank.clickSignOn();
        citibank.checkUserName();
        citibank.checkpassWord();
    }
    @Test(priority=4)
    public void signInTest(){
        citibank.clickSignOn();
        citibank.checkUserName();
        citibank.checkpassWord();
        citibank.signIn();
    }
}
