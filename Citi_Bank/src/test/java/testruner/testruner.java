package testruner;

import common.WebAPI;
import coverage.HomePag;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testruner extends WebAPI {

    static HomePag cityBank ;


    @BeforeSuite
    public void initElement(){
        // getLocalDriver("chrome","Windows");
        cityBank= PageFactory.initElements(driver, HomePag.class);
    }

   //// @Test(priority = 0)
    public void opencreditCard() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        cityBank.Clickcreeditcard();
    }
    // @Test(priority = 0)
    public void viewcreditCard() throws InterruptedException {
        initElement();
        cityBank.Clickcreeditcard();
        Thread.sleep(200);
        cityBank.viewcards();
    }

     //@Test(priority = 0)
    public void aprs() throws InterruptedException {
        initElement();
        cityBank.Clickcreeditcard();
        Thread.sleep(200);
        cityBank.APRS();
    }

   // @Test(priority = 0)
    public void vbalances() throws InterruptedException {
        initElement();
        cityBank.Clickcreeditcard();
        Thread.sleep(200);
        cityBank.vbalances();
    }

  //  @Test(priority = 0)
    public void Bankcach() throws InterruptedException {
        initElement();
        cityBank.Clickcreeditcard();
        Thread.sleep(200);
        cityBank.Bankcach();
    }

    //@Test(priority = 0)
    public void Bankreward() throws InterruptedException {
        initElement();
        cityBank.Clickcreeditcard();
        Thread.sleep(200);
        cityBank.Bankreward();
    }

  //  @Test(priority = 0)
    public void qualifieS() throws InterruptedException {
        initElement();
        cityBank.Clickcreeditcard();
        Thread.sleep(200);
        cityBank.qualifieS();
    }

    //@Test(priority = 0)
    public void smallBusinesm() throws InterruptedException {
        initElement();
        cityBank.Clickcreeditcard();
        Thread.sleep(200);
        cityBank.smallBusinesm();
    }
// test from here----------------------------
   // @Test(priority = 0)
    public void enterusername() throws InterruptedException {
        initElement();

        Thread.sleep(200);
        cityBank.enterusername();
    }

   //@Test(priority = 0)
    public void enterPW() throws InterruptedException {
        initElement();

        Thread.sleep(200);
        cityBank.enterPW();
    }

   // @Test(priority = 0)
    public void CLCIK_Clicknext() throws InterruptedException {
        initElement();

        Thread.sleep(2000);
        cityBank.CLCIK_Clicknext();
    }

    //@Test(priority = 0)
    public void forgetIDS() throws InterruptedException {
        initElement();

        Thread.sleep(200);
        cityBank.forgetIDS();
    }

    //@Test(priority = 0)
    public void ACIVECARDlink() throws InterruptedException {
        initElement();

        Thread.sleep(200);
        cityBank.ACIVECARDlink();
    }



    //@Test(priority = 0)
    public void getforgetPW() throws InterruptedException {
        initElement();

        Thread.sleep(200);
        cityBank.getforgetPW();
    }

    //@Test(priority = 0)
    public void checkREGISTERoNLINE() throws InterruptedException {
        initElement();

        Thread.sleep(200);
        cityBank.checkREGISTERoNLINE();
    }

    //@Test(priority = 0)
    public void SELECTREMEBREid() throws InterruptedException {
        initElement();

        Thread.sleep(200);
        cityBank.SELECTREMEBREid();
    }

    //@Test(priority = 0)
    public void OPENbanking()throws InterruptedException {
        initElement();

        Thread.sleep(200);
        cityBank.OPENbanking();
    }

    //@Test(priority = 0)
    public void OPENbankingview()throws InterruptedException {
        initElement();

        Thread.sleep(200);
        cityBank.OPENbanking();
        Thread.sleep(200);
        cityBank.OPENbankingview();
    }

    @Test(priority = 0)
    public void OPENchecking()throws InterruptedException {
        initElement();

        Thread.sleep(200);
        cityBank.OPENbanking();
        Thread.sleep(200);
        cityBank.OPENchecking();
    }

    //@Test(priority = 0)
    public void OPENsaving()throws InterruptedException {
        initElement();

        Thread.sleep(200);
        cityBank.OPENbanking();
        Thread.sleep(200);
        cityBank.OPENsaving();
    }

    //@Test(priority = 0)
    public void OPENcertification()throws InterruptedException {
        initElement();

        Thread.sleep(200);
        cityBank.OPENbanking();
        Thread.sleep(200);
        cityBank.OPENcertification();
    }

}















