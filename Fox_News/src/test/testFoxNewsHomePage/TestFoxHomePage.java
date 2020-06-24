package testFoxNewsHomePage;

import common.WebAPI;
import foxNewsHomePage.FoxHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestFoxHomePage extends WebAPI {
    FoxHomePage foxHomePage;
    public void getInitElement(){
        foxHomePage= PageFactory.initElements(driver,FoxHomePage.class);
    }
    @Test(priority = 1,enabled = false)
    public void testvalidateLogo(){
        getInitElement();
        foxHomePage.validateLogo();
    }
    @Test(priority = 2,enabled = false)
    public void testValidateFoxNewsHomePageTitle(){
        getInitElement();
        foxHomePage.validateFoxNewsHomePageTitle();
    }
    @Test(priority = 3,enabled = false)
    public void testHeaderListWebElements() throws InterruptedException {
        getInitElement();
        foxHomePage.headerListWebElements();
    }
    @Test(priority = 4,enabled = false)
    public void testclickOnCoronavirus(){
        getInitElement();
        foxHomePage.clickOnCoronavirus();
    }
    @Test(priority = 5,enabled = false)
    public void testclickOnUs(){
        getInitElement();
        foxHomePage.clickOnUs();
    }
    @Test(priority = 6,enabled = false)
    public void testclickOnWorld(){
        getInitElement();
        foxHomePage.clickOnWorld();
    }
    @Test(priority = 7,enabled = false)
    public void testClickOnOpinion(){
        getInitElement();
        foxHomePage.clickOnOpinion();
    }
    @Test(priority = 8,enabled = false)
    public void testClickOnPolitics(){
        getInitElement();
        foxHomePage.clickOnPolitics();
    }
    @Test(priority = 9,enabled = false)
    public void testClickOnEntertainment(){
        getInitElement();
        foxHomePage.clickOnEntertainment();
    }
    @Test(priority = 10,enabled = false)
    public void testClickOnBusiness() throws InterruptedException {
        getInitElement();
        foxHomePage.clickOnBusiness();
    }
    @Test(priority = 11,enabled = false)
    public void testClickOnTv() throws InterruptedException {
        getInitElement();
        foxHomePage.clickOnTv();
    }
    @Test(priority = 12,enabled = false)
    public void testClickOnNation() throws InterruptedException {
        getInitElement();
        foxHomePage.clickOnNation();
    }
    @Test(priority = 13,enabled = false)
    public void testClickOnListen() throws InterruptedException {
        getInitElement();
        foxHomePage.clickOnListen();
    }
    @Test(priority = 14,enabled = false)
    public void testClickOnMore() throws InterruptedException {
        getInitElement();
        foxHomePage.clickOnMore();
    }
}
