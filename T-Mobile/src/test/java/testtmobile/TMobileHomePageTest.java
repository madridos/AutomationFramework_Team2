package testtmobile;

import common.WebAPI;
import hometmobile.TMobileHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static hometmobile.WebElement.webElementBanking;
import static hometmobile.WebElement.webElementHomeTitle;

public class TMobileHomePageTest extends WebAPI {

    static TMobileHomePage tMobileHomePage;


public void getInitElement(){

    tMobileHomePage= PageFactory.initElements(driver,TMobileHomePage.class);



}

  @Test(priority = 1,description = " this is logo test method")
    public void testLogo(){
    getInitElement();
    tMobileHomePage.validateLogo();
    }

  @Test(priority = 2)
    public void testTmobileHomePageTitle(){
        getInitElement();
         tMobileHomePage.validateTmobileHomePageTitle();
}
 @Test(priority = 3)
   public void testMouseHoverPlansWebElement() throws InterruptedException {
    getInitElement();
    tMobileHomePage.mouseHoverPlansWebElement();
}

    @Test(priority = 4,description = "to print webelements in plans ")
    public void testPlansListWebElements() throws InterruptedException {
        getInitElement();
        tMobileHomePage.plansListWebElements();
    }
    @Test(priority = 5)
    public void testMouseHoverPhoneAndDevicesWebElement() throws InterruptedException {
        getInitElement();
        tMobileHomePage.mouseHoverPhoneAndDevicesWebElement();
       // tMobileHomePage.phoneAndDevicesWebElements();
    }
    @Test(priority = 6)
public void testPhoneAndDevicesWebElements() throws InterruptedException {
    getInitElement();

    tMobileHomePage.phoneAndDevicesWebElements();

}
@Test(priority = 7)
public void testvalidatebusineesButton() throws InterruptedException {

    getInitElement();
    tMobileHomePage.validatebusineesButton();
}
@Test(priority = 8)
    public void testSearchButton() throws InterruptedException {
    getInitElement();
    tMobileHomePage.validateSearchButton();

}
@Test(priority = 9)
    public void testTvbutton() throws InterruptedException {
    getInitElement();
    tMobileHomePage.validateTvButton();
}

@Test(priority = 10)
    public void testTvTitle() throws InterruptedException {
    getInitElement();
    tMobileHomePage.validateTvHomePageTitle();
}

}
