package stepDefinition;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import appModules.*; 

public class PlaceBet {
	public static WebDriver driver;
	
	@Given("^WH Customer is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    
		 utility.Utils.OpenBrowser("Chrome");
	
		}

	@When("^Navigate to English Premier League event page$")
	public void user() throws Throwable {
		Navigate_to_EPL_Action.Execute();
		
		 
		}
	
	@Then("^Place a bet$")
public void useri() throws Throwable {
	    
		PlaceBet_Win_Action.Execute();
		
		}
	
}