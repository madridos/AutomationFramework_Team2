package homePageTest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestHomePage extends WebAPI {
static HomePage homepage;

    @BeforeSuite
    public void initElement(){
        // getLocalDriver("chrome","Windows");
         homepage= PageFactory.initElements(driver, HomePage.class);
    }
    @Test(priority=0)
    public void loginToaetna(){
        initElement();
        homepage.loginToaetna();

    }
    @Test(priority=1)
    public void Reisteraetna() throws InterruptedException {
        initElement();
        homepage.loginToaetna();
        Thread.sleep(2000);
        homepage.ClickReisteraetna();

    }
   @Test(priority=2)
    public void MemberIDaetna() throws InterruptedException {

        initElement();
        homepage.loginToaetna();
        Thread.sleep(2000);
        homepage.ClickReisteraetna();
        homepage.aetnaMemberID();

    }
    @Test(priority=3)
    public void aetnasearchBoxValidation() throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.aetnasearchBox();

    }
    @Test(priority=4)
    public void aetnafindpharmacy () throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.aetnafindpharmacy();

    }
    @Test(priority=5)
    public void aetnashopPlans()  throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnashopPlans();

    }
    @Test(priority=6)
    public void aetnapharmacy()  throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.aetnashopPlans();
        Thread.sleep(4000);
        homepage.aetnaphamacies();

    }
    @Test(priority=7)
    public void aetnaExploreSites()  throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();

    }
    @Test(priority=8)
    public void Aetnasite()  throws InterruptedException {
        initElement();
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.Aetnasite();

    }
    @Test(priority=9)
    public void aetnaAprovider()  throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.aetnaAprovider();

    }
    @Test(priority=10)
    public void aetnaemployer()  throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage. aetnaemployer();

    }
    @Test(priority=11)
    public void aetnaeagent()  throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.aetnaagent() ;

    }
    @Test(priority=12)
    public void aetnapartnersClick ()  throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.aetnapartnersClick () ;

    }
    @Test(priority=13)
    public void aetnacareersClick ()  throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.aetnacareersClick () ;

    }
    @Test(priority=14)
    public void readaetnastoryClick () throws InterruptedException {
        initElement();
        Thread.sleep(4000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage. aetnaemployer();
        Thread.sleep(6000);
        homepage.readaetnastoryClick();

    }
    @Test(priority=15)
    public void resoursesClick () throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.aetnaAprovider();
        Thread.sleep(2000);
        homepage.resoursesClick ();

    }
    @Test(priority=16)
    public void resoursesacts () throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.Aetnasite();
        Thread.sleep(2000);
        homepage.resoursesfacts();

    }
    @Test(priority=17)
    public void resoursesproducts () throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.aetnaemployer();
        Thread.sleep(2000);
        homepage.resoursesproducts();

    }
    @Test(priority=18)
    public void eatnafeadback () throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.eatnafeadback();

    }
    @Test(priority=19)
    public void eatnaLogo () throws InterruptedException {
        initElement();
        Thread.sleep(2000);
        homepage.eatnaLogo();

    }

}
