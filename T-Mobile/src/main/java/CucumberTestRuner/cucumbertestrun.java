package CucumberTestRuner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions
        (
                //String path ="C:\\Users\\mokraoui\\IdeaProjects\\ProJect\\AutomationFramework_Team2\\Airbnb\\src\\Feature\\airbnb2.feature";
                features="src\\Feature\\TMobile.feature",
                glue="stepdeefinition",
                dryRun=false,
                monochrome=true,
                plugin= {"pretty","html:test-ouput2"}

        )
public class cucumbertestrun {



}
