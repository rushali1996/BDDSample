package runners;

import org.testng.annotations.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src\\test\\resources\\features\\GoogleSearchPage.feature",
		glue = {"stepDefs"}

		
		
		
		)

public class runner extends AbstractTestNGCucumberTests {

}
