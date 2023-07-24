package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchPageStepDef {
	WebDriver driver;
@Given("User launch google page")
public void user_launch_google_page() {
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
   
}

@When("User search java tutorial")
public void user_search_java_tutorial() {
	 WebElement p=driver.findElement(By.name("q"));
    
     p.sendKeys(" Java tutorail");
}

@Then("Should display java result page")
public void should_display_java_result_page() {
    
}
}