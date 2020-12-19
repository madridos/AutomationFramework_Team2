package airbnbTestHomePge;

import common.WebAPI;
import myAccount.MyAirbnbPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AirbnbTests extends WebAPI {
    MyAirbnbPage page;

    public void initElements(){
        page= PageFactory.initElements(driver, MyAirbnbPage.class);
    }
    @BeforeMethod
    public void setMainePage() {
        initElements();
        page.findSeattleBtn();
    }
//   @Test(priority=2)
//   public void checkInBtnTest() {
//        page.setCheckInBtn();
//    }
//    @Test(priority=3)
//    public void checkInDateTest(){
//        page.setCheckInBtn();
//        page.setcheckIndate();
//    }
//    @Test(priority=4)
//    public void setcheckOutBtnTest() {
//        page.setcheckOutBtn();
//    }
//    @Test(priority=5)
//    public void setcheckOutDateTest() {
//        page.setcheckOutBtn();
//        page.setcheckOutDate();
//    }
//    @Test(priority=5)
//    public void setAdultsTest()  {
//        page.setadults();
//    }
//    @Test(priority=6)
//    public void setChildrenTest() {
//        page.setchildren();
//    }
//    @Test(priority=7)
//    public void setSearchTest() {
//        page.setCheckInBtn();
//        page.setcheckIndate();
//        page.setcheckOutBtn();
//        page.setcheckOutDate();
//        page.setadults();
//        page.setchildren();
//        page.setSearchBtn();
//    }
    @Test(priority=8)
    public void chooseCurrencyTest() throws InterruptedException {
        initElements();
        page.setCheckInBtn();
        page.setcheckIndate();
        page.setcheckOutBtn();
        page.setcheckOutDate();
        page.setadults();
        page.setchildren();
        page.setSearchBtn();
        Thread.sleep(5000);
        page.chooseCurrency();
        Thread.sleep(5000);
    }
}
