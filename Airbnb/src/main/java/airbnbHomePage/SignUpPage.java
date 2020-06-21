package airbnbHomePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static airbnbHomePage.SignUpWebElements.*;

public class SignUpPage extends WebAPI {

@FindBy(how= How.XPATH,using = webElementSignUp)
    public WebElement signUpButton;
@FindBy(how=How.XPATH,using = webElementContinueWithEmail)
    public WebElement continueWithEmail;
@FindBy(how=How.XPATH,using = WebElementFirstName)
    public WebElement firstName;
@FindBy(how=How.XPATH,using = WebElementLastName)
public WebElement lastName;
@FindBy(how=How.XPATH,using=WebElementBirthDate)
    public WebElement birthDate;
@FindBy(how=How.XPATH,using = WebElementEmailAddress)
    public WebElement emailAdress;
@FindBy(how=How.XPATH,using = WebElementPassword)
    public WebElement password;
@FindBy(how=How.XPATH,using = WebElementcheckBox)
    public WebElement checkBox;
@FindBy(how=How.XPATH,using = WebElementAgreeButton)
    public WebElement agreeButton;
@FindBy(how=How.XPATH,using = webElementAgreeAndContinue)
public WebElement agreeAndContinue;
@FindBy(how=How.XPATH,using =webElementContinue )
public WebElement continueTo;
@FindBy(how=How.XPATH,using = webElementIllDoItLater)
public WebElement doItLater;
@FindBy(how=How.XPATH,using = webElementStartExploring)
public WebElement startExploring;

public void clickOnSignUp1() throws InterruptedException {
//    signUpButton.click(); // click on sign up button
//        Thread.sleep(2000);
}
public void clickOnContinueWithEmail() throws InterruptedException {
    clickOnSignUp1();
    //    continueWithEmail.click();//click on continue with email
//    firstName.clear();
}
public void sendCrendentials() throws InterruptedException {
    clickOnContinueWithEmail();
    //    firstName.sendKeys(FName);
//    lastName.clear();
//    lastName.sendKeys(LName);
//    birthDate.clear();
//    birthDate.sendKeys(BDTE);
//   Thread.sleep(3000);
//    emailAdress.clear();
//    emailAdress.sendKeys(EADS);
//    password.clear();
//    password.sendKeys(PWRD);
}
public void signUp1() throws InterruptedException {
    signUpButton.click(); // click on sign up button
    Thread.sleep(2000);
    continueWithEmail.click();//click on continue with email
    firstName.clear();
    firstName.sendKeys(FName);
    lastName.clear();
    lastName.sendKeys(LName);
    birthDate.clear();
    birthDate.sendKeys(BDTE);
    Thread.sleep(3000);
    emailAdress.clear();
    emailAdress.sendKeys(EADS);
    password.clear();
    password.sendKeys(PWRD);
    checkBox.click();
    agreeButton.click();
    Thread.sleep(3000);
    agreeAndContinue.click();
    Thread.sleep(2000);
    continueTo.click();
    Thread.sleep(2000);
    doItLater.click();
    doItLater.click();
    doItLater.click();
    doItLater.click();
    startExploring.click();
    Thread.sleep(10000);

}

    public void signUp(String fName,String lName,String bDate,String eAddress,String pwd) throws InterruptedException {
        signUpButton.click(); // click on sign up button
        Thread.sleep(2000);
        continueWithEmail.click();//click on continue with email
        firstName.clear();
        firstName.sendKeys(fName);
        lastName.clear();
        lastName.sendKeys(lName);
        birthDate.clear();
        birthDate.sendKeys(bDate);
        Thread.sleep(3000);
        emailAdress.clear();
        emailAdress.sendKeys(eAddress);
        password.clear();
        password.sendKeys(pwd);
        checkBox.click();
        agreeButton.click();
        Thread.sleep(3000);
        agreeAndContinue.click();
        Thread.sleep(2000);
        continueTo.click();
        Thread.sleep(2000);
        doItLater.click();
        doItLater.click();
        doItLater.click();
        doItLater.click();
        startExploring.click();


        Thread.sleep(10000);

    }







}
