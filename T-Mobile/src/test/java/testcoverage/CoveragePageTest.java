package testcoverage;

import common.WebAPI;
import coverage.CoveragePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CoveragePageTest extends WebAPI   {
   static CoveragePage covtest ;

@BeforeSuite
   public void initElement(){
     // getLocalDriver("chrome","Windows");
     covtest = PageFactory.initElements(driver,CoveragePage.class);
  }



  //@Test(priority = 0)
    public void clickNumber() throws InterruptedException {
       initElement();
      Thread.sleep(5000);
        covtest.contactClick();

        covtest.clickNum();
    }

   // @Test(priority = 1)
    public void checkorder() throws InterruptedException {

        initElement();
        Thread.sleep(5000);
        covtest.contactClick();
        Thread.sleep(200);
        covtest.ordercheck();
    }


  //  @Test(priority = 2)
   public void enteremail() throws InterruptedException {
      initElement();
        covtest.contactClick();
        Thread.sleep(200);
        covtest.ordercheck();
        Thread.sleep(1000);
        covtest.EmailInput();
   }

   // @Test(priority = 3)
    public void clickButton() throws InterruptedException {
        initElement();

        covtest.contactClick();
        Thread.sleep(200);
        covtest.ordercheck();
        Thread.sleep(1000);
        covtest.EmailInput();
        covtest.nextButton();
    }


   // @Test(priority = 4)
    public void clcikforget() throws InterruptedException {
        initElement();
        covtest.contactClick();
        Thread.sleep(200);
        covtest.ordercheck();
        Thread.sleep(4000);
        covtest.cForget();
    }

    //@Test(priority = 5)
    public void clickSetup() throws InterruptedException {
        initElement();
        covtest.contactClick();
        Thread.sleep(200);
        covtest.ordercheck();
        Thread.sleep(4000);
        covtest.clciksetup();
    }

   // @Test(priority = 6)
    public void clickguest() throws InterruptedException {
        initElement();
        covtest.contactClick();
        Thread.sleep(200);
        covtest.ordercheck();
        Thread.sleep(5000);
        covtest.clickguest();
    }

   // @Test(priority = 7)
    public void help() throws InterruptedException {
        initElement();
        covtest.contactClick();
        Thread.sleep(5000);
        covtest.clickhelp();
    }


   //@Test(priority = 8)
    public void clickfeadback() throws InterruptedException {
        initElement();
        covtest.contactClick();

        Thread.sleep(4000);
        covtest.feadback();
    }


    //@Test(priority = 9)
    public void support() throws InterruptedException {
        initElement();
        covtest.contactClick();
        covtest.ordercheck();
        Thread.sleep(4000);
        covtest.Support();

    }
    //@Test(priority = 10)
    public void Storelocation() throws InterruptedException {
        initElement();
        covtest.contactClick();
        covtest.ordercheck();
        Thread.sleep(4000);
        covtest.Storelocation();

    }
    //@Test(priority = 11)
    public void covrage() throws InterruptedException {
        initElement();
        covtest.contactClick();
        covtest.ordercheck();
        Thread.sleep(4000);
        covtest.Coverage();

    }
    //@Test(priority = 12)
    public void TMobile() throws InterruptedException {
        initElement();
        covtest.contactClick();
        covtest.ordercheck();
        Thread.sleep(4000);
        covtest.TMobile();
    }
    //@Test(priority = 12)
    public void Espanole() throws InterruptedException {
        initElement();
        covtest.contactClick();
        covtest.ordercheck();
        Thread.sleep(4000);
        covtest.Espanole();
    }

    //@Test(priority = 13)
    public void opencontact() throws InterruptedException {
        initElement();
        covtest.openContact();
    }

    @Test(priority = 14)
    public void clickchekitout() throws InterruptedException {
        initElement();
        covtest.openContact();
        Thread.sleep(4000);
        covtest.Checkitout();
    }
    @Test(priority = 15)
    public void Setupnetflix() throws InterruptedException {
        initElement();
        covtest.openContact();
        Thread.sleep(1000);
        covtest.Checkitout();
        Thread.sleep(1000);
        covtest.clicksetupnetflix();
    }
}
