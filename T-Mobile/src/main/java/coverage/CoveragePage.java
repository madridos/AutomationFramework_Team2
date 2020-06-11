package coverage;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static coverage.WebElementCoverage.*;


public class CoveragePage extends WebAPI {
    @FindBy(how = How.XPATH, using = webEleCovfeature )
    public WebElement CovButton;

    public void validateCov() {
        CovButton.click();
    }

    @FindBy(how = How.CLASS_NAME, using = webEle5Glink )
    public WebElement fiveGenLInk;

    public void checkBusinessPanel(){
            fiveGenLInk.click();
    }

    @FindBy(how = How.XPATH,using = webWireless)
    public WebElement webWireles;

    public void checkWirelessPanel(){
        webWireles.click();
    }

    @FindBy(how = How.XPATH, using = webTvfeatue)
    public WebElement webtv;

    public void checkTvPanel(){
        webtv.isDisplayed();
    }

    @FindBy(how = How.XPATH , using = webBank)
    public WebElement webank;

    public void checkBankPanel(){
        webank.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = webPrpaid)
    public WebElement webpPaid;

    public void checkprPaidPanel(){
        webpPaid.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = webCart)
    public WebElement webBetter;

    public void checkCart(){
     webBetter.isDisplayed();
    }


    @FindBy(how = How.XPATH, using = webSearch)
    public WebElement webserch;

    public void checkSearchIcon(){
    webserch.isDisplayed();

    }

    @FindBy(how = How.ID, using = webLogo)
    public WebElement weblogo;

    public void checkTmobileLogo(){
        weblogo.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = webFindStore)
    public WebElement webStore;

    public void checkFindStore(){
    webStore.isDisplayed();
    }







}
