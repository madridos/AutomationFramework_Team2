package testFoxNewsHomePage;

import common.WebAPI;
import foxNewsHomePage.FoxNewsBrokenLinks;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestFoxNewsBrokenLinks extends WebAPI {
    FoxNewsBrokenLinks foxNewsBrokenLinks;
    @Test(enabled = false)
    public void testBrokenLinks() throws IOException {
        foxNewsBrokenLinks=new FoxNewsBrokenLinks();
        foxNewsBrokenLinks.brokenLinks();
    }
}
