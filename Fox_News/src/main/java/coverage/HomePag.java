package coverage;

import common.WebAPI;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.DataReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

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

    @FindBy(how = How.XPATH, using = ClickMore )
    public WebElement ClickMorelink;

    public  void ClickMorelink() {

        ClickMorelink.click();
    }

    @FindBy(how = How.XPATH, using = searchNews)
    public WebElement searchNewsTV;

    public void searchNewsTV() {


        searchNewsTV.sendKeys("Crime");
    }

    @FindBy(how = How.XPATH, using = millitary)
    public WebElement millitaryinfos;

    public void millitaryinfos() {
        String act = "Military";
        String exp =millitaryinfos.getText();
        System.out.println(exp);
        if (act == exp) {


            millitaryinfos.click();
            System.out.println("zak Test Passed ");
        }
            else{
                System.out.println("Test Passed ");
            }

        }

    @FindBy(how = How.XPATH, using = education)
    public WebElement beducations;

    public void beducation() {

        if (  beducations.isEnabled()){
           System.out.println("beducation enabled");
       }else {
           System.out.println("beducation is not enabled");
       }


    }



    @FindBy(how = How.XPATH, using = terror)
    public WebElement terrors;

    public void terrorm() {
try {
    if (terrors.isDisplayed()) {
        terrors.click();
        System.out.println("Test passed");
    } else {
        System.out.println("terrors not found ");
    }
}catch (Exception e){
    System.out.println(e);
}

    }


    @FindBy(how = How.XPATH, using = migration)
    public WebElement migrations;

    public void migrationm() {
        String EXP ="Rewards Credit Cards";
        String validation = migrations.getText();
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

    @FindBy(how = How.XPATH, using = economy)
    public WebElement economyS;

    public void economym() {

        if ( economyS.isSelected()){
            System.out.println("economyS enabled");
        }else {
            System.out.println("economyS is not enabled");
        }


    }


    @FindBy(how = How.XPATH, using = freedom)
    public WebElement freedoms;

    public void freedomm() {

        String tag = freedoms.getTagName();
        for (int i = 0; i < 5; i++) {
            System.out.println("Print tag name 5 times"+ tag);
        }

    }

    @FindBy(how = How.XPATH, using = foxnews)
    public WebElement foxnewss;

    public void foxnewsm() {

        foxnewss.click();

    }


    @FindBy(how = How.XPATH, using = livestyle)
    public WebElement livestyles;

    public void livestylem() {

        livestyles.sendKeys("MYPW");

    }

    @FindBy(how = How.XPATH, using = drink)
    public WebElement drinks;

    public void drinkm() {

       drinks.click();

    }

    @FindBy(how = How.XPATH, using = cars)
    public WebElement carss;

    public void carsm() {

        if (carss.isEnabled()){
            System.out.println("Testpassed");
        }else {
            System.out.println("Testpassed");
        }



    }

    @FindBy(how = How.XPATH, using = traveles)
    public WebElement traveless;

    public void travelesm() {

        if (traveless.isEnabled()) {
            System.out.println("Testpassed");
        } else {
            System.out.println("Testpassed");
        }

    }

    /// ///////////////
    @FindBy(how = How.XPATH, using = house)
    public WebElement houses;

    public void housem() {

        if (houses.isDisplayed()) {
            System.out.println("Testfailed");
        } else {
            System.out.println("Testpassed");
        }

    }

    @FindBy(how = How.XPATH, using = fitness)
    public WebElement fitnesss;

    public void fitnessm() {

        if (fitnesss.isDisplayed()) {
            System.out.println("TestPASSED");
        } else {
            System.out.println("TestFAILED");
        }

    }


    @FindBy(how = How.XPATH, using = style)
    public WebElement styles;

    public void stylem() {

        if (styles.isDisplayed()) {
            styles.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using =family)
    public WebElement familys;

    public void familym() {

        if (familys.isDisplayed()) {
            familys.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = faith)
    public WebElement faiths;

    public void faithm() {

        if (faiths.isDisplayed()) {
            faiths.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = other)
    public WebElement others;

    public void otherm() {

        if (others.isDisplayed()) {
            others.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = foxnotation)
    public WebElement foxnotations;

    public void foxnotationm() {

        if (foxnotations.isDisplayed()) {
            foxnotations.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = newsapp )
    public WebElement newsapps;

    public void newsappm() {

        if (newsapps .isDisplayed()) {
            newsapps .click();
        } else {
            System.out.println("TestFAILED");
        }

    }
/*
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

*/


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




