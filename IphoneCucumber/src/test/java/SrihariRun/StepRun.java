package SrihariRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features", 
                 glue={"Srihari"},
                plugin={"html:target/cucumber-html-report"}       
		)

public class StepRun {

}
