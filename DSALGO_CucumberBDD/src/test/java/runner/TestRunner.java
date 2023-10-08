
package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(


plugin={"pretty", "html:target/MyReports/report.html",
		"junit:target/MyReports/report.junit"},
monochrome=false,		
tags ="@DataStructure",  
features= {"src/test/resource/features"},
glue= "stepdefinations",
dryRun=false)

public class TestRunner {

}