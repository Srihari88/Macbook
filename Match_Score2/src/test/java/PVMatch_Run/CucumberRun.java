package PVMatch_Run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
                 glue="PVMatch",
                		 plugin="html:target/cucumber-html-report")

public class CucumberRun {

}
