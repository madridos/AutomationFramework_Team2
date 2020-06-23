package Testruner;

import common.WebAPI;
import coverage.HomePag;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class hartfordTestrunner extends WebAPI {

    static HomePag hartford ;


    @BeforeSuite
    public void initElement(){
        // getLocalDriver("chrome","Windows");
        hartford= PageFactory.initElements(driver, HomePag.class);
    }

    // @Test(priority = 0)
    public void myaccountM()throws InterruptedException {
        initElement();
        Thread.sleep(200);
        hartford.myaccountM();
    }


    // @Test(priority = 1)
    public void loginm() throws InterruptedException {
       initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford.loginm();
    }

     //@Test(priority = 2)
    public void registerm() throws InterruptedException {
       initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford.registerm();
    }

    // @Test(priority = 3)
    public void exprpaym()  throws InterruptedException {
        initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford.exprpaym();
    }

      //@Test(priority = 4)
    public void autoIDm() throws InterruptedException {
         initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. autoIDm();
    }
//from here
    @Test(priority = 0)
    public void BLOGINm() throws InterruptedException {
         initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. BLOGINm() ;
    }

    @Test(priority = 1)
    public void BREGISTERm() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. BREGISTERm() ;
    }

     @Test(priority = 2)
    public void BEXPRESSPAYm()  throws InterruptedException {
        initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. BEXPRESSPAYm() ;
    }

    @Test(priority = 3)
    public void bnloginm()  throws InterruptedException {
         initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. BEXPRESSPAYm() ;
    }

    @Test(priority = 4)
    public void bnregisterm()  throws InterruptedException {

         initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. bnregisterm() ;
    }

     @Test(priority = 5)
    public void emloginm() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. emloginm() ;
    }

    @Test(priority = 6)
    public void emregisterm() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. emregisterm()  ;
    }

     @Test(priority = 7)
    public void collegesavingm() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. collegesavingm()  ;
    }



      @Test(priority = 8)
    public void mfoundm() throws InterruptedException {
         initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. mfoundm()  ;
    }

    @Test(priority = 9)
    public void safehavenm() throws InterruptedException {
         initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. safehavenm()  ;
    }

    @Test(priority = 10)
    public void ebusinessm() throws InterruptedException {
         initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. ebusinessm()  ;
    }

    @Test(priority = 11)
    public void boundonem() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. boundonem()  ;
    }

    @Test(priority = 12)
    public void groupBfictm() throws InterruptedException {
       initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. groupBfictm()  ;
    }

    @Test(priority = 13)
    public void RMISm() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        hartford.myaccountM();
        Thread.sleep(400);
        hartford. RMISm()   ;
    }

    @Test(priority = 14)
    public void SERCHINPUTm()throws InterruptedException {
       initElement();
        Thread.sleep(400);

        hartford. SERCHINPUTm()  ;
    }

    @Test(priority = 15)
    public void PAGETITLEm()throws InterruptedException {
        initElement();
        Thread.sleep(400);

        hartford. PAGETITLEm()  ;
    }


}



