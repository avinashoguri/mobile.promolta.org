package mobile_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class M_Appearance_PageObjects {
	WebDriver driver;
	public M_Appearance_PageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
				this.driver=driver;
				PageFactory.initElements(driver, this);
			
		}
	
	
	
	 @FindBy(id="allcategory_id")
	   WebElement status_dropdown;
	  
	 public void select_list(String status){
	     Select statusDropdown=new Select(status_dropdown);
	     statusDropdown.selectByVisibleText(status);
	  }
	
	@FindBy(xpath = "//button[@class='srch_cat_btns besidebtn']")
	WebElement alsoWant_likeandComment;
	public WebElement alsoWant_likeandComment() {
		return alsoWant_likeandComment;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Subscribers')]")
	WebElement alsoWant_Subscribers;

	public WebElement alsoWant_Subscribers() {
		return alsoWant_Subscribers;
	}
	
	@FindBy(xpath = "//button[contains(text(),'App Installs')]")
	WebElement alsoWant_appInstalls;

	public WebElement alsoWant_appInstalls() {
		return alsoWant_appInstalls;
	}
	
	@FindBy(xpath = "//button[@class='srch_cat_btns genderbtn'][contains(text(),'All')]")
	WebElement gender_ALL;

	public WebElement gender_ALL() {
		return gender_ALL;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Male')]")
	WebElement gender_Men;

	public WebElement genderMen() {
		return gender_Men;
	}
	
	@FindBy(xpath = "//button[contains(text(),'Female')]")
	WebElement gender_Female;

	public WebElement gender_Female() {
		return gender_Female;
	}
	
	@FindBy(className = "srch_cat_btns agebtn age9")
	WebElement age_All;

	public WebElement age_All() {
		return age_All;
	}
	
	@FindBy(className = "srch_cat_btns agebtn age10")
	WebElement age13_24;

	public WebElement age13_24() {
		return age13_24;
	}
	@FindBy(className = "srch_cat_btns agebtn age4")
	WebElement age25_34;

	public WebElement age25_34() {
		return age25_34;
	}

	
	@FindBy(className = "srch_cat_btns agebtn age5")
	WebElement age35_44;

	public WebElement age35_44() {
		return age35_44;
	}
	@FindBy(className = "//button[@class='srch_cat_btns agebtn age6']")
	WebElement age45_54;

	public WebElement age45_54() {
		return age45_54;
	}

	@FindBy(className = "srch_cat_btns agebtn age7")
	WebElement age55_64;

	public WebElement age55_64() {
		return age55_64;
	}
	@FindBy(xpath = "//button[@class='srch_cat_btns countrybtn active']")
	WebElement location_Global;

	public WebElement location_Global() {
		return location_Global;
	}

	
	@FindBy(xpath = "//a[@class='orcountry']")
	WebElement location_chooseCountries;

	public WebElement location_chooseCountries() {
		return location_chooseCountries;
	}
	@FindBy(xpath = "//button[@class='shape_btn green_btn pagenext nextpage']")
	WebElement nextButton;

	public WebElement nextButton() {
		return nextButton;
	}
}
