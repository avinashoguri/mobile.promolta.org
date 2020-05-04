package stepDefenations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Appearance_PageObjects;
import pageObjects.Budget_PageObjects;
import pageObjects.Login_PageObjects;
import pageObjects.Payment_PageObjects;
import pageObjects.VideoCheckout_PageObjects;
import resources.Base;

public class FirstPayment_StepDefenation extends Base {
	public static Logger log =LogManager.getLogger(FirstPayment_StepDefenation.class.getName());

	@Given("^: User is on promolta Login page$")
	public void user_is_on_promolta_Login_page() throws Throwable {
		driver=initializeDriver();
		driver.get("https://dev.baymack.com/promolta/advertiser/allvideohomepage");
		log.info("User is on promolta Login page");
	}


	@When("^: User login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_with_and(String arg1, String arg2) throws Throwable {
		try {
			Login_PageObjects lp=new Login_PageObjects(driver);
			lp.userName().sendKeys(arg1);
			lp.password().sendKeys(arg2);
			lp.startCampaign_Login().click();
			log.info("username and password field entered");
			Thread.sleep(3000);
		}
		catch(Exception e) {
			log.error(e);
		}
	}

	@Then("^: Video checkout page is populated search \"([^\"]*)\" and select the video$")
	public void _video_checkout_page_is_populated_search_something_and_select_the_video(String strArg1) throws Throwable {
		String pageURL=driver.getCurrentUrl();
		String Act_URL="https://dev.baymack.com/promolta/advertiser/allvideocheckout";
		if(Act_URL.equals(pageURL)) {
			log.info("Login Test Passed");
		}else {
			log.error("Log in Test Failed");
		}
		
		try {
			VideoCheckout_PageObjects vc=new VideoCheckout_PageObjects(driver);
			vc.textToSearch().sendKeys(strArg1);
			Thread.sleep(3000);
			vc.searchButton().click();
			vc.selectVideo().click();
			log.info("Video selected successful");
		}
		catch(Exception e) {
			log.error("Video selected failed");
		}
	}

	@When("^: appearance will displayed fill details and next$")
	public void _appearance_will_displayed_fill_details_and_next() throws Throwable {
		try {
			Appearance_PageObjects ap=new Appearance_PageObjects(driver);
			ap.alsoWant_Subscribers().click();
			ap.gender_ALL().click();
			ap.age_All().click();
			ap.location_Global().click();
			ap.nextButton().click();
			log.info("Appearance selected Successful");
		}
		catch(Exception e) {
			log.error("Appearance selected failed");
		}
	}

	@When("^: startcampaign payment popup page will displayed$")
	public void _startcampaign_payment_popup_page_will_displayed() throws Throwable {
		try {
			Budget_PageObjects bd=new Budget_PageObjects(driver);
			bd.startCampaign_Button().click();
			log.debug("startCampaign_Button clicked");
		}catch(Exception e) {
			log.error("startCampaign_Button click failed");
		}
	}

	@Then("^:enter the card details \"([^\"]*)\" click on pay$")
	public void enter_the_card_details_click_on_pay(String arg1) throws Throwable {
		Payment_PageObjects pt=new Payment_PageObjects(driver);
		pt.nameOnCard().sendKeys(arg1);
		Thread.sleep(20000);
		log.info("card details entered");
		// enter card number
	}

	@And("^: enter budget ammount \"([^\"]*)\" and print views$")
	public void _enter_budget_ammount_something_and_print_views(String strArg1) throws Throwable {
		try {
			Budget_PageObjects bd=new Budget_PageObjects(driver);
			bd.budgetUSD().clear();
			bd.budgetUSD().sendKeys(strArg1);
			String views=bd.views().getText();
			log.info("budget entered successful");
			log.info("views for that budget is :"+views);
		}catch(Exception e) {
			log.error("budget failed");
		}
	}

	@And("^: check the payment is successful$")
	public void _check_the_payment_is_successful() throws Throwable {
		Thread.sleep(5000);
		String pageURL=driver.getCurrentUrl();
		String Act_URL="https://dev.baymack.com/promolta/advertiser/success";
		Assert.assertEquals(Act_URL, pageURL);
		
		if(Act_URL.equals(pageURL)) {
			Assert.assertEquals(pageURL,Act_URL);
			log.info(" payment test is successful");
		}else {
			log.error("payment Test Failed");
		}

		driver.close();
	}
}
