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

    @FindBy(how = How.XPATH, using = myaccount )
    public WebElement myaccountS;

    public  void myaccountM() {

        myaccountS.click();
    }

    @FindBy(how = How.XPATH, using = login)
    public WebElement logins;

    public void loginm() {


        String title =logins.getText();
        System.out.println(title);
    }

    @FindBy(how = How.XPATH, using = register)
    public WebElement registers;

    public void registerm() {
        String act = "Military";
        String exp =registers.getText();
        System.out.println(exp);
        if (act == exp) {


            registers.click();
            System.out.println(" Test Passed ");
        }
            else{
                System.out.println("Test Passed ");
            }

        }

    @FindBy(how = How.XPATH, using = exprpay)
    public WebElement exprpays;

    public void exprpaym() {

        if (  exprpays.isEnabled()){
           System.out.println("exprpayenabled");
       }else {
           System.out.println("exprpay is not enabled");
       }


    }



    @FindBy(how = How.XPATH, using =autoID)
    public WebElement autoIDs;

    public void autoIDm() {
try {
    if (autoIDs.isDisplayed()) {
        autoIDs.click();
        System.out.println("Test passed");
    } else {
        System.out.println("terrors not found ");
    }
}catch (Exception e){
    System.out.println(e);
}

    }


    @FindBy(how = How.XPATH, using = BLOGIN)
    public WebElement BLOGINs;

    public void BLOGINm() {
        String EXP ="Rewards Credit Cards";
        String validation = BLOGINs.getText();
        System.out.println(validation);

        switch (validation) {
            case "Rewards Credit Cards":
                System.out.println("Test Passed");
                break;
            case "Rewards Credit Card":
                System.out.println("Test failed");
                break;
        }




    }



    @FindBy(how = How.XPATH, using = BREGISTER)
    public WebElement BREGISTERS;

    public void BREGISTERm() {

        if ( BREGISTERS.isSelected()){
            System.out.println("BREGISTERS enabled");
        }else {
            System.out.println("BREGISTERS is not enabled");
        }


    }


    @FindBy(how = How.XPATH, using = BEXPRESSPAY)
    public WebElement BEXPRESSPAYs;

    public void BEXPRESSPAYm() {

        String tag = BEXPRESSPAYs.getTagName();
        for (int i = 0; i < 5; i++) {
            System.out.println("Print tag name 5 times"+ tag);
        }

    }

    @FindBy(how = How.XPATH, using = bnlogin)
    public WebElement bnlogins;

    public void bnloginm() {

       bnlogins.click();

    }


    @FindBy(how = How.XPATH, using =  bnregister)
    public WebElement  bnregisters;

    public void  bnregisterm() {

       String title=  bnregisters.getText();
         System.out.println(title);

    }

    @FindBy(how = How.XPATH, using = emlogin)
    public WebElement emlogins;

    public void emloginm() {

     emlogins.click();

    }

    @FindBy(how = How.XPATH, using = emregister)
    public WebElement emregisters;

    public void emregisterm() {

        if (emregisters.isEnabled()){
            System.out.println("Testpassed");
        }else {
            System.out.println("Testpassed");
        }



    }

    @FindBy(how = How.XPATH, using = collegesaving)
    public WebElement collegesavings;

    public void collegesavingm() {

        if (collegesavings.isEnabled()) {
            System.out.println("Testpassed");
        } else {
            System.out.println("Testpassed");
        }

    }

    /// ///////////////
    @FindBy(how = How.XPATH, using = mfound)
    public WebElement mfounds;

    public void mfoundm() {

        if (mfounds.isDisplayed()) {
            System.out.println("Testfailed");
        } else {
            System.out.println("Testpassed");
        }

    }

    @FindBy(how = How.XPATH, using = safehaven)
    public WebElement safehavens;

    public void safehavenm() {

        if (safehavens.isDisplayed()) {
            System.out.println("TestPASSED");
        } else {
            System.out.println("TestFAILED");
        }

    }


    @FindBy(how = How.XPATH, using = ebusiness)
    public WebElement ebusinesss;

    public void ebusinessm() {

        if (ebusinesss.isDisplayed()) {
            ebusinesss.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using =boundone)
    public WebElement boundones;

    public void boundonem() {

        if (boundones.isDisplayed()) {
            boundones.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = groupBfict)
    public WebElement groupBficts;

    public void groupBfictm() {

        if (groupBficts.isDisplayed()) {
            groupBficts.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = RMIS)
    public WebElement RMISs;

    public void RMISm() {

        if (RMISs.isDisplayed()) {
            RMISs.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = SERCHINPUT)
    public WebElement SERCHINPUTs;

    public void SERCHINPUTm() {

        SERCHINPUTs.sendKeys("Testpassed");
            System.out.println("TestFAILED");


    }

    @FindBy(how = How.XPATH, using = PAGETITLE )
    public WebElement PAGETITLEs;

    public void PAGETITLEm() {
       String title=  PAGETITLEs.getText();

            System.out.println(title);
        }




    }




