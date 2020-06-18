package testairbnbHomePage;

import common.WebAPI;
import coverage.airbnbHomePag;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class airbnbTestHomePageTest extends WebAPI {

    static airbnbHomePag airbnbtest ;

    @BeforeSuite
    public void initElement(){
        // getLocalDriver("chrome","Windows");
        airbnbtest= PageFactory.initElements(driver, airbnbHomePag.class);
    }

   // @Test(priority = 0)
    public void clickOnlineExp() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        airbnbtest.ClickonlineExpriaces();
    }

  // @Test(priority = 1)
    public void clickdate() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.Clickdate();
    }
   //@Test(priority = 2)
    public void clickPrice() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);

        airbnbtest.ClickPrice();
    }
   // @Test(priority = 3)
    public void clickShareall() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.clickShareall();
    }
    //@Test(priority = 4)
    public void Hostyourhome () throws InterruptedException {
        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.clickHostyourhome();
    }

   // @Test(priority = 5)
    public void PRICE () throws InterruptedException {
        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.ClickPrice();
        Thread.sleep(4000);
        airbnbtest.setEnterprice();

    }
   // @Test(priority = 6)
    public void PRICEMAX () throws InterruptedException {
        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.ClickPrice();
        Thread.sleep(4000);
        airbnbtest.setEnterprice();
        Thread.sleep(4000);
        airbnbtest.setEnterpriceMAX();
        Thread.sleep(200);

    }
  // @Test(priority = 7)
    public void clicksave () throws InterruptedException {
        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.ClickPrice();
        Thread.sleep(4000);
        airbnbtest.setEnterprice();
        Thread.sleep(4000);
        airbnbtest.setEnterpriceMAX();
        Thread.sleep(9000);
        airbnbtest.cSave();

    }

   // @Test(priority = 8)
    public void clickDay() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.clickDay();
    }

   // @Test(priority = 9)
    public void checkbox() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.clickDay();
        Thread.sleep(4000);
        airbnbtest.mornigcheckbox();
    }

    // @Test(priority = 10)
    public void selectdate() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.Clickdate();
        Thread.sleep(4000);
        airbnbtest.selectdate();

    }

 // @Test(priority = 11)
    public void openimage() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(1000);
        airbnbtest.findimage();
    }

   //@Test(priority = 12)
    public void getimage() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(1000);
        airbnbtest.findimage();
        Thread.sleep(4000);
        airbnbtest.getimageS();
    }

   //@Test(priority = 13)
    public void droparrow() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(1000);
        airbnbtest.clickarrow();

    }

    @Test(priority = 14)
    public void excel() throws InterruptedException, IOException {
      ///  initElement();

        airbnbtest.excel();

    }



}
