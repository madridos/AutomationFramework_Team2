package testcoverage;

import common.WebAPI;
import coverage.CoveragePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CoveragePageTest extends WebAPI {
   static CoveragePage covtest ;

   public void initElement(){
     covtest = PageFactory.initElements(driver,CoveragePage.class);
   }


   @Test
   public void testCoverage(){
       initElement();
       covtest.validateCov();
   }

   @Test
   public void testCheckBusiness(){
       initElement();
       covtest.checkBusinessPanel();
   }

   @Test
    public void testCheckWireless(){
       initElement();
       covtest.checkWirelessPanel();
   }

    @Test
    public void testCheckTv(){
       initElement();
       covtest.checkTvPanel();
    }

    @Test
    public void testCheckBank(){
       initElement();
       covtest.checkBankPanel();
    }

    @Test
    public void testCheckprPaid(){
       initElement();
       covtest.checkprPaidPanel();
    }

    @Test
    public void testCheckCart(){
       initElement();
       covtest.checkCart();

    }

    @Test
    public void testCheckSearchIcon(){
       initElement();
       covtest.checkSearchIcon();

    }

    @Test
   public void testTmobileLogo(){
       initElement();
       covtest.checkTmobileLogo();

    }


    @Test
    public void testFindStoreLink(){
       initElement();
       covtest.checkFindStore();
    }



}
