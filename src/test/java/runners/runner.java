package runners;

import org.testng.annotations.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src\\test\\resources\\features\\GoogleSearchPage.feature",
		glue = {"stepDefs"},
		monochrome= true,
		dryRun= false,
		plugin={"pretty",
			"usage:target/reports/usageReport",
			"html:target/reports/HTMLReport.html",
			"json:target/reports/JSONReport.json",
			"testng:target/reports/TestngReport.xml",
			"return:target/reports/failedScenarios.txt",
			"com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter."

		
		}
		
		)

public class runner extends AbstractTestNGCucumberTests {

}
