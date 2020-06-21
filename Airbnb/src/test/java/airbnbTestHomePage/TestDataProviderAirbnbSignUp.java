package airbnbTestHomePage;

import airbnbHomePage.SignUpPage;
import common.WebAPI;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;

public class TestDataProviderAirbnbSignUp extends WebAPI {

    SignUpPage signUpPage;
    public void getIniElement(){

        signUpPage= PageFactory.initElements(driver, SignUpPage.class);
    }
@DataProvider

    public Object[][] getTestData() throws IOException, InvalidFormatException, IOException, InvalidFormatException {
        Object data1 [][]= DataReader.fileReader3("oneSignUP");

        return data1;
    }
    @Test(dataProvider = "getTestData",enabled = false)
    public void testDataSignUp(String fName,String lName,String bDate,String eAddress,String pwd) throws InterruptedException {
         getIniElement();
      signUpPage.signUp(fName,lName,bDate,eAddress,pwd);








    }

}
