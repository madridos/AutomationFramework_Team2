package contactsupport;

import common.WebAPI;
import io.cucumber.java.an.E;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;

////
import static contactsupport.WebElement.*;


public class ContactSupportPage extends WebAPI {


    //page factory
    @FindBy(how = How.XPATH, using = webelementconntactsupport)
    public WebElement contactsupoortbutton;

    public void supoortbutton() {
        try {

            Actions builder = new Actions(driver);

            builder.moveToElement(contactsupoortbutton)
                    .build().perform();


            //contactsupoortbutton.click();
        } catch (Exception e) {

            System.out.println(e);
        }

    }

    @FindBy(how = How.XPATH, using = Click1T800)
    public WebElement openT800;

    public void opent800() {
        try {
            openT800.click();
        } catch (Exception e) {

            System.out.println(e);
        }

    }

    @FindBy(how = How.XPATH, using = Checkorderstatus)
    public WebElement Orderstatus;
    public void Orderstatus() {
        try {
            Orderstatus.click();
        } catch (Exception e) {

            System.out.println(e);
        }

    }


    @FindBy(how = How.XPATH, using = enterEmail)
    public WebElement enterEmailS;


    @FindBy(how = How.XPATH, using = clickNext)
    public WebElement click_next;


    @FindBy(how = How.XPATH, using = setID)
    public WebElement NEWID;

    @FindBy(how = How.XPATH, using = enterFN)
    public WebElement firstname;

    @FindBy(how = How.XPATH, using = enterLN)
    public WebElement lastname;

    @FindBy(how = How.XPATH, using = enterNumber)
    public WebElement num;

    @FindBy(how = How.XPATH, using = enterPs)
    public WebElement PSW;


    @FindBy(how = How.XPATH, using = enterf)
    public WebElement enteremail;

    public void emailcot() {
        enteremail.sendKeys("yasmine@gmail.com");

    }


    @FindBy(how = How.XPATH, using = paygust)
    public WebElement paygusta;

    public void paygusta() {


        try {
            String t = paygusta.getText();
            System.out.println(t);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FindBy(how = How.XPATH, using = supporta)
    public WebElement supportaz;

    public void supporf() {


        try {
            String t = supportaz.getText();
            System.out.println(t);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @FindBy(how = How.XPATH, using = storlocation)
    public WebElement storlocationz;

    public void storlocationz() {


        try {
            String t = storlocationz.getText();
            System.out.println(t);

        } catch (Exception e) {
            System.out.println(e);
        }

    }


    @FindBy(how = How.XPATH, using = connverge )
    public WebElement connvergez;

    public void connvergez() {


        try {
            String t = connvergez.getText();
            System.out.println(t);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @FindBy(how = How.XPATH, using = tmobilez )
    public WebElement tmobilezz;

    public void tmobilezz() {


        try {
            String t = tmobilezz.getText();
            System.out.println(t);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @FindBy(how = How.XPATH, using = help)
    public WebElement helpz;

    public void helpz() {


        try {
            String t = helpz.getText();
            System.out.println(t);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @FindBy(how = How.XPATH, using = pay)
    public WebElement payz;

    public void payz() {


        try {
            String t = payz.getText();
            System.out.println(t);

        } catch (Exception e) {
            System.out.println(e);
        }

    }


    @FindBy(how = How.XPATH, using = app)
    public WebElement appz;

    public void appz() {


        try {
            String t = appz.getText();
            System.out.println(t);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @FindBy(how = How.XPATH, using = manage )
    public WebElement managez;

    public void managez() {


        try {
            String t = managez.getText();
            System.out.println(t);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @FindBy(how = How.XPATH, using = manage )
    public WebElement managev;

    public void managev() {


        try {
            String t = managez.getTagName();
            System.out.println(t);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // action method
    public void validatecontactsupport() {
        contactsupoortbutton.click();

    }

    public void OpenT800() {
        openT800.click();

    }

    public void OpenOrder() {
        Orderstatus.click();

    }

    public void email() {
        try {
            enterEmailS.sendKeys("kabylia75@hotmail.com");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void C_clickNext() {

        try {
            click_next.click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void new_ID() {
        try {
            NEWID.click();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void firstn() {
        try {
            firstname.sendKeys("yasmine");
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public void lastn() {
        try {
            lastname.sendKeys("mokraoui");
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public void number() {
        try {
            num.sendKeys("8605552523");
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public void PW() {
        try {
            PSW.sendKeys("TEST123");
        } catch (Exception e) {
            System.out.println(e);
        }


    }


}




