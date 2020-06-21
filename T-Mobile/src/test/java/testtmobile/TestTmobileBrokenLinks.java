package testtmobile;

import common.WebAPI;
import hometmobile.TmobileBrokenList;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestTmobileBrokenLinks extends WebAPI {
        TmobileBrokenList tmobileBrokenList;
        @Test(enabled = false)
        public void testBrokenLinks() throws IOException {
            tmobileBrokenList = new TmobileBrokenList();
            tmobileBrokenList.brokenLinks();
        }
    }

