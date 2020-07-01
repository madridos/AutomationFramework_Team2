package myAccount;

import common.WebAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static myAccount.WebElement.*;
import org.openqa.selenium.WebElement;

public class MyFoxNewsPage extends WebAPI {
    @FindBy(how= How.CSS,using =worldCss)
    public WebElement world;
    public void seeWorldNews(){
        world.click();
    }
    @FindBy(how=How.XPATH,using =viewImageXp)
    public WebElement viewImage;
    public void viewImage(){
        viewImage.click();
    }
    @FindBy(how=How.XPATH,using=viewLinkXp)
    public WebElement viewLink;
    public void viewLink1(){
        viewLink.click();
    }
}
