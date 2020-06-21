package airbnbTestHomePage;

import airbnbHomePage.LoginAirBnb;
import common.WebAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.Objects;

public class TestLoginAirBnb extends WebAPI {
    LoginAirBnb loginAirBnb;
    public void getIniElement(){
        loginAirBnb= PageFactory.initElements(driver,LoginAirBnb.class);
    }
    @Test(enabled = false)
    public void testClickOnLogin() throws InterruptedException {
        getIniElement();
        loginAirBnb.ClickOnLogin();
    }
    @Test(enabled = false)
    public void testClickOnContinueWithEmail() throws InterruptedException {
        getIniElement();
        loginAirBnb.clickOnContinueWithEmail();
    }
    @Test(enabled = false)
    public void testSendCredentials() throws InterruptedException {
        getIniElement();
        loginAirBnb.sendCredentials();
    }
    @Test(enabled = false)
    public void testClickOnLoginButton() throws InterruptedException {
        getIniElement();
        loginAirBnb.clickOnLoginButton();

    }
    @Test(enabled = false)
    public void testscrollDownToMiami(){
        getIniElement();
        loginAirBnb.scrollDownToMiami();
    }
    @Test(enabled = false)
    public void testSearchAirbnbMiami() throws InterruptedException {
        getIniElement();
        loginAirBnb.searchAirbnbMiami();
    }
    @Test(enabled = false)
    public void testScrollDownToHouston(){
        getIniElement();
        loginAirBnb.scrollDownToHouston();
    }
    @Test(enabled = false)
    public void testClickOnHouston(){
        getIniElement();
        loginAirBnb.ClickOnHouston();
    }
@Test(enabled = false)
    public void testSearchAirbnbHouston() throws InterruptedException {
        getIniElement();
        loginAirBnb.searchAirbnbHouston();
}
@Test(enabled =false )
    public void testScrollDownToBoston(){
        getIniElement();
        loginAirBnb.scrollDownToBoston();
}
@Test(enabled =false )
    public void testClickOnBoston(){
        getIniElement();
        loginAirBnb.ClickOnBoston();
}
@Test(enabled =false )
    public void testsearchAirbnbBoston() throws InterruptedException {
        getIniElement();
        loginAirBnb.searchAirbnbBoston();
}
@Test(enabled = false)
    public void testscrollDownToNewOrleans(){
        getIniElement();
        loginAirBnb.scrollDownToNewOrleans();
}
@Test(enabled = false)
    public void testClickOnNewOrleans(){
        getIniElement();
        loginAirBnb.ClickOnNewOrleans();
}
@Test(enabled = false)
    public void testSearchAirbnbNewOrleans() throws InterruptedException {
        getIniElement();
        loginAirBnb.searchAirbnbNewOrleans();
}
@Test(enabled = false)
    public void testScrollDownToAustin(){
        getIniElement();
        loginAirBnb.scrollDownToAustin();
}
@Test(enabled = false)
    public void testClickAustin(){
        getIniElement();
        loginAirBnb.ClickAustin();
}
@Test(enabled = false)
    public void testsearchAirbnbAustin() throws InterruptedException {
        getIniElement();
        loginAirBnb.searchAirbnbAustin();
}
@Test(enabled = true)
    public void testScrollDownToPhoenix(){
        getIniElement();
        loginAirBnb.scrollDownToPhoenix();
}
@Test(enabled = true)
    public void testClickPhoenix(){
        getIniElement();
        loginAirBnb.ClickPhoenix();
}
@Test(enabled = true)
    public void teStsearchAirbnbPhoenix() throws InterruptedException {
        getIniElement();
        loginAirBnb.searchAirbnbPhoenix();
}
@Test(enabled = true)
    public void testscrollDownToWashingtonDc(){
        getIniElement();
        loginAirBnb.scrollDownToWashingtonDc();
}
@Test(enabled = true)
    public void testClickWashingtonDc(){
        getIniElement();
        loginAirBnb.ClickWashingtonDc();
}
@Test(enabled = true)
    public void testsearchAirbnbWashingtonDc() throws InterruptedException {
        getIniElement();
        loginAirBnb.searchAirbnbWashingtonDc();
}
@Test(enabled = true)
    public void testscrollDownToDenver(){
        getIniElement();loginAirBnb.scrollDownToDenver();
}
@Test(enabled = true)
    public void testClickDenver(){
        getIniElement();
        loginAirBnb.ClickDenver();
}
@Test(enabled = true)
    public void testsearchAirbnbDenver() throws InterruptedException {
        getIniElement();
        loginAirBnb.searchAirbnbDenver();
}
}
