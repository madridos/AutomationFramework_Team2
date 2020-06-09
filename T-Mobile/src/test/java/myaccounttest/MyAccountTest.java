package myaccounttest;

import common.WebAPI;
import myaccount.MyAccountPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MyAccountTest extends WebAPI {
    MyAccountPage cartBn;

    public void initElements(){

        cartBn= PageFactory.initElements(driver,MyAccountPage.class);
    }
    @Test(priority=1)
    public void btnMyAccountTest(){
        initElements();
        cartBn.validateMyAccountBtn();

    }
    @Test(priority=2)
    public void myLoginButton()   {
        initElements();
        cartBn.validateMyAccountBtn();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cartBn.validateLoginButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(priority=3)
    public void myPhoneNumber(){
        initElements();
        cartBn.validateMyAccountBtn();
        cartBn.validateLoginButton();
        cartBn.enterPhoneOrEmail();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @Test(priority=4)
    public void myBillPay(){
        initElements();
        cartBn.validateMyAccountBtn();
        cartBn.setBillPay();

    }
    @Test(priority=5)
    public void addLine(){
        initElements();
        cartBn.validateMyAccountBtn();
        cartBn.setAddALine();

    }
    @Test(priority=5)
    public void doUpgradeTest(){
        initElements();
        cartBn.validateMyAccountBtn();
        cartBn.doUpgrade();
    }
    @Test(priority =6)
    public void setOrderStatusTest(){
        initElements();
        cartBn.validateMyAccountBtn();
        cartBn.setOrderStatus();
    }
    @Test(priority =7)
    public void setAskCommunityTest(){
        initElements();
        cartBn.validateMyAccountBtn();
        cartBn.setAskCommunity();

    }
}
