package foxNewsHomePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

import static foxNewsHomePage.FoxWebElements.*;

public class FoxHomePage extends WebAPI {
    @FindBy(how=How.XPATH,using = webElementfoxHeader)
    public WebElement foxHeader;
    @FindBy(how= How.XPATH,using =  webElementLogo)
    public WebElement logo;
  @FindBy(how=How.XPATH,using = webElementCoronaVirus)
  public WebElement coronaVirusTab;
  @FindBy(how=How.XPATH,using = webElementUS)
  public WebElement UStab;
  @FindBy(how=How.XPATH,using = webElementWorld)
  public WebElement worldTab;
  @FindBy(how=How.XPATH,using = webelementOpinion)
  public WebElement opinionTab;
  @FindBy(how=How.XPATH,using=webelementPolitics)
  public WebElement politicsTab;
  @FindBy(how=How.XPATH,using=webelementEntertainments)
  public WebElement entertainmentTab;
  @FindBy(how=How.XPATH,using=webelementBusinness)
  public WebElement businessTab;
  @FindBy(how=How.XPATH,using=webelementTv)
  public WebElement tvTab;
  @FindBy(how=How.XPATH,using=webelementFoxNation)
  public WebElement foxNationTab;
  @FindBy(how=How.XPATH,using = webelementListen)
  public WebElement listenTab;
  @FindBy(how=How.XPATH,using = webelementMore)
  public WebElement moreTab;
  @FindBy(how=How.XPATH,using = webelementLogin)
  public WebElement loginTab;
  @FindBy(how=How.XPATH,using = webelementWatchTv)
  public WebElement watchTvTab;
  @FindBy(how=How.XPATH,using = webElementTopicSeattle)
  public WebElement topicSeattleTab;
  @FindBy(how=How.XPATH,using=webElementTopicGeorgeFloyd)
  public WebElement floydTab;
  @FindBy(how=How.XPATH,using = webElementTopicCoronaVirus)
  public WebElement topicCovidTab;
  @FindBy(how=How.XPATH,using = webelementTopicJoeBidden)
  public WebElement biddenTab;
    public void validateLogo(){
        boolean logoDisplayed =  logo.isDisplayed();
        if (logoDisplayed == true) {
            System.out.println("the Fox News logo is displayed" );
        }else {
            System.out.println("the Fox News logo is Not displayed");
        }
    }
    public void validateFoxNewsHomePageTitle(){
        String homePageTitle = driver.getTitle();
        String expectedHomeTitle = expectedHomePageTitle;
        System.out.println("home page title====> " +homePageTitle);
        Assert.assertEquals(homePageTitle, expectedHomePageTitle);
    }
    public void headerListWebElements() throws InterruptedException {
        List<WebElement> list = driver.findElements(By.xpath(webElementfoxHeader));
        for (WebElement element : list){
            String text = element.getText();
            System.out.println(text);
        }
    }
    // verify if the elements are clickable
    public void clickOnCoronavirus(){
        coronaVirusTab.click();
        String actualTitle=driver.getTitle();
        System.out.println("coronaVirus Title =====> "+actualTitle);
        Assert.assertEquals(expectedcoronavirustitle,actualTitle);
    }
    public void clickOnUs(){
        UStab.click();
        String actualTitle=driver.getTitle();
        System.out.println("US Title =====> "+actualTitle);
        Assert.assertEquals(expectedUsTitle,actualTitle);
    }
    public void clickOnWorld(){
        worldTab.click();
        String actualTitle=driver.getTitle();
        System.out.println("World Title =====> "+actualTitle);
       Assert.assertEquals(expectedWorldTitle,actualTitle);
    }
    public void clickOnOpinion(){
        opinionTab.click();
        String actualTitle=driver.getTitle();
        System.out.println("Opinion Title =====> "+actualTitle);
        Assert.assertEquals(expectedOpinionTitle,actualTitle);
    }
    public void clickOnPolitics(){
        politicsTab.click();
        String actualTitle=driver.getTitle();
        System.out.println("Politics Title =====> "+actualTitle);
        Assert.assertEquals(expectedPoliticsTitle,actualTitle);
    }
    public void clickOnEntertainment(){
        entertainmentTab.click();
        String actualTitle=driver.getTitle();
        System.out.println("Entertainment Title =====> "+actualTitle);
        Assert.assertEquals(expectedEntertainmentTitle,actualTitle);
    }
    public void clickOnBusiness() throws InterruptedException {
        businessTab.click();
        Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        System.out.println("Business Title =====> "+actualTitle);
       Assert.assertEquals(expectedBusinessTitle,actualTitle);
    }
    public void clickOnTv() throws InterruptedException {
        tvTab.click();
        Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        System.out.println("TV Title =====> "+actualTitle);
        Assert.assertEquals(expectedTvTitle,actualTitle);
    }
    public void clickOnNation() throws InterruptedException {
        foxNationTab.click();
        Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        System.out.println("Nation Title =====> "+actualTitle);
        Assert.assertEquals(expectedNationtitle,actualTitle);
    }
    public void clickOnListen() throws InterruptedException {
        listenTab.click();
        Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        System.out.println("Listen Title =====> "+actualTitle);
        Assert.assertEquals(expectedListenTitle,actualTitle);
    }
    public void clickOnMore() throws InterruptedException {
        moreTab.click();
        Thread.sleep(3000);
        String actualTitle=driver.getTitle();
        System.out.println("More Title =====> "+actualTitle);
        Assert.assertEquals(expectedMoreTitle,actualTitle);
    }
}
