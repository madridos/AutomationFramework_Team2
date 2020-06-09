package contactsupport;

import common.WebAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;

import static contactsupport.WebElement.webelementconntactsupport;

import static contactsupport.WebElement.Click1T800;
import static contactsupport.WebElement.Checkorderstatus;
import static contactsupport.WebElement.enterEmail;
import static contactsupport.WebElement.clickNext;
import static contactsupport.WebElement.setID;
////
import static contactsupport.WebElement.enterFN;
import static contactsupport.WebElement.enterLN;
import static contactsupport.WebElement.enterNumber;
import static contactsupport.WebElement.enterPs;

public class ContactSupportPage extends WebAPI {


//page factory
    @FindBy(how= How.XPATH,using=webelementconntactsupport)
    public WebElement contactsupoortbutton;





    @FindBy(how= How.XPATH,using=Click1T800)
    public WebElement openT800;


    @FindBy(how= How.XPATH,using=Checkorderstatus)
    public WebElement Orderstatus;


    @FindBy(how= How.XPATH,using=enterEmail )
    public WebElement enterEmailS;


    @FindBy(how= How.XPATH,using=clickNext )
    public WebElement click_next;


    @FindBy(how= How.XPATH,using=setID )
    public WebElement NEWID;

    @FindBy(how= How.XPATH,using=enterFN)
    public WebElement firstname;

    @FindBy(how= How.XPATH,using=enterLN)
    public WebElement lastname;

    @FindBy(how= How.XPATH,using=enterNumber)
    public WebElement num;

    @FindBy(how= How.XPATH,using=enterPs)
    public WebElement PSW;

    // action method
    public void validatecontactsupport(){
        contactsupoortbutton.click();

    }

    public void OpenT800(){
        openT800.click();

    }

    public void OpenOrder(){
        Orderstatus.click();

    }

    public void email(){
        enterEmailS.sendKeys("kabylia75@hotmail.com");

    }

    public void C_clickNext(){
        click_next.click();

    }

    public void new_ID(){
        NEWID.click();

    }

    public void firstn(){
        firstname.sendKeys("yasmine");

    }

    public void lastn(){
        lastname.sendKeys("mokraoui");

    }

    public void number(){
        num.sendKeys("8605552523");

    }

    public void PW(){
        PSW.sendKeys("TEST123");

    }








}
