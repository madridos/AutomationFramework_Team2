package tmobilePlansTest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import tmobilePlans.PlansPage;

public class plansPageTest extends WebAPI {

    PlansPage plansPage;



    public void initElementPlans(){
        plansPage = new PlansPage();
        plansPage =PageFactory.initElements(driver, PlansPage.class);
    }

    // Plans features
    @Test(priority = 1)
    public void plansLinkTest(){
        initElementPlans();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        plansPage.validatePlansLink();
    }

    // Logo
    @Test(priority = 2)
    public void plansLogoTest(){
        initElementPlans();
        plansPage.validatePlansLink();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        plansPage.validatePlansLogo();
        Assert.assertTrue(true);

    }

    // Plans Title
    @Test(priority = 3)
    public void plansTitleTest(){
        initElementPlans();
        plansPage.validatePlansLink();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String title = plansPage.validatePlansTitle();
        Assert.assertEquals(title,"Compare Our Best Cell Phone Plans & Deals for the Family | T-Mobile","Title doesn't matched");

    }

    @Test(priority = 4)
    public void footerLinksTest(){
        initElementPlans();
        plansPage.validatePlansLink();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        int footerListLink = plansPage.validatePlansFooter();
        Assert.assertEquals(footerListLink,83,"It doesn't contains what was expected");
    }

    @Test(priority = 5)
    public void imageText_1Test(){
        initElementPlans();
        plansPage.validatePlansLink();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        String testText_1 = plansPage.validateImageText_1();
        Assert.assertEquals(testText_1,"Special pricing for customers ages 55 and up.","text in image 1 dosen't matched");
    }

    @Test(priority = 6)
    public void scrollTest(){
        initElementPlans();
        plansPage.validatePlansLink();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        plansPage.setScrollToElement();

    }











}
