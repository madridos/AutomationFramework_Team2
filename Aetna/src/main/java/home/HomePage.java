package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.HomePageWebElement.*;

public class HomePage {

    //Test cas 1
    @FindBy (how= How.XPATH,using =aetnaLoginButtonXp)
    public WebElement aetnaLoginButton ;

    public void loginToaetna(){

        aetnaLoginButton.click();

    }

//xpath of my Test cas creation



}
