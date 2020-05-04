package mobile_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class M_Budget_PageObjects {
	WebDriver driver;
	public M_Budget_PageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
				this.driver=driver;
				PageFactory.initElements(driver, this);
			
		}
	
	@FindBy(id="budget")
	WebElement budgetUSD;

	public WebElement budgetUSD() {
		return budgetUSD;
	}
	
	@FindBy(id = "estimate")
	WebElement views;

	public WebElement views() {
		return views;
	}
	
	
	@FindBy(xpath = "//button[@class='shape_btn green_btn almostdone almostdonebtnstartcampaign']")
	WebElement startCampaign_Button;

	public WebElement startCampaign_Button() {
		return startCampaign_Button;
	}

}
