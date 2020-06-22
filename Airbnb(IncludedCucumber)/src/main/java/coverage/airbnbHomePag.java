package coverage;
import common.WebAPI;

import databases.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import utility.DataReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import static coverage.WebElementCoverage.*;

public class airbnbHomePag extends WebAPI {

    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;
    DataReader excel = new DataReader();
    public static String max;
    public static String min;
    public static  String data0;
    public static  String data1;

    @FindBy(how = How.XPATH, using = onlineExpriaces)
    public WebElement ClickonlineExpriaces;

    public  void ClickonlineExpriaces() {
        ClickonlineExpriaces.click();
    }

    @FindBy(how = How.XPATH, using = date)
    public WebElement Clickdate;

    public void Clickdate() {
        Clickdate.click();
    }

    @FindBy(how = How.XPATH, using = Price)
    public WebElement ClickPrice;

    public void ClickPrice()
    {


        ClickPrice.click();
    }

    @FindBy(how = How.XPATH, using = Shareall)
    public WebElement clickShareall;

    public void clickShareall() {
        clickShareall.click();
    }

    @FindBy(how = How.XPATH, using = Hostyourhome)
    public WebElement clickHostyourhome;

    public void clickHostyourhome() {
        clickHostyourhome.click();
    }

    @FindBy(how = How.XPATH, using = enterprice)
    public WebElement enterpriceN;

    public void setEnterprice() throws InterruptedException {
        enterpriceN.click();
        enterpriceM.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        Thread.sleep(200);
        enterpriceN.sendKeys(min);
    }

    @FindBy(how = How.XPATH, using = enterpricemax)
    public WebElement enterpriceM;

    public void setEnterpriceMAX() throws InterruptedException {
        enterpriceM.click();
        enterpriceM.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        Thread.sleep(200);
        enterpriceM.sendKeys(max);
    }

    @FindBy(how = How.CSS, using = Clicksave)
    public WebElement clicksave;

    public void cSave() {
        clicksave.click();
    }

    @FindBy(how = How.XPATH, using = clcikDay)
    public WebElement clickDay;

    public void clickDay() throws InterruptedException {
        clickDay.click();
    }

    @FindBy(how = How.XPATH, using = morningbox)
    public WebElement mornigcheckbox;

    public void mornigcheckbox() throws InterruptedException {

        if (mornigcheckbox.isSelected()) {

            System.out.println("Checbox is selected");
        } else {
            mornigcheckbox.click();
        }
    }

    @FindBy(how = How.XPATH, using = date)
    public WebElement selectdate;

    public void selectdate() {

        try {
            String xpath = "//*[@id=\"filter-menu-chip-group\"]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/table";
            List<WebElement> allDates = driver.findElements(By.xpath(xpath));

            for (WebElement num : allDates) {

                String date = num.getText();
                System.out.println(date);

                if (date.equalsIgnoreCase(data0)) {
                    num.click();
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println("This IS THE ERROR" + e);
        }
    }

    @FindBy(how = How.XPATH, using = openimage)

    public WebElement imageselect;

    public void findimage() throws InterruptedException {
        imageselect.click();

    }

    @FindBy(how = How.XPATH, using = getimage)

    public WebElement getimageS;

    public void getimageS() throws InterruptedException {
        String imagename = getimageS.getTagName();
        System.out.println("Imagename =" + imagename);

    }


    @FindBy(how = How.XPATH, using = gDropArow)

    public WebElement clickarrow;

    public void clickarrow() throws InterruptedException {

        Actions actions = new Actions(driver);
        actions.moveToElement(clickarrow).build().perform();
        clickarrow.click();

    }

    // Reading Excel:

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




