package myAccount;

import common.WebAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;
import static myAccount.WebElement.*;

public class MyBarnesPage extends WebAPI {

    @FindBy(how= How.CSS,using =booksCss)
    public WebElement books;
    public void clickOnBooks(){
        books.click();
    }
    @FindBy(how=How.XPATH,using=topbooksXpath)
    public WebElement topbooks;
    public void findTopBooks(){
        books.click();
        topbooks.click();
    }
    @FindBy(how=How.XPATH,using =theRoomBookXp)
    public WebElement roomBook;
    public void findRoomBook(){
        books.click();
        topbooks.click();
        roomBook.click();
    }
    @FindBy(how=How.XPATH,using =signInXp)
    public WebElement signIn;
    public void setSignIn(){
        books.click();
        topbooks.click();
        roomBook.click();
        signIn.click();
    }
    @FindBy(how=How.XPATH,using =emailXpath)
    public WebElement email;
    public void enterEmail(){
        books.click();
        topbooks.click();
        roomBook.click();
        signIn.click();
        email.sendKeys("aghilesboutaleb7@gmail.com");
    }



}
