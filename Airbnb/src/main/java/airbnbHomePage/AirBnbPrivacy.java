package airbnbHomePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static airbnbHomePage.AirbnbPrivacyWebElement.*;


public class AirBnbPrivacy extends WebAPI {
    @FindBy(how= How.XPATH,using=privacyButton)
    public WebElement privacyTab;

    // Generic method to click on webelements:
    public void clickOnWebElements(String element) throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(),'" + element + "')]")).click();
    }

public void clickOnPrivacy() {
  privacyTab.click();
  String actualTitle=driver.getTitle();
    System.out.println(actualTitle);
    Assert.assertEquals(expectedprivacyPagetitle,actualTitle);
}
public void clickOnIntroduction() throws InterruptedException {
        privacyTab.click();
        Thread.sleep(2000);
        clickOnWebElements(introduction);
        Thread.sleep(2000);
        String actualTitle=driver.getTitle();
    System.out.println(actualTitle);
}
    public void clickOnInformationWeCollect() throws InterruptedException {
        privacyTab.click();
        Thread.sleep(2000);
        clickOnWebElements(informationWeCollect);
        Thread.sleep(2000);
    }
    public void clickOnHowWeUseInfo() throws InterruptedException {
        privacyTab.click();
        Thread.sleep(2000);
        clickOnWebElements(howWeUseInformation);
        Thread.sleep(2000);
    }
    public void clickOnSharingAndDisclosure() throws InterruptedException {
        privacyTab.click();
        Thread.sleep(2000);
        clickOnWebElements(sharingAndDisclosure);
        Thread.sleep(2000);
    }
    public void clickOnOtherInfo() throws InterruptedException {
        privacyTab.click();
        Thread.sleep(2000);
        clickOnWebElements(otherInfo);
        Thread.sleep(2000);
    }
    public void clickOnYourRight() throws InterruptedException {
        privacyTab.click();
        Thread.sleep(2000);
        clickOnWebElements(urRight);
        Thread.sleep(2000);
    }
    public void clickOnOperatingGlobally() throws InterruptedException {
        privacyTab.click();
        Thread.sleep(2000);
        clickOnWebElements(opGlInTr);
        Thread.sleep(2000);
    }
    public void clickOnSecurity() throws InterruptedException {
        privacyTab.click();
        Thread.sleep(2000);
        clickOnWebElements(security);
        Thread.sleep(2000);
    }
    public void clickOnChaneToPrivacy() throws InterruptedException {
        privacyTab.click();
        Thread.sleep(2000);
        clickOnWebElements(changeToThisPrivacy);
        Thread.sleep(2000);
    }
    public void clickOnContactUs() throws InterruptedException {
        privacyTab.click();
        Thread.sleep(2000);
        clickOnWebElements(contactUs);
        Thread.sleep(2000);
    }







}