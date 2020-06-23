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

    @FindBy(how = How.XPATH, using = vacation )
    public WebElement vacations;

    public  void vacationm() {

        vacations.click();
    }

    @FindBy(how = How.XPATH, using = bookflight)
    public WebElement bookflights;

    public void bookflightm() {


        String title= bookflights.getText();
        System.out.println(title);
    }

    @FindBy(how = How.XPATH, using = routemap)
    public WebElement routemaps;

    public void routemapm() {
        String act = "Military";
        String exp =routemaps.getText();
        System.out.println(exp);
        if (act == exp) {


            routemaps.click();
            System.out.println("zak Test Passed ");
        }
            else{
                System.out.println("Test Passed ");
            }

        }

    @FindBy(how = How.XPATH, using = flightschedule)
    public WebElement flightschedules;

    public void flightschedulem() {

        if ( flightschedules.isEnabled()){
           System.out.println("beducation enabled");
       }else {
           System.out.println("beducation is not enabled");
       }


    }



    @FindBy(how = How.XPATH, using = internationalTravel)
    public WebElement internationalTravels;

    public void internationalTravelm() {
try {
    if (internationalTravels.isDisplayed()) {
        internationalTravels.click();
        System.out.println("Test passed");
    } else {
        System.out.println("terrors not found ");
    }
}catch (Exception e){
    System.out.println(e);
}

    }


    @FindBy(how = How.XPATH, using = flightoffers)
    public WebElement flightofferss;

    public void flightoffersm() {
        String EXP ="  chnageme";
        String validation = flightofferss.getText();
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

    @FindBy(how = How.XPATH, using = lowfare)
    public WebElement lowfareS;

    public void lowfarem() {

        if ( lowfareS.isSelected()){
            System.out.println("economyS enabled");
        }else {
            System.out.println("economyS is not enabled");
        }


    }


    @FindBy(how = How.XPATH, using = upgrade)
    public WebElement upgrades;

    public void upgradem() {

        String tag = upgrades.getTagName();
        for (int i = 0; i < 5; i++) {
            System.out.println("Print tag name 5 times"+ tag);
        }

    }

    @FindBy(how = How.XPATH, using = bookhotel)
    public WebElement bookhotels;

    public void bookhotelm() {

        bookhotels.click();

    }


    @FindBy(how = How.XPATH, using = morethanHotel)
    public WebElement morethanHotels;

    public void morethanHotelm() {

        morethanHotels.click();

    }

    @FindBy(how = How.XPATH, using = managerreservation)
    public WebElement managerreservations;

    public void managerreservationm() {

        managerreservations.click();

    }

    @FindBy(how = How.XPATH, using = hotelOffer)
    public WebElement hotelOffers;

    public void hotelOfferm() {

        if (hotelOffers.isEnabled()){
            System.out.println("Testpassed");
        }else {
            System.out.println("Testpassed");
        }



    }

    @FindBy(how = How.XPATH, using = baserate)
    public WebElement baserates;

    public void baseratem() {

        if (baserates.isEnabled()) {
            System.out.println("Testpassed");
        } else {
            System.out.println("Testpassed");
        }

    }


    @FindBy(how = How.XPATH, using = rapidreward)
    public WebElement rapidrewards;

    public void rapidrewards() {

        if (rapidrewards.isDisplayed()) {
            System.out.println("Testfailed");
        } else {
            System.out.println("Testpassed");
        }

    }

    @FindBy(how = How.XPATH, using = whybook)
    public WebElement whybooks;

    public void whybookm() {

        if (whybooks.isDisplayed()) {
            System.out.println("TestPASSED");
        } else {
            System.out.println("TestFAILED");
        }

    }


    @FindBy(how = How.XPATH, using = scarental)
    public WebElement scarentals;

    public void scarentalm() {

        if (scarentals.isDisplayed()) {
            scarentals.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using =managereservation)
    public WebElement managereservations;

    public void managereservationm() {

        if (managereservations.isDisplayed()) {
            managereservations.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = caroffers)
    public WebElement carofferss;

    public void caroffersm() {

        if (carofferss.isDisplayed()) {
            carofferss.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = bookvacation)
    public WebElement bookvacations;

    public void bookvacationm() {

        if (bookvacations.isDisplayed()) {
            bookvacations.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = managervacation)
    public WebElement managervacations;

    public void managervacationm() {

        if (managervacations.isDisplayed()) {
            managervacations.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = vacationpackge )
    public WebElement vacationpackges;

    public void vacationpackgem() {

        if (vacationpackges .isDisplayed()) {
            vacationpackges .click();
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

    @FindBy(how = How.XPATH, using = vacation )
    public WebElement vacations;

    public  void vacationm() {

        vacations.click();
    }

    @FindBy(how = How.XPATH, using = bookflight)
    public WebElement bookflights;

    public void bookflightm() {


        String title= bookflights.getText();
        System.out.println(title);
    }

    @FindBy(how = How.XPATH, using = routemap)
    public WebElement routemaps;

    public void routemapm() {
        String act = "Military";
        String exp =routemaps.getText();
        System.out.println(exp);
        if (act == exp) {


            routemaps.click();
            System.out.println("zak Test Passed ");
        }
            else{
                System.out.println("Test Passed ");
            }

        }

    @FindBy(how = How.XPATH, using = flightschedule)
    public WebElement flightschedules;

    public void flightschedulem() {

        if ( flightschedules.isEnabled()){
           System.out.println("beducation enabled");
       }else {
           System.out.println("beducation is not enabled");
       }


    }



    @FindBy(how = How.XPATH, using = internationalTravel)
    public WebElement internationalTravels;

    public void internationalTravelm() {
try {
    if (internationalTravels.isDisplayed()) {
        internationalTravels.click();
        System.out.println("Test passed");
    } else {
        System.out.println("terrors not found ");
    }
}catch (Exception e){
    System.out.println(e);
}

    }


    @FindBy(how = How.XPATH, using = flightoffers)
    public WebElement flightofferss;

    public void flightoffersm() {
        String EXP ="  chnageme";
        String validation = flightofferss.getText();
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

    @FindBy(how = How.XPATH, using = lowfare)
    public WebElement lowfareS;

    public void lowfarem() {

        if ( lowfareS.isSelected()){
            System.out.println("economyS enabled");
        }else {
            System.out.println("economyS is not enabled");
        }


    }


    @FindBy(how = How.XPATH, using = upgrade)
    public WebElement upgrades;

    public void upgradem() {

        String tag = upgrades.getTagName();
        for (int i = 0; i < 5; i++) {
            System.out.println("Print tag name 5 times"+ tag);
        }

    }

    @FindBy(how = How.XPATH, using = bookhotel)
    public WebElement bookhotels;

    public void bookhotelm() {

        bookhotels.click();

    }


    @FindBy(how = How.XPATH, using = morethanHotel)
    public WebElement morethanHotels;

    public void morethanHotelm() {

        morethanHotels.click();

    }

    @FindBy(how = How.XPATH, using = managerreservation)
    public WebElement managerreservations;

    public void managerreservationm() {

        managerreservations.click();

    }

    @FindBy(how = How.XPATH, using = hotelOffer)
    public WebElement hotelOffers;

    public void hotelOfferm() {

        if (hotelOffers.isEnabled()){
            System.out.println("Testpassed");
        }else {
            System.out.println("Testpassed");
        }



    }

    @FindBy(how = How.XPATH, using = baserate)
    public WebElement baserates;

    public void baseratem() {

        if (baserates.isEnabled()) {
            System.out.println("Testpassed");
        } else {
            System.out.println("Testpassed");
        }

    }

    /// ///////////////
    @FindBy(how = How.XPATH, using = rapidreward)
    public WebElement rapidrewards;

    public void rapidrewards() {

        if (rapidrewards.isDisplayed()) {
            System.out.println("Testfailed");
        } else {
            System.out.println("Testpassed");
        }

    }

    @FindBy(how = How.XPATH, using = whybook)
    public WebElement whybooks;

    public void whybookm() {

        if (whybooks.isDisplayed()) {
            System.out.println("TestPASSED");
        } else {
            System.out.println("TestFAILED");
        }

    }


    @FindBy(how = How.XPATH, using = scarental)
    public WebElement scarentals;

    public void scarentalm() {

        if (scarentals.isDisplayed()) {
            scarentals.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using =managereservation)
    public WebElement managereservations;

    public void managereservationm() {

        if (managereservations.isDisplayed()) {
            managereservations.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = caroffers)
    public WebElement carofferss;

    public void caroffersm() {

        if (carofferss.isDisplayed()) {
            carofferss.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = bookvacation)
    public WebElement bookvacations;

    public void bookvacationm() {

        if (bookvacations.isDisplayed()) {
            bookvacations.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = managervacation)
    public WebElement managervacations;

    public void managervacationm() {

        if (managervacations.isDisplayed()) {
            managervacations.click();
        } else {
            System.out.println("TestFAILED");
        }

    }

    @FindBy(how = How.XPATH, using = vacationpackge )
    public WebElement vacationpackges;

    public void vacationpackgem() {

        if (vacationpackges .isDisplayed()) {
            vacationpackges .click();
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




