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
    public void clickOnContactSupport(){
        initElements();
      // contactsup.validatecontactsupport();
       contactsup.supoortbutton();



    }


    //@Test(priority=1)
    public void click_T800() throws InterruptedException {

        initElements();
        contactsup.supoortbutton();
        Thread.sleep(2000);
        contactsup.OpenT800();


    }


   // @Test(priority=2)
    public void click_Order(){


        contactsup.OpenOrder();


    }


  //  @Test(priority=3)
    public void enter_email(){


        contactsup.email();


    }

   // @Test(priority=4)
    public void nextButton(){


        contactsup.C_clickNext();


    }


  //  @Test(priority=5)
    public void N_ID(){


        contactsup.new_ID();


    }

   // @Test(priority=6)
    public void FM(){


        contactsup.firstn();


    }

  // @Test(priority=7)
    public void LM(){


        contactsup.lastn();


    }

  // @Test(priority=8)
    public void NUMBER(){


        contactsup.number();


    }

  //  @Test(priority=9)
    public void PW(){


        contactsup.PW();


    }


}
