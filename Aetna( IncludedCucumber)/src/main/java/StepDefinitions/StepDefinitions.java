package StepDefinitions;

import common.WebAPI;
import home.HomePage;
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

    @Given("Clikc loginToaetna")
    public void clikc_loginToaetna() throws IOException, InterruptedException {
        setUp(false ,"browserstack","windows","10","chrome","83","https://www.aetna.com/");



    }



    @When("Click Reisteraetna")
    public void click_Reisteraetna() throws InterruptedException {
        initElement();
        homepage.aetnaExploreSites();


    }



    @When("Click MemberIDaetna")
    public void click_MemberIDaetna() {
        System.out.println("Test passed");
    }



    @Then("Clik aetnasearchBoxValidation")
    public void clik_aetnasearchBoxValidation() {
        System.out.println("Test passed");
    }

}
