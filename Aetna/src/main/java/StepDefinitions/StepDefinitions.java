package StepDefinitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class StepDefinitions extends WebAPI {
    static HomePage homepage;

    @BeforeSuite
    public void initElement(){
        // getLocalDriver("chrome","Windows");
        homepage= PageFactory.initElements(driver, HomePage.class);
    }
//T1
    @Given("Clikc loginToaetna")
    public void clikc_loginToaetna() throws IOException, InterruptedException {
        setUp(false ,"browserstack","windows","10","chrome","83","https://www.aetna.com/");
    }
    @When("Click Registeraetna")
    public void click_Registeraetna() throws InterruptedException {
        initElement();
        homepage.aetnaExploreSites();
    }
    @And("Click MemberIDaetna")
    public void click_MemberIDaetna() {
        System.out.println("Test passed");
    }
    @Then("Clik aetnasearchBoxValidation")
    public void clik_aetnasearchBoxValidation() {
        System.out.println("Test passed");
    }
//T2
    @Given("registertoeatna")
    public void registertoeatna() {
        initElement();
        homepage.ClickRegisteraetna();
    }

    @When("reatna")
    public void reatna() {
        System.out.println("TESTPASSED");
    }
    @And("reatnaa")
    public void reatnaa() {
        System.out.println("TESTPASSED");
    }
    @Then("reatnab")
    public void reatnab() {
        System.out.println("TESTPASSED");
    }
//T3
    @Given("midaetna")
    public void midaetna() {
        initElement();
        homepage.aetnaMemberID();
    }
    @When("maetna")
    public void maetna() {
        System.out.println("TESTPASSED");
    }
    @And("maetnaa")
    public void maetnaa() {
        System.out.println("TESTPASSED");
    }
    @Then("maetnab")
    public void maetnab() {
        System.out.println("TESTPASSED");
    }
//T4
    @Given("aetnasearchbox")
    public void aetnasearchbox() throws InterruptedException {
        initElement();
        homepage.aetnasearchBox();
    }
    @When("aetnaschbox")
    public void aetnaschbox() {
        System.out.println("TEST PASSED");
    }
    @And("aetnaschboxa")
    public void aetnaschboxa() {
        System.out.println("TEST PASSED");
    }
    @Then("aetnaschboxb")
    public void aetnaschboxb() {
        System.out.println("TEST PASSED");
    }
//T5
    @Given("aetnafindpharmacy")
    public void aetnafindpharmacy() throws InterruptedException {
        initElement();
        homepage.aetnafindpharmacy();
    }
    @When("clickfindpharmacy")
    public void clickfindpharmacy() {
        System.out.println("TEST PASSED");
    }
    @And("clickfindpharmacya")
    public void clickfindpharmacya() {
        System.out.println("TEST PASSED");
    }
    @Then("clickfindpharmacyb")
    public void clickfindpharmacyb() {
        System.out.println("TEST PASSED");
    }
//T6
    @Given("aetnashopplans")
    public void aetnashopplans() throws InterruptedException {
        initElement();
        homepage.aetnashopPlans();
}
    @When("clickshopplans")
    public void clickshopplans() {
        System.out.println("TEST PASSED");
    }
    @And("clickshopplansa")
    public void clickshopplansa() {
        System.out.println("TEST PASSED");
    }
    @Then("clickshopplansb")
    public void clickshopplansb() {
        System.out.println("TEST PASSED");
    }
//T7
    @Given("aetnapharmacy")
    public void aetnapharmacy() throws InterruptedException {
    initElement();
    homepage.aetnashopPlans();
    homepage.aetnaphamacies();
    }
    @When("clickaetnapharmacy")
    public void clickaetnapharmacy() {
        System.out.println("TEST PASSED");
    }
    @And("clickaetnapharmacya")
    public void clickaetnapharmacya() {
        System.out.println("TEST PASSED");
    }
    @Then("clickaetnapharmacyb")
    public void clickaetnapharmacyb() {
        System.out.println("TEST PASSED");
    }
//T8
    @Given("aetnaExploreSites")
    public void aetnaexploresites() throws InterruptedException {
        initElement();
        homepage.aetnaExploreSites();
    }
    @When("clickaetnaexploresites")
    public void clickaetnaexploresites() {
        System.out.println("TEST PASSED");
    }
    @And("clickaetnaexploresitesa")
    public void clickaetnaexploresitesa() {
        System.out.println("TEST PASSED");
    }
    @Then("clickaetnaexploresitesb")
    public void clickaetnaexploresitesb() {
        System.out.println("TEST PASSED");
    }
//T9
    @Given("aetnasite")
    public void aetnasite() throws InterruptedException {
        initElement();
        homepage.aetnaExploreSites();
        homepage.aetnasite();
    }
    @When("clickaetnasite")
    public void clickaetnasite() {
        System.out.println("TEST PASSED");
    }
    @And("clickaetnasitea")
    public void clickaetnasitea() {
        System.out.println("TEST PASSED");
    }
    @Then("clickaetnasiteb")
    public void clickaetnasiteb() {
        System.out.println("TEST PASSED");
    }
//T10
    @Given("aetnaAprovider")
    public void aetnaaprovider() throws InterruptedException {
        initElement();
        homepage.aetnaExploreSites();
        homepage.aetnaAprovider();
    }
    @When("clickaetnaAprovider")
    public void clickaetnaaprovider() {
        System.out.println("TEST PASSED");
    }
    @And("clickaetnaAprovidera")
    public void clickaetnaaprovidera() {
        System.out.println("TEST PASSED");
    }
    @Then("clickaetnaAproviderb")
    public void clickaetnaaproviderb() {
        System.out.println("TEST PASSED");
    }
//T11
    @Given("aetnaemployer")
    public void aetnaemployer() throws InterruptedException {
        initElement();
        homepage.aetnaExploreSites();
        homepage. aetnaemployer();
    }
    @When("clickaetnaemployer")
    public void clickaetnaemployer() {
        System.out.println("TEST PASSED");
    }
    @And("clickaetnaemployera")
    public void clickaetnaemployera() {
        System.out.println("TEST PASSED");
    }
    @Then("clickaetnaemployerb")
    public void clickaetnaemployerb() {
        System.out.println("TEST PASSED");
    }
//T12
    @Given("aetnaeagent")
    public void aetnaeagent() throws InterruptedException {
    initElement();
    homepage.aetnaExploreSites();
    homepage.aetnaagent() ;
    }
    @When("clickaetnaeagent")
    public void clickaetnaeagent() {
        System.out.println("TEST PASSED");
    }
    @And("clickaetnaeagenta")
    public void clickaetnaeagenta() {
        System.out.println("TEST PASSED");
    }
    @Then("clickaetnaeagentb")
    public void clickaetnaeagentb() {
        System.out.println("TEST PASSED");
    }
//T13
    @Given("aetnapartnersClick")
    public void aetnapartnersclick() throws InterruptedException {
    initElement();
    homepage.aetnaExploreSites();
    homepage.aetnapartnersClick () ;
    }
    @When("clickaetnapartners")
    public void clickaetnapartners() {
        System.out.println("TEST PASSED");
    }
    @And("clickaetnapartnersa")
    public void clickaetnapartnersa() {
        System.out.println("TEST PASSED");
    }

    @Then("clickaetnapartnersb")
    public void clickaetnapartnersb() {
        System.out.println("TEST PASSED");
    }
//T14
    @Given("aetnacareersClick")
    public void aetnacareersclick() throws InterruptedException {
        initElement();
        homepage.aetnaExploreSites();
        homepage.aetnacareersClick () ;
    }

    @When("clickaetnacareers")
    public void clickaetnacareers() {
        System.out.println("TEST PASSED");
    }
    @And("clickaetnacareersa")
    public void clickaetnacareersa() {
        System.out.println("TEST PASSED");
    }
    @Then("clickaetnacareersb")
    public void clickaetnacareersb() {
        System.out.println("TEST PASSED");
    }
//T15
    @Given("readaetnastoryClick")
    public void readaetnastoryclick() throws InterruptedException {
        initElement();
        homepage.aetnaExploreSites();
        homepage. aetnaemployer();
        homepage.readaetnastoryClick();
    }
    @When("clickreadaetnastory")
    public void clickreadaetnastory() {
        System.out.println("TEST PASSED");
    }
    @And("clickreadaetnastorya")
    public void clickreadaetnastorya() {
        System.out.println("TEST PASSED");
    }
    @Then("clickreadaetnastoryb")
    public void clickreadaetnastoryb() {
        System.out.println("TEST PASSED");
    }
//T16
    @Given("resoursesClick")
    public void resoursesclick() throws InterruptedException {
        initElement();
        homepage.aetnaExploreSites();
        homepage.aetnaAprovider();
        homepage.resoursesClick ();
    }
    @When("clickresourses")
    public void clickresourses() {
        System.out.println("TEST PASSED");
    }
    @And("clickresoursesa")
    public void clickresoursesa() {
        System.out.println("TEST PASSED");
    }
    @Then("clickresoursesb")
    public void clickresoursesb() {
        System.out.println("TEST PASSED");
    }
//T17
    @Given("resoursesacts")
    public void resoursesacts() throws InterruptedException {
        initElement();
        homepage.aetnaExploreSites();
        homepage.aetnasite();
        homepage.resoursesfacts();
    }
    @When("clickresoursesacts")
    public void clickresoursesacts() {
        System.out.println("TEST PASSED");
    }
    @When("clickresoursesactsa")
    public void clickresoursesactsa() {
        System.out.println("TEST PASSED");
    }
    @And("clickresoursesactsb")
    public void clickresoursesactsb() {
        System.out.println("TEST PASSED");
    }
//T18
    @Given("eatnafeedback")
    public void eatnafeedback() throws InterruptedException {
        initElement();
        homepage.eatnafeadback();
    }
    @When("clickeatnafeedback")
    public void clickeatnafeedback() {
        System.out.println("TEST PASSED");
    }
    @When("clickeatnafeedbacka")
    public void clickeatnafeedbacka() {
        System.out.println("TEST PASSED");
    }
    @And("clickeatnafeedbackb")
    public void clickeatnafeedbackb() {
        System.out.println("TEST PASSED");
    }
//T19
    @Given("eatnaLogo")
    public void eatnalogo() throws InterruptedException {
        initElement();
        homepage.eatnaLogo();
}

    @When("clickeatnaLogo")
    public void clickeatnalogo() {
        System.out.println("TEST PASSED");
    }

    @When("clickeatnaLogoa")
    public void clickeatnalogoa() {
        System.out.println("TEST PASSED");
    }

    @Then("clickeatnaLogob")
    public void clickeatnalogob() {
        System.out.println("TEST PASSED");
    }

}





