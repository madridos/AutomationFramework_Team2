package coverage;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static coverage.WebElementCoverage.*;

public class CoveragePage  extends WebAPI {

    @FindBy(how = How.XPATH, using = contact)
    public WebElement ClickContact;
    public void contactClick() {
        Actions actions = new Actions(driver);
       actions.moveToElement(ClickContact).build().perform();
        //ClickContact.click();
    }

    @FindBy(how = How.XPATH, using = clickNumber)
    public WebElement Clicknum;
    public void clickNum() {
        Clicknum.click();
    }

    @FindBy(how = How.XPATH, using = checkOrder)
    public WebElement Checkorder;
    public void ordercheck() {
        Checkorder.click();
    }

    @FindBy(how = How.XPATH, using = email)
    public WebElement enteremail;
    public void EmailInput() {
        enteremail.click();
        enteremail.sendKeys("zak@gmail.com");
    }

    @FindBy(how = How.XPATH, using =   clicknext )
    public WebElement Clicknext;
    public void nextButton() {
        Clicknext.click();
    }

    @FindBy(how = How.XPATH, using =    clickforget )
    public WebElement Clilicforget;
    public void cForget() {
        Clilicforget.click();
    }

    @FindBy(how = How.XPATH, using =    setupFor  )
    public WebElement setup;
    public void clciksetup() {
        setup.click();
    }

    @FindBy(how = How.XPATH, using =    guest )
    public WebElement clickgest;
    public void clickguest() {
        clickgest.click();
    }

    @FindBy(how = How.XPATH, using =    clickHelp  )
    public WebElement help;
    public void clickhelp() {
        help.click();
    }

    @FindBy(how = How.XPATH, using =    feadback  )
    public WebElement clcikfeadback;
    public void feadback() {
        clcikfeadback.click();
    }

// mamine----------

    @FindBy(how = How.XPATH, using =   Support )
    public WebElement clciktsupport;
    public void Support() {
        clciktsupport.click();
    }

    @FindBy(how = How.XPATH, using =  Storelocation )
    public WebElement clciktStorelocation;
    public void Storelocation() {
        clciktStorelocation.click();
    }

    @FindBy(how = How.XPATH, using =  Coverage )
    public WebElement clickcouvrage;
    public void Coverage() {
        clickcouvrage.click();
    }
    @FindBy(how = How.XPATH, using =  TMobile )
    public WebElement clickTMobile;
    public void TMobile() {
        clickTMobile.click();
    }

    @FindBy(how = How.XPATH, using =  Espanole )
    public WebElement clickEspanole;
    public void Espanole() {
        clickEspanole.click();
    }

    @FindBy(how = How.XPATH, using = contact)
    public WebElement openContact;
    public void openContact() {
        openContact.click();
    }
    @FindBy(how = How.XPATH, using = Checkitout)
    public WebElement clickCheckitout;
    public void Checkitout() {
        clickCheckitout.click();
    }

    @FindBy(how = How.XPATH, using =Setupnetflix)
    public WebElement clicksetupnetflix;
    public void clicksetupnetflix() {
        clicksetupnetflix.click();
    }


}
