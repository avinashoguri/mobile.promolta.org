package mobile_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class M_Payment_PageObjects {
	public WebDriver driver;

	public M_Payment_PageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='payment-form-name']")
	WebElement nameOnCard;

	public WebElement nameOnCard() {
		return nameOnCard;
	}


}
