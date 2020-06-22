package coverage;

import common.WebAPI;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import sun.jvm.hotspot.utilities.Assert;
import utility.DataReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.List;
import java.util.Properties;

import static coverage.WebElementCoverage.*;

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

    @FindBy(how = How.XPATH, using = opeencreditCard )
    public WebElement CreditCard;

    public  void Clickcreeditcard() {

        CreditCard.click();
    }

    @FindBy(how = How.XPATH, using = viewcreditcard)
    public WebElement viewcreditcards;

    public void viewcards() {


        viewcreditcards.click();
    }

    @FindBy(how = How.XPATH, using = apr)
    public WebElement APRS;

    public void APRS() {
        String act = "0% Intro APR Credit Cards";
        String exp =APRS.getText();
        if (act == exp) {


            APRS.click();
            System.out.println("Test Passed ");
        }
            else{
                System.out.println("Test Passed ");
            }

        }

    @FindBy(how = How.XPATH, using = balance)
    public WebElement balances;

    public void vbalances() {

        if ( balances.isEnabled()){
           System.out.println("Balance enabled");
       }else {
           System.out.println("Balance is not enabled");
       }


    }

    @FindBy(how = How.XPATH, using = cach)
    public WebElement Bankcach;

    public void Bankcach() {
try {
    if (Bankcach.isDisplayed()) {
        Bankcach.click();
        System.out.println("Test passed");
    } else {
        System.out.println("Bankcach not found ");
    }
}catch (Exception e){
    System.out.println(e);
}

    }


    @FindBy(how = How.XPATH, using = reward)
    public WebElement Bankreward;

    public void Bankreward() {
        String EXP ="Rewards Credit Cards";
        String validation = Bankreward.getText();
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

    @FindBy(how = How.XPATH, using = qualifieB)
    public WebElement qualifieS;

    public void qualifieS() {

        if ( qualifieS.isSelected()){
            System.out.println("qualifie enabled");
        }else {
            System.out.println("qualifie is not enabled");
        }


    }


    @FindBy(how = How.XPATH, using = smallBusines)
    public WebElement smallBusinesm;

    public void smallBusinesm() {

        String tag = smallBusinesm.getTagName();
        for (int i = 0; i < 5; i++) {
            System.out.println("Print tag name 5 times"+ tag);
        }

    }

    @FindBy(how = How.XPATH, using = username)
    public WebElement enterusername;

    public void enterusername() {

        enterusername.sendKeys("MYUSERNAME");

    }


    @FindBy(how = How.XPATH, using = PW)
    public WebElement enterPW;

    public void enterPW() {

        enterPW.sendKeys("MYPW");

    }

    @FindBy(how = How.XPATH, using = Clicknext)
    public WebElement CLCIK_Clicknext;

    public void CLCIK_Clicknext() {

        CLCIK_Clicknext.click();

    }

    @FindBy(how = How.XPATH, using = forgetID)
    public WebElement forgetIDS;

    public void forgetIDS() {

        if (forgetIDS.isEnabled()){
            System.out.println("Testpassed");
        }else {
            System.out.println("Testpassed");
        }



    }

    @FindBy(how = How.XPATH, using = ACIVECARD)
    public WebElement ACIVECARDlink;

    public void ACIVECARDlink() {

        if (ACIVECARDlink.isEnabled()) {
            System.out.println("Testpassed");
        } else {
            System.out.println("Testpassed");
        }

    }

    /// ///////////////
    @FindBy(how = How.XPATH, using = forgetPW)
    public WebElement getforgetPW;

    public void getforgetPW() {

        if (getforgetPW.isDisplayed()) {
            System.out.println("Testfailed");
        } else {
            System.out.println("Testpassed");
        }

    }

    @FindBy(how = How.XPATH, using = REGISTERoNLINE)
    public WebElement checkREGISTERoNLINE;

    public void checkREGISTERoNLINE() {

        if (checkREGISTERoNLINE.isDisplayed()) {
            System.out.println("TestPASSED");
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = REMEBREid)
    public WebElement SELECTREMEBREid;

    public void SELECTREMEBREid() {

        if (SELECTREMEBREid.isDisplayed()) {
            SELECTREMEBREid.click();
        } else {
            System.out.println("TestFAILED");
        }

    }
//THIS
    @FindBy(how = How.XPATH, using = banking)
    public WebElement OPENbanking;

    public void OPENbanking() {

        if (OPENbanking.isDisplayed()) {
            OPENbanking.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = bankingview)
    public WebElement OPENbankingview;

    public void OPENbankingview() {

        if (OPENbankingview.isDisplayed()) {
            OPENbankingview.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = checking)
    public WebElement OPENchecking;

    public void OPENchecking() {

        if (OPENchecking.isDisplayed()) {
            OPENchecking.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = saving)
    public WebElement OPENsaving;

    public void OPENsaving() {

        if (OPENsaving.isDisplayed()) {
            OPENsaving.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = certification)
    public WebElement OPENcertification;

    public void OPENcertification() {

        if (OPENcertification.isDisplayed()) {
            OPENcertification.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    public void excel() throws InterruptedException, IOException {

        // Excel location
        String path = ("C:\\Users\\mokraoui\\Desktop\\airbnbTest.xlsx");

        //passing the path to file object
        File file = new File(path);
        // passing file object to fileinputstream
        FileInputStream fis = new FileInputStream(file);
        // creating XSSWORKBOOK OBJECT
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        // creating WORSHEET OBJECT
        XSSFSheet sheet1 = wb.getSheetAt(0);
        // CREATING INT VARIABLE TO SAVE ROWCOUNT
        int rowcount = sheet1.getLastRowNum();
        // PRINT TOTAL ROM
      //  System.out.println("Total Row" + rowcount);
        // LOOPING IN THE EXCEL SHEET
        for (int i = 0; i < rowcount + 1; i++) {
           // System.out.println(i);
            //GET CELL
            Cell cell1 = sheet1.getRow(i).getCell(0);
            Cell cell2 = sheet1.getRow(i).getCell(1);
            //SET AS STRING TYPE
            cell1.setCellType(Cell.CELL_TYPE_STRING);
            cell2.setCellType(Cell.CELL_TYPE_STRING);
             data0 = cell1.getStringCellValue();
             data1 = cell2.getStringCellValue();


        }
// PRINT CELL
        System.out.println("Test Data From Excel : " + data0);
        System.out.println("Test Data From Excel : " + data1);
        wb.close();
    }


// SQL DB:

    public static Properties loadProperties() throws IOException {
        String path = "src\\secret.properties";
        Properties prop = new Properties();
        InputStream ism = new FileInputStream(path);
        prop.load(ism);
        ism.close();
        return prop;
    }

    public static Connection connectToSqlDatabase() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties();
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url, userName, password);
        System.out.println("Database is connected");
        return connect;
    }
    public static void queryDB() throws SQLException {
        Statement stmt ;
        stmt = connect.createStatement();
        try{
            String query = "select Min,Max from airbnbtab";

            //String query2 = " insert into users (id,SortingNumbers)" + " values (?, ?)";

// Get the contents of userinfo table from DB
            ResultSet res = stmt.executeQuery(query);


// Print the result untill all the records are printed
// res.next() returns true if there is any next record else returns false
            while (res.next())
            {
                 min = res.getString(1);
                max ="  " + res.getString(2);
                System.out.println("This min value:" + min );
                System.out.println("This maxn value:" + max);

            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }




        // cucumber method
    /*
        @When("User Navigate to LogIn Page")
        public void user_Navigate_to_LogIn_Page() throws InterruptedException {
            WebElement login = driver.findElement(By.xpath( "//a[@class='_1p3k2so']"));
            Thread.sleep(2000);
            login.click();
            System.out.println("TEST PASSED");

        }

     */

    }




