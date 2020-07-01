package myAccount;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static myAccount.WebELement.*;

public class MySouthWestPage extends WebAPI {
    @FindBy(how = How.XPATH, using = flightsXp)
    public WebElement flights;
    public void chooseFlights() {
        flights.click();
    }
    @FindBy(how = How.XPATH, using = bookFlightXp)
    public WebElement bookFlihght;
    public void bookFlight() {
        bookFlihght.click();
    }
    @FindBy(how = How.XPATH, using = citiesXpath)
    public WebElement cities;
    public void chooseCities() {
        cities.click();
    }
    @FindBy(how = How.XPATH, using = depCityXp)
    public WebElement depCiti;
    public void chooseDepartCity() {
        depCiti.sendKeys("LGA");
    }
    @FindBy(how = How.XPATH, using = arrCityXp)
    public WebElement arrCiti;
    public void chooseArrivaltCity() {
        arrCiti.sendKeys("MDW");
    }
    @FindBy(how = How.XPATH, using = depDateXp)
    public WebElement depDate;
    public void setDepDate() {
        depDate.click();
    }
    @FindBy(how = How.ID, using = depDate1Id)
    public WebElement depDate1;
    public void sedepDate1() {
        depDate1.click();
    }
    @FindBy(how = How.ID, using = returnDateId)
    public WebElement returnDate;
    public void setReturnDate() {
        returnDate.click();
    }
    @FindBy(how = How.ID, using = returnDate1Id)
    public WebElement returnDate1;
    public void setReturnDate1() {
        returnDate1.click();
    }
    @FindBy(how = How.ID, using = searchId)
    public WebElement search;
    public void searchFlight() {
        search.click();
    }
}