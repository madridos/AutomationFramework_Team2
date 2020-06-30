package StepDefinition;

import common.WebAPI;
import contactsupport.ContactSupportPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class stepdeefinition extends WebAPI {


    static ContactSupportPage homepage;

    @BeforeSuite
    public void initElement(){
        // getLocalDriver("chrome","Windows");
        homepage= PageFactory.initElements(driver, ContactSupportPage.class);
    }



    @Given("experiences")
    public void experiences() throws IOException {
        setUp(false ,"browserstack","windows","10","chrome","83","https://www.t-mobile.com/");

    }

    @When("logIn page")
    public void login_page() {
        initElement();
        homepage.validatecontactsupport();
        homepage.supoortbutton();
    }

    @And("printresults")
    public void printresults() {
        System.out.println("Test passed");
    }

    @Then("printresultsa")
    public void printresultsa() {

        System.out.println("Test passed");
    }


    //Test2:

    @Given("clcikcontact")
    public void clcikcontact() throws IOException {

        setUp(false ,"browserstack","windows","10","chrome","83","https://www.t-mobile.com/");



    }

    @When("entercontactinos")
    public void entercontactinos() {
        initElement();
       // homepage.validatecontactsupport();
        homepage.supoortbutton();
       // homepage.supoortbutton();
    }

    @And("esultsa")
    public void esultsa() {
        System.out.println("Test passed");
    }

    @Then("ultsb")
    public void ultsb() {
        System.out.println("Test passed");
    }
//Test3
    @Given("clickOrder")
    public void clickorder() throws IOException {
        setUp(false ,"browserstack","windows","10","chrome","83","https://www.t-mobile.com/");

}

    @When("clickOrderz")
    public void clickorderz() {
        initElement();
        homepage.OpenOrder();
    }

    @And("clickOrdera")
    public void clickordera() {
        System.out.println("Test passed");
    }

    @Then("clickOrderb")
    public void clickorderb() {
        System.out.println("Test passed");
    }
    //test4
    @Given("enteremail")
    public void enteremail() throws IOException {
        setUp(false ,"browserstack","windows","10","chrome","83","https://www.t-mobile.com/");

    }
    @When("enteremailz")
    public void enteremailz() {
        initElement();
        homepage.email();
    }

    @And("enteremaila")
    public void enteremaila() {
        System.out.println("Test passed");
    }

    @Then("enteremailb")
    public void enteremailb() {
        System.out.println("Test passed");
    }
//Test6
@Given("nextbutton")
public void nextbutton() throws IOException {
    setUp(false ,"browserstack","windows","10","chrome","83","https://www.t-mobile.com/");

}

    @When("nextbuttonz")
    public void nextbuttonz() {
        initElement();
        homepage.email();
    }

    @And("nextbuttona")
    public void nextbuttona() {
        System.out.println("Test passed");
    }

    @Then("nextbuttonb")
    public void nextbuttonb() {
        System.out.println("Test passed");
    }
//Test7
@Given("newid")
public void newid() throws IOException {
    setUp(false ,"browserstack","windows","10","chrome","83","https://www.t-mobile.com/");

}

    @When("newidz")
    public void newidz() {
        initElement();
        homepage.new_ID();
    }

    @And("newida")
    public void newida() {
        System.out.println("Test passed");
    }

    @Then("newidb")
    public void newidb() {
        System.out.println("Test passed");
    }
//Test8
@Given("fm")
public void fm() throws IOException {
    setUp(false ,"browserstack","windows","10","chrome","83","https://www.t-mobile.com/");

}
    @When("fmz")
    public void fmz() {
        initElement();
        homepage.firstn();
    }

    @And("fma")
    public void fma() {
        System.out.println("Test passed");
    }

    @Then("fmb")
    public void fmb() {
        System.out.println("Test passed");
    }
//Test9
@Given("lm")
public void lm() throws IOException {
    setUp(false ,"browserstack","windows","10","chrome","83","https://www.t-mobile.com/");

}

    @When("lmz")
    public void lmz() {
        initElement();
        homepage.lastn();
    }

    @And("lma")
    public void lma() {
        System.out.println("Test passed");
    }

    @Then("lmb")
    public void lmb() {
        System.out.println("Test passed");
    }
//Test10
    @Given("num")
    public void num() throws IOException {
    setUp(false ,"browserstack","windows","10","chrome","83","https://www.t-mobile.com/");

}

    @When("numz")
    public void numz() {
        initElement();
        homepage.number();
    }

    @And("numa")
    public void numa() {
        System.out.println("Test passed");
    }

    @Then("numb")
    public void numb() {
        System.out.println("Test passed");
    }
//Test17
@Given("emailcot")
public void emailcot() throws IOException {
    setUp(false ,"browserstack","windows","10","chrome","83","https://www.t-mobile.com/");

}

    @When("emailcotz")
    public void emailcotz() {
        initElement();
        homepage.emailcot();
    }

    @And("emailcota")
    public void emailcota() {
        System.out.println("Test passed");
    }

    @Then("emailcotb")
    public void emailcotb() {
        System.out.println("Test passed");
    }
//Test12
@Given("pw")
public void pw() throws IOException {
    setUp(false ,"browserstack","windows","10","chrome","83","https://www.t-mobile.com/");

}

    @When("pwz")
    public void pwz() {
        initElement();
        homepage.PW();
    }

    @And("pwa")
    public void pwa() {
        System.out.println("Test passed");
    }

    @Then("pwb")
    public void pwb() {
        System.out.println("Test passed");
    }

}
