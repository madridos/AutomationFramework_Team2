package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.xml.xpath.XPath;

import java.util.List;

import static home.HomePageWebElement.*;

public class HomePage {

     @FindBy(how = How.XPATH, using = "//*[@id=content__main]/div[1]/div/div[2]/div/div[1]/div/div/div/p[2]/a")
      private List<WebElement> singlecrniterio;






}
