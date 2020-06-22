package coverage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.DataReader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import static coverage.WebElementCoverage.*;

//import sun.jvm.hotspot.utilities.Assert;

public class HomePag extends WebAPI {

    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;
    DataReader excel = new DataReader();
    public static String max;
    public static String min;
    public static  String data0;
    public static  String data1;

    @FindBy(how = How.XPATH, using = gifthomeoffice )
    public WebElement gifthomeoffices;
    public  void gifthomeofficem() {
        gifthomeoffices.click();
    }

    @FindBy(how = How.XPATH, using = browse)
    public WebElement browses;
    public void browsem() {

        String title =browses.getText();
        System.out.println(title);
    }

    @FindBy(how = How.XPATH, using = bestsellers)
    public WebElement bestsellerss;

    public void bestsellersm() {
        String act = "xxxxx";
        String exp =bestsellerss.getText();
        System.out.println(exp);
        if (act == exp) {


            bestsellerss.click();
            System.out.println(" Test Passed ");
        }
            else{
                System.out.println("Test Passed ");
            }

        }

    @FindBy(how = How.XPATH, using = newarrivalls)
    public WebElement newarrivallss;

    public void newarrivallsm() {

        if (  newarrivallss.isEnabled()){
           System.out.println("newarrivalls is enabled");//
       }else {
           System.out.println("newarrivalls is not enabled");//
       }
    }

    @FindBy(how = How.XPATH, using =bngiftguide)
    public WebElement bngiftguides;

    public void bngiftguidesm() {
try {
    if (bngiftguides.isDisplayed()) {
        bngiftguides.click();
        System.out.println("Test passed");
    } else {
        System.out.println("errors not found ");
    }
}catch (Exception e){
    System.out.println(e);
}
    }
    @FindBy(how = How.XPATH, using = babyboutique)
    public WebElement babyboutiques;
    public void babyboutiquesm() {
        String EXP ="yyyyy";////////
        String validation =babyboutiques.getText();
        System.out.println(validation);

        switch (validation) {
            case "Rewards Credit Cards"://///
                System.out.println("Test Passed");
                break;
            case "Rewards Credit Card"://////
                System.out.println("Test failed");
                break;
        }
    }
    @FindBy(how = How.XPATH, using = thetrendshop)
    public WebElement thetrendshops;

    public void thetrendshopm() {

        if ( thetrendshops.isSelected()){
            System.out.println("thetrendshops enabled");///////
        }else {
            System.out.println("thetrendshops is not enabled");/////
        }
    }
    @FindBy(how = How.XPATH, using = weddingboutique)
    public WebElement weddingboutiques;

    public void weddingboutiquem() {

        String tag = weddingboutiques.getTagName();
        for (int i = 0; i < 5; i++) {
            System.out.println("Print tag name 5 times"+ tag);
        }
    }

    @FindBy(how = How.XPATH, using = forher)
    public WebElement forhers;

    public void forherm() {

        forhers.click();

    }
    @FindBy(how = How.XPATH, using =  forhim)
    public WebElement forhims;
    public void  forhimm() {

       String title=  forhims.getText();
         System.out.println(title);

    }
    @FindBy(how = How.XPATH, using = seeall)
    public WebElement seealls;
    public void seeallm() {

        String a =  seealls.getText();
        System.out.println(a);
    }
    @FindBy(how = How.XPATH, using = artsupplie)
    public WebElement artsupplies;
    public void artsuppliem() {

        if (artsupplies.isEnabled()){
            System.out.println("Testpassed");
        }else {
            System.out.println("Testfaild");
        }
    }

    @FindBy(how = How.XPATH, using = bagetote)
    public WebElement bagetotes;
    public void bagetotem() {

        if (bagetotes.isEnabled()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test not passed");
        }

    }
    @FindBy(how = How.XPATH, using = calendarsplanner)
    public WebElement calendarsplanners;
    public void calendarsplannerm() {

        if (calendarsplanners.isDisplayed()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test not passed");
        }
    }

    @FindBy(how = How.XPATH, using = christiangift)
    public WebElement christiangifts;
    public void christiangiftm() {

        if (christiangifts.isDisplayed()) {
            System.out.println("TestPASSED");
        } else {
            System.out.println("TestFAILED");
        }
    }
    @FindBy(how = How.XPATH, using =decorativeaccent)
    public WebElement decorativeaccents;
    public void decorativeaccentm() {

        if (decorativeaccents.isDisplayed()) {
            decorativeaccents.click();
        } else {
            System.out.println("TestFAILED");
        }
    }
    @FindBy(how = How.XPATH, using =electronic)
    public WebElement electronics;

    public void electronicm() {

        if (electronics.isDisplayed()) {
            electronics.click();
        } else {
            System.out.println("TestFAILED");
        }

    }
    @FindBy(how = How.XPATH, using = hobbie)
    public WebElement hobbies;
    public void hobbiem() {

        if (hobbies.isDisplayed()) {
            hobbies.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = journal)
    public WebElement journals;

    public void journalm() {

        if (journals.isDisplayed()) {
            journals.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = stationary )
    public WebElement stationarys;

    public void stationarym() {

        stationarys.getTagName();
        String b = stationarys.getTagName();
            System.out.println(b);
    }
    @FindBy(how = How.XPATH, using = bnexclusive )
    public WebElement bnexclusives;

    public void bnexclusivem() {
       String title=  bnexclusives.getText();

            System.out.println(title);
        }




    }




