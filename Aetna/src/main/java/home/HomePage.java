package home;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static home.HomePageWebElement.*;

public class HomePage extends WebAPI  {
    static WebDriverWait wait;
    //Test cas 1
    @FindBy (how= How.XPATH,using =cickllogin )
    public WebElement aetnaLoginButton ;

    public void loginToaetna(){

        aetnaLoginButton.click();

    }

    //Test cas 2
    @FindBy (how= How.XPATH,using =clickegister)
    public WebElement aetnaClickReister ;

    public void ClickReisteraetna() {

        aetnaClickReister.click();


    }

    //Test cas 3
    @FindBy (how= How.XPATH,using =memberID)
    public WebElement aetnaMemberID ;

    public void aetnaMemberID() {

       String memberValidation= aetnaMemberID.getText();
       System.out.println(memberValidation);
        aetnaMemberID.sendKeys("100000000");


    }

    //Test cas 4
    @FindBy (how= How.XPATH,using =searchBox)
    public WebElement aetnasearchBox ;

    public void aetnasearchBox () throws InterruptedException {
     String exp = "search";

       String memberValidation= aetnasearchBox .getText();
      Assert.assertEquals(memberValidation,exp);
      System.out.println("Validation Pased");



    }
    //Test cas 5
    @FindBy (how= How.XPATH,using =findpharmacy)
    public WebElement aetnafindpharmacy ;

    public void aetnafindpharmacy () throws InterruptedException {
        aetnafindpharmacy.click();



    }

    //Test cas 6
    @FindBy (how= How.XPATH,using =shopPlan)
    public WebElement aetnashopPlan ;

    public void aetnashopPlans() throws InterruptedException {
        aetnashopPlan.click();



    }

    //Test cas 7
    @FindBy (how= How.XPATH, using =phamacies)
    public WebElement aetnaphamacies ;

    public void aetnaphamacies() throws InterruptedException {


        Actions actions = new Actions(driver);
        actions.moveToElement(aetnaphamacies).build().perform();
        aetnaphamacies.click();
        System.out.println("TEST PASSED");



    }


    //Test cas 7
    @FindBy (how= How.XPATH, using =ExploreSites)
    public WebElement aetnaExploreSites ;

    public void aetnaExploreSites() throws InterruptedException {
        aetnaExploreSites.click();
        System.out.println("TEST PASSED");



    }

    //Test cas 7
    @FindBy (how= How.XPATH, using =Aetnasite)
    public WebElement aetnaAetnasite ;

    public void Aetnasite() throws InterruptedException {
        aetnaAetnasite.click();
        System.out.println("TEST PASSED");



    }


    //Test cas 7
    @FindBy (how= How.XPATH, using =orprovider)
    public WebElement aetnaAprovider ;

    public void aetnaAprovider() throws InterruptedException {
        aetnaAprovider.click();
        System.out.println("TEST PASSED");



    }



    //Test cas 7
    @FindBy (how= How.XPATH, using =employer)
    public WebElement aetnaemployer ;

    public void aetnaemployer () throws InterruptedException {
        aetnaemployer .click();
        System.out.println("TEST PASSED");



    }

    //Test cas 7
    @FindBy (how= How.XPATH, using =aaents)
    public WebElement aetnaagentClick;

    public void aetnaagent () throws InterruptedException {
        aetnaagentClick.click();
        System.out.println("TEST PASSED");



    }
    //Test cas 7
    @FindBy (how= How.XPATH, using =partners )
    public WebElement aetnapartnersClick;

    public void aetnapartnersClick () throws InterruptedException {
        aetnapartnersClick.click();
        System.out.println("TEST PASSED");



    }
    //Test cas 7
    @FindBy (how= How.XPATH, using = careers )
    public WebElement careersClick;

    public void aetnacareersClick () throws InterruptedException {
        careersClick.click();
        System.out.println("TEST PASSED");



    }

    //Test cas 7
    @FindBy (how= How.XPATH, using = covid  )
    public WebElement readaetnastoryClick;

    public void readaetnastoryClick () throws InterruptedException {
        readaetnastoryClick.click();
        System.out.println("TEST PASSED");



    }
    //Test cas 7
    @FindBy (how= How.XPATH, using = resourses   )
    public WebElement resoursesClick;

    public void resoursesClick () throws InterruptedException {
        resoursesClick.click();
        System.out.println("TEST PASSED");



    }
    //Test cas 7
    @FindBy (how= How.XPATH, using = facts   )
    public WebElement resoursesfacts;

    public void resoursesfacts() throws InterruptedException {
        resoursesfacts.click();
        System.out.println("TEST PASSED");



    }
    //Test cas 7
    @FindBy (how= How.XPATH, using = products  )
    public WebElement resoursesproducts;

    public void resoursesproducts() throws InterruptedException {
        resoursesproducts.click();
        System.out.println("TEST PASSED");



    }

    //Test cas 7
    @FindBy (how= How.XPATH, using = feadback )
    public WebElement eatnafeadback;

    public void eatnafeadback() throws InterruptedException {
        eatnafeadback.click();
        System.out.println("TEST PASSED");



    }

    //Test cas 7
    @FindBy (how= How.XPATH, using = validateLogo )
    public WebElement eatnavalidateLogo;

    public void eatnaLogo() throws InterruptedException {
        String logotext = eatnavalidateLogo.getText();
        System.out.println(logotext);



    }

    }
