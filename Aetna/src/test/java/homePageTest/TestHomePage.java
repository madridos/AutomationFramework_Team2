package homePageTest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestHomePage extends WebAPI {


    HomePage homepage = PageFactory.initElements(driver,HomePage.class);
//        driver.findElement(By.xpath("aetnaLoginButtonXp")).click();



    @Test
    public void testClickLogin(){



    }


}
