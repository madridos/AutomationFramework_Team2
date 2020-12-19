package myAccountRunner;

import common.WebAPI;
import myAccount.MyBarnesPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTests extends WebAPI {
    MyBarnesPage barnesnoble;
    public void init(){
        barnesnoble= PageFactory.initElements(driver, MyBarnesPage.class);
}
   @BeforeMethod
   public void startingBrowser(){
        init();
   }
      @Test(priority=1)
    public void clickBooksTest() throws InterruptedException {
        barnesnoble.clickOnBooks();
    }
    @Test(priority=2)
    public void findTopBooksTest() throws InterruptedException {
        barnesnoble.findTopBooks();
    }
    @Test(priority=3)
    public void findRoomBookTest() throws InterruptedException {
        barnesnoble.findRoomBook();
    }
    @Test(priority=4)
    public void signInTest() throws InterruptedException {
        barnesnoble.setSignIn();
    }
    @Test(priority=5)
    public void setEmailTest() throws InterruptedException {
        barnesnoble.enterEmail();
    }
    }