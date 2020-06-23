package StepDefinitions;

import common.WebAPI;
import home.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class StepDefinition extends WebAPI {


    static HomePage homepage;

    @BeforeSuite
    public void initElement(){
        // getLocalDriver("chrome","Windows");
        homepage= PageFactory.initElements(driver, HomePage.class);
    }

    @Given("Online Experiences")
    public void online_Experiences() throws IOException {
        setUp(false ,"browserstack","windows","10","chrome","83","https://www.aetna.com/");
    }



    @When("User Navigate to LogIn Page")
    public void user_Navigate_to_LogIn_Page() throws InterruptedException {
        initElement();
        homepage.aetnaExploreSites();
        homepage.Aetnasite();
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



}