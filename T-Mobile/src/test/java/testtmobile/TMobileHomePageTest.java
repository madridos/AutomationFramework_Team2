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
  @Test(priority = 1,description = " this is logo test method",enabled = true)
    public void testLogo(){
    getInitElement();
    tMobileHomePage.validateLogo();
    }

  @Test(priority = 2,enabled = true)
    public void testTmobileHomePageTitle(){
        getInitElement();
         tMobileHomePage.validateTmobileHomePageTitle();
}
  @Test(priority = 3,enabled = true)
   public void testMouseHoverPlansWebElement() throws InterruptedException {
    getInitElement();
    tMobileHomePage.mouseHoverPlansWebElement();
}

    @Test(priority = 4,description = "to print webelements in plans ",enabled = true)
    public void testPlansListWebElements() throws InterruptedException {
        getInitElement();
        tMobileHomePage.plansListWebElements();
    }
    @Test(priority = 5,enabled = true)
    public void testMouseHoverPhoneAndDevicesWebElement() throws InterruptedException {
        getInitElement();
        tMobileHomePage.mouseHoverPhoneAndDevicesWebElement();
        tMobileHomePage.phoneAndDevicesWebElements();
    }
    @Test(priority = 6,enabled = true)
public void testPhoneAndDevicesWebElements() throws InterruptedException {
    getInitElement();

    tMobileHomePage.phoneAndDevicesWebElements();

}
  @Test(priority = 7,enabled = true)
public void testvalidatebusineesButton() throws InterruptedException {

    getInitElement();
    tMobileHomePage.validatebusineesButton();
}
 @Test(priority = 8,enabled = true)
    public void testSearchButton() throws InterruptedException {
    getInitElement();
    tMobileHomePage.validateSearchButton();

}
   @Test(priority = 9,enabled = true)
    public void testTvbutton() throws InterruptedException {
    getInitElement();
    tMobileHomePage.validateTvButton();
}

  @Test(priority = 10,enabled = true)
    public void testTvTitle() throws InterruptedException {
    getInitElement();
    tMobileHomePage.validateTvHomePageTitle();
}


  @Test(priority = 11,enabled = true)
    public void testClikOnMagentaPlus() throws InterruptedException {
    getInitElement();
    tMobileHomePage.clickOnMagentaPlus();

}

    @Test(priority = 12,enabled = true)
    public void testClikOnEssentials() throws InterruptedException {
        getInitElement();
        tMobileHomePage.clickOnEssentials();

    }
    @Test(priority = 13,enabled = true)
    public void testClickOnUnlimitedAge55() throws InterruptedException {
        getInitElement();
        tMobileHomePage.clickOnUnlimitedAge55();

    }
    @Test(priority = 14,enabled = true)
    public void testClickOnMilitaryAndVeterans() throws InterruptedException {
        getInitElement();
        tMobileHomePage.clickOnMilitaryAndVeterans();

    }


    @Test(priority = 15,enabled = true)
    public void testClickOnFirstReply() throws InterruptedException {
        getInitElement();
        tMobileHomePage.clickOnFirstReply();

    }
    @Test(priority = 16,enabled = true)
    public void testClickOnPhonesAndDevices() throws InterruptedException {
    getInitElement();
    tMobileHomePage.clickOnPhonesAndDevices();
    }
    @Test(priority = 17,enabled = true)
    public void testClickOnTabletsAndDevices() throws InterruptedException {
    getInitElement();
    tMobileHomePage.clickOnTabletsAndDevices();
    }
    @Test(priority = 18,enabled = true)
    public void testClickOnAccessories() throws InterruptedException {
    getInitElement();
    tMobileHomePage.clickOnAccessories();
    }
    @Test(priority = 19,enabled = true)
    public void testClickOnBringYourOwnPhone() throws InterruptedException {
    getInitElement();
    tMobileHomePage.clickOnBringYourOwnPhone();
    }
    @Test(priority = 20,enabled = true)
    public void testmouseHoverDealsWebElement() throws InterruptedException {
        getInitElement();
        tMobileHomePage.mouseHoverDealsWebElement();
    }
    @Test(priority = 21,enabled = true)
    public void testDealsListWebElements() throws InterruptedException {
    getInitElement();
    tMobileHomePage.dealsListWebElements();
    }
@Test(priority = 22,enabled = true)
    public void testClickOnOverview() throws InterruptedException {
    getInitElement();
    tMobileHomePage.clickOnOverview();
}
@Test(priority = 23,enabled = true)
    public void testClickOnFiveGCoverageMap() throws InterruptedException {
    getInitElement();
    tMobileHomePage.clickOnFiveGCoverageMap();
}
@Test(priority = 24,enabled = true)
    public void testClickOnWhatIs5G() throws InterruptedException {
    getInitElement();
    tMobileHomePage.clickOnWhatIs5G();
}
@Test(priority = 25,enabled = true)
    public void testClickOnBenefits() throws InterruptedException {
    getInitElement();
    tMobileHomePage.clickOnWhyTMobile();
}
}
