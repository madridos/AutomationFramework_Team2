package CucumberTestRuner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions
        //"C:\\Users\\mokraoui\\IdeaProjects\\ProJect\\AutomationFramework_Team2\\Aetna( IncludedCucumber)\\src\\Feature\\zak.feature"
        (

                features="src/Feature/zak.feature",
                glue="StepDefinitions",
                dryRun=false,
                monochrome=true,
                plugin= {"pretty","html:test-ouput2"}

        )

public class cucumbertestrun {
}
