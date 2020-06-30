package testcontactsupport;

import common.WebAPI;
import contactsupport.ContactSupportPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ContactSupportTest extends WebAPI {

    ContactSupportPage contactsup;

    public void initElements(){
         contactsup = new ContactSupportPage();
        contactsup= PageFactory.initElements(driver,ContactSupportPage.class);

    }


  @Test(priority=0)
    public void clickOnContactSupport() throws InterruptedException {
        initElements();
        Thread.sleep(2000);
     // contactsup.validatecontactsupport();
       contactsup.supoortbutton();
    }
    @Test(priority=1)
    public void click_T800() throws InterruptedException {

        initElements();
        Thread.sleep(2000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.OpenT800();

    }
   @Test(priority=2)
    public void click_Order() throws InterruptedException {

        initElements();
        Thread.sleep(4000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.OpenOrder();
    }
 @Test(priority=3)
    public void enter_email() throws InterruptedException {
        initElements();
        Thread.sleep(4000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.OpenOrder();
       Thread.sleep(4000);
        contactsup.email();
    }
   @Test(priority=4)
    public void nextButton() throws InterruptedException {

        initElements();
        Thread.sleep(4000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.OpenOrder();
        Thread.sleep(4000);
        contactsup.email();
        Thread.sleep(6000);
        contactsup.C_clickNext();
        Thread.sleep(100);
    }
  @Test(priority=5)
    public void N_ID() throws InterruptedException {
      initElements();
      Thread.sleep(4000);
      contactsup.supoortbutton();
      Thread.sleep(4000);
      contactsup.OpenOrder();
      Thread.sleep(90000);
      contactsup.new_ID();
    }
   @Test(priority=6)
    public void FM() throws InterruptedException {
      initElements();
      Thread.sleep(9000);
      contactsup.supoortbutton();
      Thread.sleep(4000);
      contactsup.OpenOrder();
       Thread.sleep(900);
       contactsup.new_ID();
      Thread.sleep(90000);
      contactsup.firstn();
    }
  @Test(priority=7)
    public void LM() throws InterruptedException {
      initElements();
      Thread.sleep(9000);
      contactsup.supoortbutton();
      Thread.sleep(4000);


      contactsup.new_ID();
      Thread.sleep(90000);
        contactsup.lastn();
    }
  @Test(priority=8)
    public void NUMBER() throws InterruptedException {
      initElements();
      Thread.sleep(1000);
        contactsup.supoortbutton();
      Thread.sleep(4000);
      contactsup.OpenOrder();
      Thread.sleep(9000);
      contactsup.new_ID();
      Thread.sleep(9000);
        contactsup.number();
    }
    @Test(priority=9)
    public void emailcot() throws InterruptedException {
        initElements();
        Thread.sleep(1000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.OpenOrder();
        Thread.sleep(9000);
        contactsup.new_ID();
        Thread.sleep(9000);
        contactsup.emailcot();
    }
   @Test(priority=10)
    public void PW() throws InterruptedException {
       initElements();
       Thread.sleep(1000);
       contactsup.supoortbutton();
       Thread.sleep(4000);
       contactsup.OpenOrder();
       Thread.sleep(9000);
       contactsup.new_ID();
       Thread.sleep(9000);
       contactsup.PW();
    }
    @Test(priority=11)
    public void paygusta() throws InterruptedException {
        initElements();
        Thread.sleep(1000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.OpenOrder();
        Thread.sleep(9000);
        contactsup.paygusta();
    }
    @Test(priority=12)
    public void supporf() throws InterruptedException {
        initElements();
        Thread.sleep(1000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.OpenOrder();
        Thread.sleep(9000);
        contactsup.supporf();
    }
    @Test(priority=13)
    public void storlocationz() throws InterruptedException {
        initElements();
        Thread.sleep(1000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.OpenOrder();
        Thread.sleep(9000);
        contactsup.storlocationz() ;
    }
    @Test(priority=14)
    public void connvergez() throws InterruptedException {
        initElements();
        Thread.sleep(1000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.OpenOrder();
        Thread.sleep(9000);
        contactsup.connvergez() ;
    }
    @Test(priority=15)
    public void tmobilezz()throws InterruptedException {
        initElements();
        Thread.sleep(1000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.OpenOrder();
        Thread.sleep(9000);
        contactsup.tmobilezz() ;
    }
    @Test(priority=16)
    public void helpz()throws InterruptedException {
        initElements();
        Thread.sleep(1000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.helpz();
    }

    @Test(priority=17)
    public void payz()throws InterruptedException {


        initElements();
        Thread.sleep(1000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.helpz();
        Thread.sleep(4000);
        contactsup.payz();



    }

    @Test(priority=18)
    public void appz()throws InterruptedException {


        initElements();
        Thread.sleep(1000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.helpz();
        Thread.sleep(4000);
        contactsup.appz();



    }

    @Test(priority=19)
    public void managez() throws InterruptedException {


        initElements();
        Thread.sleep(1000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.helpz();
        Thread.sleep(4000);
        contactsup.managez() ;



    }

    @Test(priority=20)
    public void managev() throws InterruptedException {


        initElements();
        Thread.sleep(1000);
        contactsup.supoortbutton();
        Thread.sleep(4000);
        contactsup.helpz();
        Thread.sleep(4000);
        contactsup.managev() ;



    }



}
