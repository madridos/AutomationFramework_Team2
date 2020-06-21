package airbnbTestHomePage;

import airbnbHomePage.AirBnbPrivacy;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.Objects;

public class TestAirbnbPrivacy extends WebAPI {
    AirBnbPrivacy airBnbPrivacy;
    public void getInitelement(){
        airBnbPrivacy= PageFactory.initElements(driver,AirBnbPrivacy.class);
    }
    @Test(priority = 1,enabled = false)
    public void testClickOnPrivacy(){
        getInitelement();
        airBnbPrivacy.clickOnPrivacy();
    }
    @Test(priority = 2,enabled = false)
    public void testClickOnIntroduction() throws InterruptedException {
        getInitelement();
        airBnbPrivacy.clickOnIntroduction();
    }
    @Test(priority = 3,enabled = false)
    public void testClickOnInformationWeCollect() throws InterruptedException {
        getInitelement();
        airBnbPrivacy.clickOnInformationWeCollect();
    }
@Test(priority = 4,enabled = false)
    public void testClickOnHowWeUseInfo() throws InterruptedException {
        getInitelement();
        airBnbPrivacy.clickOnHowWeUseInfo();
}
@Test(priority = 5,enabled = false)
    public void testclickOnSharingAndDisclosure() throws InterruptedException {
        getInitelement();
        airBnbPrivacy.clickOnSharingAndDisclosure();
}
@Test(priority = 6,enabled = false)
    public void testclickOnOtherInfo() throws InterruptedException {
        getInitelement();
        airBnbPrivacy.clickOnOtherInfo();
}
@Test(priority = 7,enabled = false)
    public void testClickOnYourRight() throws InterruptedException {
        getInitelement();
        airBnbPrivacy.clickOnYourRight();
}
@Test(priority = 8,enabled = false)
    public void testclickOnOperatingGlobally() throws InterruptedException {
        getInitelement();
        airBnbPrivacy.clickOnOperatingGlobally();
}
@Test(priority = 9,enabled = false)
    public void testClickOnSecurity() throws InterruptedException {
        getInitelement();
        airBnbPrivacy.clickOnSecurity();
}
@Test(priority = 10,enabled = false)
    public void testClickOnChaneToPrivacy() throws InterruptedException {
        getInitelement();
        airBnbPrivacy.clickOnChaneToPrivacy();
}
@Test(priority = 11,enabled = false)
    public void testclickOnContactUs() throws InterruptedException {
        getInitelement();
        airBnbPrivacy.clickOnContactUs();
}
}
