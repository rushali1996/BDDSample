package runners;

import org.testng.annotations.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="@target/reports/failedScenarios.txt",
		glue = {"stepDefs"},
		monochrome= true
		
	//	plugin={"pretty",
			//	"return:target/reports/failedScenarios.txt"
	//		}	

				
		
		
		)

public class RerunRunner extends AbstractTestNGCucumberTests {

}

		