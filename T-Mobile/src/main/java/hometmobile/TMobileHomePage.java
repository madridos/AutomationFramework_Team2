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



}
