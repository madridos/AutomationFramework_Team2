package myAccountRunner;

import common.WebAPI;
import myAccount.MySouthWestPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTests extends WebAPI {
    MySouthWestPage myAccount;
    public void init() {
        myAccount = PageFactory.initElements(driver, MySouthWestPage.class);
    }
    @BeforeMethod
    public void setMainePage()  {
        init();
        myAccount.chooseFlights();
    }
    @Test(priority=1)
    public void chooseCitiesTest()  {
        myAccount.bookFlight();
        myAccount.chooseCities();
    }
     @Test(priority=2)
    public void chooseDepartCityTest() {
        myAccount.bookFlight();
        myAccount.chooseDepartCity();
    }
    @Test(priority = 3)
    public void arrivalCityTest() {
        myAccount.bookFlight();
        myAccount.chooseArrivaltCity();
    }
     @Test(priority = 4)
    public void setDepDateTest() {
        myAccount.bookFlight();
        myAccount.setDepDate();
    }
      @Test(priority = 5)
    public void sedepDate1Test() {
          myAccount.bookFlight();
        myAccount.setDepDate();
        myAccount.sedepDate1();
    }
    @Test(priority = 6)
    public void setReturnDateTest() {
        myAccount.bookFlight();
        myAccount.setReturnDate();
    }
    @Test(priority = 7)
    public void setReturnDate1Test() {
        myAccount.bookFlight();
        myAccount.setReturnDate();
        myAccount.setReturnDate1();
    }
    @Test(priority = 8)
    public void searchFlightTest() {
        myAccount.bookFlight();
        myAccount.chooseCities();
        myAccount.chooseDepartCity();
        myAccount.chooseArrivaltCity();
        myAccount.setDepDate();
        myAccount.sedepDate1();
        myAccount.setReturnDate();
        myAccount.setReturnDate1();
        myAccount.searchFlight();
    }
}
