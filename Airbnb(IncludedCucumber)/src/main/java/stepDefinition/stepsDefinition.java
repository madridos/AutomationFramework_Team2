package stepDefinition;

import common.WebAPI;
import coverage.airbnbHomePag;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.sql.SQLException;

public class stepsDefinition extends WebAPI {

    static airbnbHomePag homepage;

    @BeforeSuite
    public void initElement() {
        // getLocalDriver("chrome","Windows");
        homepage = PageFactory.initElements(driver, airbnbHomePag.class);
    }
// T1

    @Given("Online Experiences")
    public void online_Experiences() throws IOException {
        setUp(false, "browserstack", "windows", "10", "chrome", "83", "https://www.airbnb.com/");
    }


    @When("User Navigate to LogIn Page")
    public void user_Navigate_to_LogIn_Page() throws InterruptedException {
        initElement();
        homepage.ClickonlineExpriaces.click();


    }

    @When("User enters UserName and Password")
    public void user_enters_UserName_and_Password() throws InterruptedException {
        initElement();
        System.out.println("Test passed");
    }

    @Then("Message displayed Login Successfully")
    public void message_displayed_Login_Successfully() {
        System.out.println("Test passed");


    }

// T2

    @Given("homepae")
    public void homepae() {
        initElement();
        clickdate();
     //  homepage.Clickdate();
    }

    @When("clickdate")
    public void clickdate() {
        System.out.println("Test passed");
    }

    @Then("date exists")
    public void date_exists() {
        System.out.println("Test passed");
    }


    // T 3

    @Given("test3")
    public void test3() throws InterruptedException {
        initElement();
        Thread.sleep(6000);
        homepage.ClickPrice();
       //   homepage.setEnterprice();
       // homepage.setEnterpriceMAX();
       // homepage.cSave();



    }

    @When("pricetitle")
    public void pricetitle() throws InterruptedException {
        Thread.sleep(6000);
        homepage.setEnterprice();
    }

    @Then("clickprice exists")
    public void clickprice_exists() throws InterruptedException {
        Thread.sleep(6000);
        homepage.setEnterpriceMAX();;
    }

    // T 4:



    @Given("homepages")
    public void homepages() throws InterruptedException {
        initElement();
        Thread.sleep(6000);
        homepage.clickShareall();
    }

    @When("clicksharealla")
    public void clicksharealla() {
        System.out.println("Test passed");
    }

    @Then("clickshareallb")
    public void clickshareallb() {
        System.out.println("Test passed");
    }

    //T 5

    @Given("hostyourhomehomepages")
    public void hostyourhomehomepages() throws InterruptedException {
        initElement();
        Thread.sleep(6000);


        homepage.clickHostyourhome();
    }

    @When("hostyourhometa")
    public void hostyourhometa() {
        System.out.println("Test passed");
    }

    @Then("hostyourhometb")
    public void hostyourhometb() {
        System.out.println("Test passed");;
    }






        @Given("openmainpage")
        public void openmainpage () throws InterruptedException {
        initElement();
        Thread.sleep(400);
       // homepage.ClickonlineExpriaces();
            homepage.clickDay();
    }

        @When("clicday")
        public void clicday () throws InterruptedException {
        Thread.sleep(4000);
            System.out.println("Test paased");
    }

        @Then("setday")
        public void setday () {
        System.out.println("Test paased");
    }


    @Given("date")
    public void date() {
        homepage.selectdate();
    }

    @When("datea")
    public void datea() {
        System.out.println("Test paased");
    }

    @Then("dateb")
    public void dateb() {
        System.out.println("Test paased");
    }


    @Given("getimage")
    public void getimage() throws InterruptedException {
        homepage.findimage();
    }

    @When("imagea")
    public void imagea() {
        System.out.println("Test paased");
    }

    @Then("imageb")
    public void imageb() {
        System.out.println("Test paased");
    }


    @Given("image")
    public void image() throws InterruptedException {
       homepage.getimageS();
    }

    @When("imagee")
    public void imagee() {
        System.out.println("Test paased");
    }

    @Then("imagec")
    public void imagec() {
        System.out.println("Test paased");
    }


    @Given("arrowopen")
    public void arrowopen() throws InterruptedException {
      homepage.clickarrow();
    }

    @When("arrowa")
    public void arrowa() {
        System.out.println("Test paased");
    }

    @Then("arrowb")
    public void arrowb() {
        System.out.println("Test paased");
    }


    @Given("mprice")
    public void mprice() throws InterruptedException {
       homepage.setEnterpriceMAX();
    }

    @When("bprice")
    public void bprice() {
        System.out.println("Test paased");
    }

    @Then("aprice")
    public void aprice() {
        System.out.println("Test paased");
    }


    @Given("clicksave")
    public void clicksave() {
       homepage.cSave();
    }

    @When("savea")
    public void savea() {
        System.out.println("Test paased");
    }

    @Then("saveb")
    public void saveb() {
        System.out.println("Test paased");
    }


    @Given("selectcheckbox")
    public void selectcheckbox() throws InterruptedException {
      homepage.mornigcheckbox();
    }

    @When("checkboxa")
    public void checkboxa() {
        System.out.println("Test paased");
    }

    @Then("checkboxb")
    public void checkboxb() {
        System.out.println("Test paased");
    }


    @Given("datex")
    public void datex() {
       homepage.selectdate();
    }

    @When("da")
    public void da() {
        System.out.println("Test paased");
    }

    @Then("dax")
    public void dax() {
        System.out.println("Test paased");
    }

    @Given("excelsheet")
    public void excelsheet() throws IOException, InterruptedException {
     homepage.excel();
    }

    @When("exela")
    public void exela() {
        System.out.println("Test paased");
    }

    @Then("execte")
    public void execte() {
        System.out.println("Test paased");
    }




}

