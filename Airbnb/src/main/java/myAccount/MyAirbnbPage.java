package myAccount;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import javax.xml.xpath.XPath;
import static myAccount.WebElementRbnb.*;

public class MyAirbnbPage extends WebAPI {
    @FindBy(how = How.XPATH, using = seattleBtnXpath)
    public WebElement seattleBtn;
    public void findSeattleBtn() {
        seattleBtn.click();
    }
    @FindBy(how = How.XPATH, using = checkInBtnXpath)
    public WebElement checkInBtn;
    public void setCheckInBtn() {
        checkInBtn.click();
        // mouseHoverByXpath(checkInBtnXpath);
    }
    @FindBy(how = How.XPATH, using = checkIndateXpath)
    public WebElement checkIndate;
    public void setcheckIndate() {
        checkIndate.click();
    }
    @FindBy(how = How.XPATH, using = checkOutBtnXpath)
    public WebElement checkOutBtn;
    public void setcheckOutBtn() {
        checkOutBtn.click();
    }
    @FindBy(how = How.XPATH, using = checkOutDateXpath)
    public WebElement checkOutDate;
    public void setcheckOutDate() {
        checkOutDate.click();
    }
    @FindBy(how = How.XPATH, using = adultsXpath)
    public WebElement adults;
    public void setadults() {
        selectOptionByVisibleText(adults, "5");
    }
    @FindBy(how = How.XPATH, using = childrenXpath)
    public WebElement children;
    public void setchildren() {
        selectOptionByVisibleText(children, "2");
    }
    @FindBy(how = How.CSS, using = searchBtnCss)
    public WebElement searchBtn;
    public void setSearchBtn() {
        searchBtn.click();
    }
    @FindBy(how = How.XPATH, using = currencyXpath)
    public WebElement currency;
    public void chooseCurrency() {
        clickByXpath(currencyXpath);
    }
}