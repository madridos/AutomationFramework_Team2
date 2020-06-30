package home;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static home.HomePageWebElement.*;

public class HomePage extends WebAPI  {
    static WebDriverWait wait;

    @FindBy (how= How.XPATH,using =cickllogin )
    public WebElement aetnaLoginButton ;
    public void loginToaetna(){
        try{
            aetnaLoginButton.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
   @FindBy (how= How.XPATH,using =clickegister)
    public WebElement aetnaClickReister ;
    public void ClickRegisteraetna() {
        try{
            aetnaClickReister.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH,using =memberID)
    public WebElement aetnaMemberID ;
    public void aetnaMemberID() {
        try{
            String memberValidation= aetnaMemberID.getText();
            System.out.println(memberValidation);
            aetnaMemberID.sendKeys("100000000");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH,using =searchBox)
    public WebElement aetnasearchBox ;
    public void aetnasearchBox () throws InterruptedException {
        try{
            String exp = "search";
            String memberValidation= aetnasearchBox .getText();
            Assert.assertEquals(memberValidation,exp);
            System.out.println("Validation Passed");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH,using =findpharmacy)
    public WebElement aetnafindpharmacy ;
    public void aetnafindpharmacy () throws InterruptedException {
        try{
            aetnafindpharmacy.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH,using =shopPlan)
    public WebElement aetnashopPlan ;
    public void aetnashopPlans() throws InterruptedException {
        try{
            aetnashopPlan.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH, using =phamacies)
    public WebElement aetnaphamacies ;
    public void aetnaphamacies() throws InterruptedException {
        try{
            Actions actions = new Actions(driver);
            actions.moveToElement(aetnaphamacies).build().perform();
            aetnaphamacies.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH, using =ExploreSites)
    public WebElement aetnaExploreSites ;
    public void aetnaExploreSites() throws InterruptedException {
        try{
            aetnaExploreSites.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH, using =Aetnasite)
    public WebElement aetnaAetnasite ;
    public void aetnasite() throws InterruptedException {
        try{
            aetnaAetnasite.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH, using =orprovider)
    public WebElement aetnaAprovider ;
    public void aetnaAprovider() throws InterruptedException {
        try{
            aetnaAprovider.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH, using =employer)
    public WebElement aetnaemployer ;
    public void aetnaemployer () throws InterruptedException {
        try{
            aetnaemployer .click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH, using =aaents)
    public WebElement aetnaagentClick;
    public void aetnaagent () throws InterruptedException {
        try{
            aetnaagentClick.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH, using =partners )
    public WebElement aetnapartnersClick;
    public void aetnapartnersClick () throws InterruptedException {
        try{
            aetnapartnersClick.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH, using = careers )
    public WebElement careersClick;
    public void aetnacareersClick () throws InterruptedException {
        try{
            careersClick.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH, using = covid  )
    public WebElement readaetnastoryClick;
    public void readaetnastoryClick () throws InterruptedException {
        try{
            readaetnastoryClick.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH, using = resourses   )
    public WebElement resoursesClick;
    public void resoursesClick () throws InterruptedException {
        try{
            resoursesClick.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
   @FindBy (how= How.XPATH, using = facts   )
    public WebElement resoursesfacts;
    public void resoursesfacts() throws InterruptedException {
        try{
            resoursesfacts.click();
        }catch (Exception e){

            System.out.println(e);
        }
    }
   @FindBy (how= How.XPATH, using = products  )
    public WebElement resoursesproducts;
    public void resoursesproducts() throws InterruptedException {
        try{
            resoursesproducts.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH, using = feadback )
    public WebElement eatnafeadback;
    public void eatnafeadback() throws InterruptedException {
        try{
            eatnafeadback.click();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    @FindBy (how= How.XPATH, using = validateLogo )
    public WebElement eatnavalidateLogo;
    public void eatnaLogo() throws InterruptedException {
        try{
            String logotext = eatnavalidateLogo.getText();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    }
