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

    //Test case execution ?

   // @Test
    public void loginToaetna(){
        initElement();
        homepage.loginToaetna();

    }

  //  @Test
    public void Reisteraetna() throws InterruptedException {
        initElement();
        homepage.loginToaetna();
        Thread.sleep(2000);
        homepage.ClickReisteraetna();

    }

 //   @Test
    public void MemberIDaetna() throws InterruptedException {

        initElement();
        homepage.loginToaetna();
        Thread.sleep(2000);
        homepage.ClickReisteraetna();
        homepage.aetnaMemberID();

    }

    //@Test
    public void aetnasearchBoxValidation() throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnasearchBox();


    }

   // @Test
    public void aetnafindpharmacy () throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnafindpharmacy();


    }

   // @Test
    public void aetnashopPlans()  throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnashopPlans();


    }

   // @Test
    public void aetnapharmacy()  throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnashopPlans();
        Thread.sleep(4000);
        homepage.aetnaphamacies();


    }

  // @Test
    public void aetnaExploreSites()  throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();


    }

    //@Test
    public void Aetnasite()  throws InterruptedException {

        initElement();
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.Aetnasite();


    }


   // @Test
    public void aetnaAprovider()  throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.aetnaAprovider();


    }

   // @Test
    public void aetnaemployer()  throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage. aetnaemployer();


    }



   // @Test
    public void aetnaeagent()  throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.aetnaagent() ;


    }
    //@Test
    public void aetnapartnersClick ()  throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.aetnapartnersClick () ;


    }
   // @Test
    public void aetnacareersClick ()  throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.aetnacareersClick () ;


    }

   // @Test
    public void readaetnastoryClick () throws InterruptedException {

        initElement();
        Thread.sleep(4000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage. aetnaemployer();
        Thread.sleep(6000);
        homepage.readaetnastoryClick();


    }
   // @Test
    public void resoursesClick () throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.aetnaAprovider();
        Thread.sleep(2000);
        homepage.resoursesClick ();

    }

   // @Test
    public void resoursesacts () throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.Aetnasite();
        Thread.sleep(2000);
        homepage.resoursesfacts();

    }
   //@Test
    public void resoursesproducts () throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.aetnaExploreSites();
        Thread.sleep(2000);
        homepage.aetnaemployer();
        Thread.sleep(2000);
        homepage.resoursesproducts();

    }

   // @Test
    public void eatnafeadback () throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.eatnafeadback();



    }

     @Test
    public void eatnaLogo () throws InterruptedException {

        initElement();
        Thread.sleep(2000);
        homepage.eatnaLogo();



    }
}
