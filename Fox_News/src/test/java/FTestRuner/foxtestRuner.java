package FTestRuner;

import common.WebAPI;
import coverage.HomePag;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class foxtestRuner extends WebAPI {

    static HomePag foxnews ;


    @BeforeSuite
    public void initElement(){
        // getLocalDriver("chrome","Windows");
        foxnews= PageFactory.initElements(driver, HomePag.class);
    }

   @Test(priority = 0)
    public void ClickMorelink() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        foxnews.ClickMorelink();
    }


   @Test(priority = 1)
    public void searchNewsTV()  throws InterruptedException {
        initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.searchNewsTV();
    }

   @Test(priority = 2)
    public void millitaryinfos() throws InterruptedException {
         initElement();
        Thread.sleep(200);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.millitaryinfos();
    }

   @Test(priority = 3)
    public void beducation() throws InterruptedException {
       initElement();
        Thread.sleep(200);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.beducation();
    }

    @Test(priority = 4)
    public void terrorm()throws InterruptedException {
        initElement();
        Thread.sleep(200);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.terrorm();
    }

    @Test(priority = 5)
    public void migrationm() throws InterruptedException {
       initElement();
        Thread.sleep(200);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.migrationm();
    }

    @Test(priority =6)
    public void economym() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.economym();
    }

   @Test(priority = 7)
    public void freedomm() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.freedomm();
    }

     @Test(priority = 8)
    public void foxnewsm() throws InterruptedException {
        initElement();


        Thread.sleep(200);
        foxnews.ClickMorelink();
        Thread.sleep(400);
        foxnews.foxnewsm();
    }

    @Test(priority =9)
    public void livestylem() throws InterruptedException {


       initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(400);
        foxnews.livestylem();
    }

    @Test(priority = 10)
    public void drinkm() throws InterruptedException {
        initElement();
        Thread.sleep(200);
        foxnews.ClickMorelink();
        Thread.sleep(400);
        foxnews.drinkm();
    }

    @Test(priority = 11)
    public void carsm() throws InterruptedException {
       initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.carsm();
    }

   @Test(priority = 12)
    public void travelesm() throws InterruptedException {
       initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.travelesm();
    }



   @Test(priority = 13)
    public void housem() throws InterruptedException {
       initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.housem();
    }

   @Test(priority = 14)
    public void fitnessm() throws InterruptedException {
       initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.fitnessm();
    }

    @Test(priority = 15)
    public void stylem() throws InterruptedException {
       initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.fitnessm();
    }

    @Test(priority = 16)
    public void familym() throws InterruptedException {
         initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.fitnessm();
    }

    @Test(priority = 17)
    public void faithm() throws InterruptedException {
         initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.faithm();
    }

    @Test(priority = 18)
    public void otherm() throws InterruptedException {
        initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.otherm();
    }

    @Test(priority = 19)
    public void foxnotationm()throws InterruptedException {
       initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.foxnotationm();
    }

    @Test(priority = 20)
    public void newsappm()throws InterruptedException {
        initElement();
        Thread.sleep(400);
        foxnews.ClickMorelink();
        Thread.sleep(200);
        foxnews.newsappm();
    }

}
