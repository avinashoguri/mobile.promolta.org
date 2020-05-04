package mobile_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class M_VideoCheckout_PageObjects {

	public WebDriver driver;
	
	

	public M_VideoCheckout_PageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "youtubeurl")
	WebElement textToSearch;

	public WebElement textToSearch() {
		return textToSearch;
	}

	@FindBy(xpath = "//button[@class='search']")
	WebElement searchButton;

	public WebElement searchButton() {
		return searchButton;
	}
	@FindBy(xpath = "//*[@id=\"body\"]/div/div[3]/ul/span[2]/li/a/div[3]")
	WebElement selectVideo;
	public WebElement selectVideo() {
		return selectVideo;
	}




}
