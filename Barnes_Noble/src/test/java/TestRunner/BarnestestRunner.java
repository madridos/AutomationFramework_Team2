package TestRunner;

import common.WebAPI;
import coverage.HomePag;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BarnestestRunner extends WebAPI {

    static HomePag barnes;
// this method for initialization page factory and driver
    @BeforeSuite
    public void initElement(){
        // getLocalDriver("chrome","Windows");
        barnes= PageFactory.initElements(driver, HomePag.class);
    }
     @Test(priority = 0)
    public void gifthomeofficem()throws InterruptedException {
        initElement();
        Thread.sleep(200);
         barnes.gifthomeofficem();
    }
     @Test(priority = 1)
    public void browsem()  throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes.browsem();
    }
    @Test(priority = 2)
    public void bestsellersm() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes.bestsellersm();
    }
    @Test(priority = 3)
    public void newarrivallsm()  throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes.newarrivallsm();
    }
    @Test(priority = 4)
    public void  bngiftguidesm() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes.bngiftguidesm();
    }
    @Test(priority = 5)
    public void  babyboutiquesm() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes.babyboutiquesm();
    }
    @Test(priority = 6)
    public void thetrendshopm() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes.thetrendshopm();
    }
    @Test(priority = 7)
    public void weddingboutiquem() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes. weddingboutiquem();
    }
    @Test(priority = 8)
    public void forherm() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes. forherm();
    }
    @Test(priority = 9)
    public void forhimm()  throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(400);
        barnes. forhimm();
    }
    @Test(priority = 10)
    public void seeallm() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
       Thread.sleep(400);
        barnes. seeallm();
    }
    @Test(priority = 11)
    public void artsuppliem() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes. artsuppliem();
    }

    @Test(priority = 12)
    public void bagetotem() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes. bagetotem();
    }
    @Test(priority = 13)
    public void calendarsplannerm() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes. calendarsplannerm();
    }
    @Test(priority = 14)
    public void christiangiftm() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes. christiangiftm();
    }
    @Test(priority = 15)
    public void decorativeaccentm() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes.decorativeaccentm();
    }
    @Test(priority = 16)
    public void electronicm() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes.electronicm();
    }
    @Test(priority = 17)
    public void hobbiem() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes.hobbiem();
    }
    @Test(priority = 18)
    public void journalm() throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes.journalm();
    }
    @Test(priority = 19)
    public void stationarym()throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(400);
        barnes.stationarym();
    }
    @Test(priority = 20)
    public void bnexclusivem()throws InterruptedException {
        initElement();
        barnes.gifthomeofficem();
        Thread.sleep(200);
        barnes.bnexclusivem();
    }

}
