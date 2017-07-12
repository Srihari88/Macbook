package RunCucu;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features", 
                 glue={"CucumberRun"},
                format={"html:target/cucumber-html-report", "json:target/json/input.json"}       
		)

public class StepRun {

}
