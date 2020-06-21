package airbnbHomePage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

import static airbnbHomePage.LoginWebElement.*;

public class LoginAirBnb extends WebAPI {

    @FindBy(how= How.XPATH,using = webElementLogin)
    public WebElement login;
    @FindBy(how=How.XPATH,using = webElementContinueWithEmail)
    public WebElement continueWithEmail;
    @FindBy(how=How.XPATH,using = webElementEmail)
    public WebElement email;
    @FindBy(how=How.XPATH,using = webElementPassword)
    public WebElement myPassword;
    @FindBy(how=How.XPATH,using = webElementLoginButton)
    public WebElement loginButton;
    @FindBy(how=How.XPATH,using = WebElementmiami)
    public WebElement miami;
    @FindBy(how=How.XPATH,using = webElementHouston)
    public WebElement houston;
    @FindBy(how=How.XPATH,using = webElementBoston)
    public WebElement boston;
    @FindBy(how=How.XPATH,using = webElementNewOrleans)
    public WebElement newOrleans;
    @FindBy(how = How.XPATH,using = webElementAustin)
    public WebElement austin;
    @FindBy(how = How.XPATH,using = webElementPhoenix)
    public WebElement phoenix;
    @FindBy(how = How.XPATH,using=webElementWashingtonDc)
    public WebElement washingtonDc;
    @FindBy(how = How.XPATH,using = webelementDenver)
    public WebElement denver;
    @FindBy(how=How.XPATH,using = WebElementCheckIn)
    public WebElement checkin;
    @FindBy(how=How.XPATH,using = webElementNextCalendar)
    public WebElement nextcalendar;
    @FindBy(how=How.XPATH,using = WebElementCheckIntDate)
    public WebElement checkInDate;
    @FindBy(how=How.XPATH,using = WebElementCheckOut)
    public WebElement checkOut;
    @FindBy(how=How.XPATH,using = WebElementCheckOutDate)
    public WebElement checkOutDate;
    @FindBy(how=How.XPATH,using = WebElementAdults)
    public WebElement adults;
    @FindBy(how=How.XPATH,using = webElementchildren)
    public WebElement children;
    @FindBy(how=How.XPATH,using = webElementSearchButton)
    public WebElement searchButton;
    public void ClickOnLogin() throws InterruptedException {
        login.click();
        Thread.sleep(3000);
    }
    public void clickOnContinueWithEmail() throws InterruptedException {
        ClickOnLogin();
        continueWithEmail.click();
    }
    public void sendCredentials() throws InterruptedException {
        clickOnContinueWithEmail();
         email.sendKeys(accountEmail);
        myPassword.sendKeys(accountPassword);
        Thread.sleep(3000);
    }
    public void clickOnLoginButton() throws InterruptedException {
                sendCredentials();
                loginButton.click();
                Thread.sleep(6000);
    }
    public void accountLoginWithExcel(String eAddress, String pwd) throws InterruptedException {
        ClickOnLogin();
        continueWithEmail.click();
        email.sendKeys(eAddress);
        myPassword.sendKeys(pwd);
        Thread.sleep(3000);
        loginButton.click();
        Thread.sleep(6000);
    }
    // scroll down method
public void scrollDownToMiami() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", miami);
     miami.click();
}
public void searchAirbnbMiami() throws InterruptedException {
        scrollDownToMiami();
    checkin.click();
    Thread.sleep(3000);
    nextcalendar.click();
    Thread.sleep(2000);
    checkInDate.click();
    Thread.sleep(2000);
    checkOut.click();
    Thread.sleep(2000);
     // javascript executor to click on element
       JavascriptExecutor js = ((JavascriptExecutor) driver);
    js.executeScript("arguments[0].click();", checkOutDate);
    Thread.sleep(2000);
    adults.sendKeys(nAdults);
    Thread.sleep(2000);
    children.sendKeys(nchildren);
    Thread.sleep(2000);
    searchButton.click();
    Thread.sleep(3000);
}
public void scrollDownToHouston(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", houston);
}
public void ClickOnHouston(){
    scrollDownToHouston();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        houston.click();
}
public void searchAirbnbHouston() throws InterruptedException {
    ClickOnHouston();
    checkin.click();
    Thread.sleep(3000);
    nextcalendar.click();
    Thread.sleep(2000);
    checkInDate.click();
    Thread.sleep(2000);
    checkOut.click();
    Thread.sleep(2000);
    // javascript executor to click on element
    JavascriptExecutor js = ((JavascriptExecutor) driver);
    js.executeScript("arguments[0].click();", checkOutDate);
    Thread.sleep(2000);
    adults.sendKeys(nAdults);
    Thread.sleep(2000);
    children.sendKeys(nchildren);
    Thread.sleep(2000);
    searchButton.click();
    Thread.sleep(3000);
}
    public void scrollDownToBoston(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", boston);
    }
    public void ClickOnBoston() {
        scrollDownToBoston();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boston.click();
    }
    public void searchAirbnbBoston() throws InterruptedException {
        ClickOnBoston();
        checkin.click();
        Thread.sleep(3000);
        nextcalendar.click();
        Thread.sleep(2000);
        checkInDate.click();
        Thread.sleep(2000);
        checkOut.click();
        Thread.sleep(2000);
        // javascript executor to click on element
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", checkOutDate);
        Thread.sleep(2000);
        adults.sendKeys(nAdults);
        Thread.sleep(2000);
        children.sendKeys(nchildren);
        Thread.sleep(2000);
        searchButton.click();
        Thread.sleep(3000);
    }
    public void scrollDownToNewOrleans(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", newOrleans);
    }
    public void ClickOnNewOrleans() {
        scrollDownToNewOrleans();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        newOrleans.click();
    }
    public void searchAirbnbNewOrleans() throws InterruptedException {
        ClickOnNewOrleans();
        checkin.click();
        Thread.sleep(3000);
        nextcalendar.click();
        Thread.sleep(2000);
        checkInDate.click();
        Thread.sleep(2000);
        checkOut.click();
        Thread.sleep(2000);
        // javascript executor to click on element
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", checkOutDate);
        Thread.sleep(2000);
        adults.sendKeys(nAdults);
        Thread.sleep(2000);
        children.sendKeys(nchildren);
        Thread.sleep(2000);
        searchButton.click();
        Thread.sleep(3000);
    }
    public void scrollDownToAustin(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", austin);
    }
    public void ClickAustin() {
        scrollDownToAustin();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        austin.click();
    }
    public void searchAirbnbAustin() throws InterruptedException {
        ClickAustin();
        checkin.click();
        Thread.sleep(3000);
        nextcalendar.click();
        Thread.sleep(2000);
        checkInDate.click();
        Thread.sleep(2000);
        checkOut.click();
        Thread.sleep(2000);
        // javascript executor to click on element
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", checkOutDate);
        Thread.sleep(2000);
        adults.sendKeys(nAdults);
        Thread.sleep(2000);
        children.sendKeys(nchildren);
        Thread.sleep(2000);
        searchButton.click();
        Thread.sleep(3000);
    }
    public void scrollDownToPhoenix(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", phoenix);
    }
    public void ClickPhoenix() {
        scrollDownToPhoenix();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        phoenix.click();
    }
    public void searchAirbnbPhoenix() throws InterruptedException {
        ClickPhoenix();
        checkin.click();
        Thread.sleep(3000);
        nextcalendar.click();
        Thread.sleep(2000);
        checkInDate.click();
        Thread.sleep(2000);
        checkOut.click();
        Thread.sleep(2000);
        // javascript executor to click on element
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", checkOutDate);
        Thread.sleep(2000);
        adults.sendKeys(nAdults);
        Thread.sleep(2000);
        children.sendKeys(nchildren);
        Thread.sleep(2000);
        searchButton.click();
        Thread.sleep(3000);
    }
    public void scrollDownToWashingtonDc(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", washingtonDc);
    }
    public void ClickWashingtonDc() {
        scrollDownToWashingtonDc();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        washingtonDc.click();
    }
    public void searchAirbnbWashingtonDc() throws InterruptedException {
        ClickWashingtonDc();
        checkin.click();
        Thread.sleep(3000);
        nextcalendar.click();
        Thread.sleep(2000);
        checkInDate.click();
        Thread.sleep(2000);
        checkOut.click();
        Thread.sleep(2000);
        // javascript executor to click on element
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", checkOutDate);
        Thread.sleep(2000);
        adults.sendKeys(nAdults);
        Thread.sleep(2000);
        children.sendKeys(nchildren);
        Thread.sleep(2000);
        searchButton.click();
        Thread.sleep(3000);
    }
    public void scrollDownToDenver(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", denver);
    }
    public void ClickDenver() {
        scrollDownToDenver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        denver.click();
    }
    public void searchAirbnbDenver() throws InterruptedException {
        ClickDenver();
        checkin.click();
        Thread.sleep(3000);
        nextcalendar.click();
        Thread.sleep(2000);
        checkInDate.click();
        Thread.sleep(2000);
        checkOut.click();
        Thread.sleep(2000);
        // javascript executor to click on element
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", checkOutDate);
        Thread.sleep(2000);
        adults.sendKeys(nAdults);
        Thread.sleep(2000);
        children.sendKeys(nchildren);
        Thread.sleep(2000);
        searchButton.click();
        Thread.sleep(3000);
    }
}