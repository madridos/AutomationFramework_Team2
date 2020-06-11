package myaccount;

import common.WebAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import static myaccount.WebElement.*;

public class MyAccountPage extends WebAPI {

@FindBy(how= How.XPATH,using =myAccountbtnXpath)
    public WebElement cartButton;

public void validateMyAccountBtn() {
    cartButton.click();
}

@FindBy(how=How.XPATH,using =loginXpath)
        public WebElement loginbutton;

public void validateLoginButton(){
        loginbutton.click();
    }

@FindBy(how=How.XPATH,using=enterPhoneXpath)
      public WebElement enterPhone;
public void enterPhoneOrEmail(){
    enterPhone.sendKeys("3456456456");

}
@FindBy(how=How.XPATH,using=billPayXpath)
    public WebElement billPay;
    public void setBillPay(){
     billPay.click();
    }
 @FindBy(how=How.XPATH,using=addLineXpath)
    public WebElement addALine;
    public void setAddALine(){
        addALine.click();
    }
    @FindBy(how=How.XPATH,using=upgradeXpath)
    public WebElement upgrade;
    public void doUpgrade(){
        upgrade.click();
    }
    @FindBy(how=How.XPATH,using=orderStatusXpath)
    public WebElement orderstatus;
    public void setOrderStatus(){
        orderstatus.click();
    }
    @FindBy(how=How.XPATH,using=askCommunityXpath)
    public WebElement askCommunity;
    public void setAskCommunity(){
        askCommunity.click();
    }
}
