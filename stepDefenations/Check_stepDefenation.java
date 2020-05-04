package stepDefenations;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resources.Base;
import resources.MobileEmmulation;
import resources.TTestT;

public class Check_stepDefenation extends MobileEmmulation {

	
	
	@Given("^: Lanch The browser$")
	public void lanch_The_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=ffinitializeDriver();
	   System.out.println("given checked ");
	   
	}

	@When("^: click the given link$")
	public void click_the_given_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("When checked ");
		 driver.get("https://dev.baymack.com/promolta/advertiser/allvideohomepage");
			
		  
			
	}

	@Then("^: validate$")
	public void validate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Then checked ");
		   
			
	}

}
