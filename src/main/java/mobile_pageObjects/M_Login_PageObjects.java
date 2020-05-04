package mobile_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class M_Login_PageObjects {
	public WebDriver driver;

	public M_Login_PageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
					

	@FindBy(xpath = "//form[@class='siteForm sign-up loginnewfrm']//input[@placeholder='Enter Email']")
	WebElement userName;

	public WebElement userName() {
		return userName;
	}

	@FindBy(xpath = "//form[@class='siteForm sign-up loginnewfrm']//input[@placeholder='Create Password']")
	WebElement password;

	public WebElement password() {
		return password;
	}



	@FindBy(xpath = "//button[@class='themebtn btnwithloading']")
	WebElement startCampaign_Login;
	
	public WebElement startCampaign_Login() {
		return startCampaign_Login;
	}
}
