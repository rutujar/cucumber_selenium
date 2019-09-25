package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(features = "Feature//demo_new.feature", glue= {"stepDef"} , plugin={"html:target/cuc1.html"},tags = {"@SmokeTest" , "~@RegressionTest"})




public class runnerclass {

}
