package myaccounttest;

import common.WebAPI;
import myAccount.MyTmobilePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends WebAPI {
    MyTmobilePage cartBn;
    public void initElements() {
        cartBn = PageFactory.initElements(driver, MyTmobilePage.class);
    }
    @BeforeMethod
    public void accountBnt(){
        initElements();
        cartBn.validateMyAccountBtn();
    }
    @Test(priority = 1)
    public void myLoginButton(){
        cartBn.validateLoginButton();
    }
    @Test(priority = 2)
    public void myPhoneNumber() {
        cartBn.validateLoginButton();
        cartBn.enterPhoneOrEmail();
    }
    @Test(priority = 3)
    public void myBillPay()  {
        cartBn.setBillPay();
    }
    @Test(priority = 4)
    public void addLine() {
        cartBn.setAddALine();
    }
    @Test(priority = 6)
    public void doUpgradeTest(){
        cartBn.doUpgrade();
    }
    @Test(priority = 7)
    public void setOrderStatusTest() {
        cartBn.setOrderStatus();
    }
    @Test(priority = 8)
    public void setAskCommunityTest() {
        cartBn.setAskCommunity();
    }
     @Test(priority = 9)
    public void emailRaioBoxTest() {
        initElements();
        cartBn.validateMyAccountBtn();
        }
    @Test(priority = 10)
        public void setPayAsGuestTest (){
         cartBn.clickNext();
         cartBn.clickForgotPassword();
        }

    }