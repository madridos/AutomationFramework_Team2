package tmobilePlans;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static tmobilePlans.WebElementPlans.*;

public class PlansPage extends WebAPI {


    @FindBy(how= How.XPATH, using = webElemPlansLinkXpath)
    public WebElement plansLink;

    @FindBy(how= How.XPATH, using = WebElemPlansLogoXpath)
    public WebElement plansLogo;

    @FindBy(how=How.XPATH, using = webElemPlansFooterId)
    public WebElement plansFooter;

    @FindBy(how= How.XPATH,using = webElemfirstImageText)
    public WebElement textImage_1;

    @FindBy(how= How.XPATH, using = webElemSecondImageText)
    public WebElement scrollToElement;



    public void validatePlansLink(){
       plansLink.click();
    }

    public boolean validatePlansLogo(){
        boolean tmobPlansLogo = plansLogo.isDisplayed();
        return tmobPlansLogo;
    }

    public String validatePlansTitle(){
       String planTitle = driver.getTitle();
       return planTitle;
    }

    public int validatePlansFooter(){
      WebElement footer =  driver.findElement(By.cssSelector("#divfootermain"));
       List<WebElement> links = footer.findElements(By.tagName("a"));
       int numbLinks = links.size();
        System.out.println("these  are number of links in the footer "+  numbLinks);

        return numbLinks;
    }

    public String validateImageText_1(){
        String text_1 = textImage_1.getText();
        return text_1;
    }

    public void setScrollToElement(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement objScroll = driver.findElement(By.xpath("//*[@id='57fd8edfb383ccaa113abe919143ebec2568bb38']/div[1]/div[2]/h2"));
        js.executeScript("arguments[0].scrollIntoView(true)",objScroll);

    }






}
