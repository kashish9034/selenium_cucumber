package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	WebDriver driver;
	
	
	
	
	
	@Given("^: User is on search page$")
	public void user_is_on_search_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	    
	}

	@Given("^: User enters the search phrase$")
	public void user_enters_the_search_phrase() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^: Search results displayed$")
	public void search_results_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
