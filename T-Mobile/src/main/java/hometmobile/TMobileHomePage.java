package hometmobile;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import java.util.List;

import static hometmobile.WebElement.*;

public class TMobileHomePage extends WebAPI {



    @FindBy(how= How.CSS,using= webElementLogoId)
    public WebElement logo;
    @FindBy(how=How.LINK_TEXT,using = webElementHomeTitle)
    public WebElement title;
    @FindBy(how=How.ID,using = webElementPlans)
    public WebElement plansTab;
    @FindBy(how=How.ID,using = webElementDeal)
    public WebElement dealsTab;
    @FindBy(how=How.XPATH,using = webElementDealsList)
    public WebElement dealsList;
    @FindBy(how=How.ID,using = webElementCoverage)
    public WebElement coverageTab;
    @FindBy(how=How.ID,using = webElementBenifitsAndMore)
    public WebElement benifitAndMoreTab;
    @FindBy(how = How.XPATH,using=webElementPlansList)
    public List<WebElement>  plansList;
    @FindBy(how=How.ID,using =webElementPhonesAndDevices )
    public WebElement phoneAndDevices;
    @FindBy(how=How.ID,using = webElementbusinnesbutton)
    public WebElement businnesButton;
    @FindBy(how = How.XPATH,using =webElementSearchbutton )
    public WebElement searchButton;
  @FindBy(how=How.XPATH,using = webElementTv)
  public WebElement buttonTv;
  @FindBy(how=How.LINK_TEXT,using=webElementTvHomeTitle)
  public WebElement tvTitle;

 public void validateLogo(){
     boolean logoDisplayed =  logo.isDisplayed();
     if (logoDisplayed == true) {
         System.out.println("the T-mobile logo is displayed" );
     }else {
         System.out.println("the T-mobile logo is Not displayed");
     }
 }
public void validateTmobileHomePageTitle(){
   String homePageTitle = driver.getTitle();
   String expectedHomePageTitle= "Unlimited Plans, Cell Phones, Evolving 4G & 5G Coverage | T-Mobile";
    System.out.println("home page title====> " +homePageTitle);
    Assert.assertEquals(homePageTitle, expectedHomePageTitle);
    }
    // Generic method to click on webelements:
    public void clickOnWebElements(String element) throws InterruptedException {
     driver.findElement(By.xpath("//*[contains(text(),'" + element + "')]")).click();
 }
// Generic method for mouseHover:
    public void mouseHoverWebElement(WebElement webElement) throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).build().perform();
        Thread.sleep(3000);
    }
// mouseHoverToPlans:
public void mouseHoverPlansWebElement() throws InterruptedException {
    mouseHoverWebElement(plansTab);
}
// print method webElementsPlans:
public void plansListWebElements() throws InterruptedException {
    mouseHoverWebElement(plansTab);
    List<WebElement> list = driver.findElements(By.xpath(webElementPlansList));
    for (WebElement element : list){
        String text = element.getText();
        System.out.println(text);
    }
}
    // mouseHoverToPhoneAndDevices:
    public void mouseHoverPhoneAndDevicesWebElement() throws InterruptedException {
        mouseHoverWebElement(phoneAndDevices);
    }

//print method webElementsPhoneAndDervices
public void phoneAndDevicesWebElements() throws InterruptedException {

     mouseHoverWebElement(phoneAndDevices);
     List<WebElement> phoneList= driver.findElements(By.xpath(webElementPhoneAndDevicesList));
     for(WebElement element2:phoneList ){
         String text2 = element2.getText();
         System.out.println(text2);
     }

    }
//click on businnesButton:
   public void validatebusineesButton() throws InterruptedException {
      try {
          mouseHoverWebElement(businnesButton);
          Thread.sleep(2000);
          businnesButton.click();
          Thread.sleep(4000);
      }catch (Exception e){
          System.out.println("got exception");
      }

   }
   //searchButton:
   public void validateSearchButton() throws InterruptedException {

       searchButton.click();
       Thread.sleep(3000);
   }

    public void validateTvButton() throws InterruptedException {
        try {
            mouseHoverWebElement(buttonTv);
            Thread.sleep(2000);
            buttonTv.click();
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println("got exception");
        }

    }
    public void validateTvHomePageTitle() throws InterruptedException {
        validateTvButton();
        String tvActualTitle = webElementTvHomeTitle;
        String expectedTvPageTitle= "TVision Home TV Services: An Alternative to Cable TV | T-Mobile";
        System.out.println("home page title====> " +tvActualTitle);
        Assert.assertEquals(tvActualTitle, expectedTvPageTitle);
    }
    public void clickOnMagentaPlus() throws InterruptedException {

        mouseHoverWebElement(plansTab);
        Thread.sleep(3000);
        clickOnWebElements(magentaPlus);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedMagentaPlusTitle,actualTitle);

    }
    public void clickOnEssentials() throws InterruptedException {
        mouseHoverWebElement(plansTab);
        Thread.sleep(3000);
        clickOnWebElements(essentials);
        Thread.sleep(3000);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedEssentialsTitle,actualTitle);

    }
    public void clickOnUnlimitedAge55() throws InterruptedException {
        mouseHoverWebElement(plansTab);
        Thread.sleep(3000);
        clickOnWebElements(unlimitedAge55);
        Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedUnlimitedAge55Title,actualTitle);

    }
    public void clickOnMilitaryAndVeterans() throws InterruptedException {
        mouseHoverWebElement(plansTab);
        Thread.sleep(2000);
        clickOnWebElements(militaryAndVeterans);
        Thread.sleep(3000);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
       Assert.assertEquals(expectedMilitaryAndVeteransTitle,actualTitle);
    }
    public void clickOnFirstReply() throws InterruptedException {
        mouseHoverWebElement(plansTab);
        Thread.sleep(3000);
        clickOnWebElements(firstReply);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedFirstReplyTitle,actualTitle);
    }
    public void clickOnPhonesAndDevices() throws InterruptedException {
        mouseHoverWebElement(phoneAndDevices);
        Thread.sleep(3000);
        clickOnWebElements(cellPhones);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedCellPhonesTitle,actualTitle);
    }
    public void clickOnTabletsAndDevices() throws InterruptedException {
        mouseHoverWebElement(phoneAndDevices);
        Thread.sleep(3000);
        clickOnWebElements(tabletsANdDevices);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTabletsAndDevicesTitle,actualTitle);
    }
    public void clickOnSmartWatches() throws InterruptedException {
        mouseHoverWebElement(phoneAndDevices);
        Thread.sleep(3000);
        clickOnWebElements(smartWatches);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedSmartWatchestitle,actualTitle);
    }
    public void clickOnAccessories() throws InterruptedException {
        mouseHoverWebElement(phoneAndDevices);
        Thread.sleep(3000);
        clickOnWebElements(accessories);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedAccessoriesTitle,actualTitle);
    }
    public void clickOnBringYourOwnPhone() throws InterruptedException {
        mouseHoverWebElement(phoneAndDevices);
        Thread.sleep(3000);
        clickOnWebElements(bringYourOwnPhone);
        Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedBringYourOwnPhoneTitle,actualTitle);
    }

    public void mouseHoverDealsWebElement() throws InterruptedException {
        mouseHoverWebElement(dealsTab);
    }
    // print list of deal
    public void dealsListWebElements() throws InterruptedException {
        mouseHoverWebElement(dealsTab);
        Thread.sleep(3000);
        List<WebElement> list = driver.findElements(By.xpath(webElementDealsList));
        for (WebElement element : list) {
            String text = element.getText();
            System.out.println(text);
        }
    }
    public void clickOnOverview() throws InterruptedException {
        mouseHoverWebElement(coverageTab);
        Thread.sleep(3000);
        clickOnWebElements(overview);
        Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedOverviewTitle,actualTitle);
    }
    public void clickOnFiveGCoverageMap() throws InterruptedException {
        mouseHoverWebElement(coverageTab);
        Thread.sleep(3000);
        clickOnWebElements(fiveGCoverageMap);
        Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedFiveGCovergaeMapTitle,actualTitle);
    }
    public void clickOnWhatIs5G() throws InterruptedException {
        mouseHoverWebElement(coverageTab);
        Thread.sleep(3000);
        clickOnWebElements(Whatis5G);
        Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedWhatis5GTitle,actualTitle);
    }
    public void clickOnWhyTMobile() throws InterruptedException {
        mouseHoverWebElement(benifitAndMoreTab);
        Thread.sleep(3000);
        clickOnWebElements(whyTMobile);
        Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedWhyTMobileTitle,actualTitle);
    }
}
