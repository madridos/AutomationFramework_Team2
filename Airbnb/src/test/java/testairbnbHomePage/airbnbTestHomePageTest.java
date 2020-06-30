package testairbnbHomePage;

import common.WebAPI;
import coverage.airbnbHomePag;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class airbnbTestHomePageTest extends WebAPI {
    static airbnbHomePag airbnbtest ;

    @BeforeSuite
    public void initElement(){
        // getLocalDriver("chrome","Windows");
        airbnbtest= PageFactory.initElements(driver, airbnbHomePag.class);
    }

   @Test(priority = 0)
    public void clickOnlineExp() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        airbnbtest.ClickonlineExpriaces();
    }

 @Test(priority = 1)
    public void clickdate() throws InterruptedException {
      try {
          initElement();
          Thread.sleep(200);
          airbnbtest.ClickonlineExpriaces();
          Thread.sleep(4000);
          airbnbtest.Clickdate();
      }catch (Exception e){

          System.out.println(e);
      }

    }
   @Test(priority = 2)
    public void clickPrice() throws InterruptedException {
        initElement();
        Thread.sleep(600);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(6000);

        airbnbtest.ClickPrice();
    }
   @Test(priority = 3)
    public void clickShareall() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.clickShareall();
    }

    @Test(priority = 4)
    public void Hostyourhome () throws InterruptedException, SQLException, IOException, ClassNotFoundException {


        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.clickHostyourhome();
    }

  @Test(priority = 5)
    public void setprice () throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        airbnbtest.connectToSqlDatabase();
        airbnbtest.queryDB();

        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.ClickPrice();
        Thread.sleep(4000);
        airbnbtest.setEnterprice();

    }

   @Test(priority = 6)
    public void PRICEMAX () throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        airbnbtest.connectToSqlDatabase();
        airbnbtest.queryDB();
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
   @Test(priority = 7)
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
    @Test(priority = 8)
    public void clickDay() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.clickDay();
    }
    @Test(priority = 9)
    public void checkbox() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.clickDay();
        Thread.sleep(4000);
        airbnbtest.mornigcheckbox();
    }
   @Test(priority = 10)
    public void selectdate() throws InterruptedException, IOException {
        airbnbtest.excel();
        initElement();
        Thread.sleep(200);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(4000);
        airbnbtest.Clickdate();
        Thread.sleep(4000);
        airbnbtest.selectdate();

    }
 @Test(priority = 11)
    public void openimage() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(1000);
        airbnbtest.findimage();
    }

   @Test(priority = 12)
    public void getimage() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        airbnbtest.ClickonlineExpriaces();
        Thread.sleep(1000);
        airbnbtest.findimage();
        Thread.sleep(4000);
        airbnbtest.getimageS();
    }
   @Test(priority = 13)
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
    @Test(priority = 15)
    public void connectDB() throws Exception {
        ///  initElement();
        airbnbtest.loadProperties();
        airbnbtest.connectToSqlDatabase();
        airbnbtest.queryDB();

    }
    @Test(priority = 16)
    public void cucumber() throws Exception {
        // initElement();
       // airbnbtest. user_Navigate_to_LogIn_Page();

    }

}
