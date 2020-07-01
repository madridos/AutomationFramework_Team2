package myTestRunner;

import common.WebAPI;
import myAccount.MyFoxNewsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTests extends WebAPI {
    MyFoxNewsPage foxnews;
    public void elements(){
        foxnews= PageFactory.initElements(driver,MyFoxNewsPage.class);
    }
    @BeforeMethod
    public void beforeMeth(){
        elements();
        foxnews.seeWorldNews();
    }
  //  @Test(priority=1)
    public void viewImageTest(){
        foxnews.viewImage();
    }
    @Test(priority=2)
    public void viewLinkTest(){
        foxnews.viewImage();
        foxnews.viewLink1();
    }
}
