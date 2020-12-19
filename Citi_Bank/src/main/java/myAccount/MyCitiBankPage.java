package myAccount;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static myAccount.WebElementCiti.*;

public class MyCitiBankPage extends WebAPI {
    @FindBy(how= How.XPATH,using =atmLocationsXp)
    public WebElement atm;
    public void findAtm(){
        atm.click();
    }
    @FindBy(how=How.XPATH,using=signOnXp)
    public WebElement signOn;
    public void clickSignOn(){
        signOn.click();
    }
    @FindBy(how=How.XPATH,using=userNameXp)
    public WebElement userName;
    public void checkUserName(){
        userName.sendKeys("hello");

    }
    @FindBy(how=How.XPATH,using=passWordXp)
    public WebElement passWord;
    public void checkpassWord(){
        passWord.sendKeys("Helloworld1234");
    }
    @FindBy(how=How.XPATH,using=signInXp)
    public WebElement signIn;
    public void signIn(){
        signIn.click();
    }
}
