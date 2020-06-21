package airbnbTestHomePage;

import airbnbHomePage.AirBnbBrokenLinks;
import common.WebAPI;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestAirBnbBokenLinks extends WebAPI {
    AirBnbBrokenLinks airBnbBrokenLinks;
    @Test(enabled = false)

    public void testBrokenLinks() throws IOException {
        airBnbBrokenLinks= new AirBnbBrokenLinks();
        airBnbBrokenLinks.brokenLinks();
    }
}
