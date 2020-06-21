package airbnbTestHomePage;

import airbnbHomePage.LoginAirBnb;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;

public class TestLoginAirbnbExcel extends WebAPI {


    LoginAirBnb loginAirBnb;
    public void getInitElement(){
        loginAirBnb= PageFactory.initElements(driver,LoginAirBnb.class);
    }
    @DataProvider
    public Object[][] getTestData() throws IOException, InvalidFormatException, IOException, InvalidFormatException {
        Object data1[][] = DataReader.fileReader3("loginAirbnb");
        return data1;
    }
        @Test(dataProvider = "getTestData",enabled = false)
    public void testAccountLoginWithExcel(String eAddress,String pwd) throws InterruptedException {
    getInitElement();
    loginAirBnb.accountLoginWithExcel(eAddress,pwd);


    }

}
