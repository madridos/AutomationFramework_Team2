package CucumberTestRuner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions
        (

                features="C:\\Users\\mokraoui\\IdeaProjects\\ProJect\\AutomationFramework_Team2\\Aetna\\src\\Feature\\airbnb2.feature",
                glue="stepDefinition",
                dryRun=false,
                monochrome=true,
                plugin= {"pretty","html:test-ouput2"}

        )

public class cucumbertestrun {
}
