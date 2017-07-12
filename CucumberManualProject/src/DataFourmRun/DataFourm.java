package DataFourmRun;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="features",
                  glue="DataFourm",
                  format={"html:target/cucumber-html-report", "json:target/json/s"},
                  tags={"@Registration"}
		          )
public class DataFourm {

}
