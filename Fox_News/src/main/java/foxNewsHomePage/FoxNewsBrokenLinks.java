package foxNewsHomePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class FoxNewsBrokenLinks extends WebAPI {
    public void brokenLinks() throws MalformedURLException, IOException {
        List<WebElement> linkList= driver.findElements(By.xpath("a"));
        linkList.addAll(driver.findElements(By.tagName("img")));
        System.out.println("the total number of existing list is :"+linkList.size());
        List<WebElement> activeLinks= new ArrayList<WebElement>();
        for(int i=0;i<linkList.size();i++){
            System.out.println(i+"-- "+linkList.get(i).getAttribute("href"));
            if(linkList.get(i).getAttribute("href")!=null  && (! linkList.get(i).getAttribute("href").contains("javascript"))){
                activeLinks.add(linkList.get(i));
            }
        }
        System.out.println("the total activeLinks is: "+activeLinks.size());
        for (int j=0;j<activeLinks.size();j++){
            HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
            connection.connect();
            String response=connection.getResponseMessage();
            connection.disconnect();
            System.out.println(j+"---"+activeLinks.get(j).getAttribute("href")+"---"+response);
        }
    }

}
