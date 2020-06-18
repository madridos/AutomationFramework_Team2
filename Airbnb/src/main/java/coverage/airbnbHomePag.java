package coverage;
import common.WebAPI;

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
import utility.DataReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;


import static coverage.WebElementCoverage.*;

public class airbnbHomePag extends WebAPI {


    DataReader excel = new DataReader();

    @FindBy(how = How.XPATH, using = onlineExpriaces)
    public WebElement ClickonlineExpriaces;

    public void ClickonlineExpriaces() {
        ClickonlineExpriaces.click();
    }

    @FindBy(how = How.XPATH, using = date)
    public WebElement Clickdate;

    public void Clickdate() {
        Clickdate.click();
    }

    @FindBy(how = How.XPATH, using = Price)
    public WebElement ClickPrice;

    public void ClickPrice() {
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
        enterpriceN.sendKeys("200");
    }

    @FindBy(how = How.XPATH, using = enterpricemax)
    public WebElement enterpriceM;

    public void setEnterpriceMAX() throws InterruptedException {
        enterpriceM.click();
        enterpriceM.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
        Thread.sleep(200);
        enterpriceM.sendKeys("5000");
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

                if (date.equalsIgnoreCase("28")) {
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
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        // creating WORSHEET OBJECT
        XSSFSheet sheet1=wb.getSheetAt(0);
        // CREATING INT VARIABLE TO SAVE ROWCOUNT
        int rowcount=sheet1.getLastRowNum();
        // PRINT TOTAL ROM
        System.out.println("Total Row" + rowcount);
        // LOOPING IN THE EXCEL SHEET
        for(int i=0;i<rowcount+1;i++) {
            System.out.println(i);
            //GET CELL
            Cell cell1 = sheet1.getRow(i).getCell(0);
            //SET AS STRING TYPE
            cell1.setCellType(Cell.CELL_TYPE_STRING);
            String data0= cell1.getStringCellValue();
            // PRINT CELL
            System.out.println("Test Data From Excel : "+data0);
        }

        wb.close();
    }





    }

