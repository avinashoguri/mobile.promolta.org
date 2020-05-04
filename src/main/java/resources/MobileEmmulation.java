package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class MobileEmmulation {

	public WebDriver driver;
	
	public WebDriver ffinitializeDriver() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Malempati Parvathi\\Desktop\\practice\\drivers\\geckodriver.exe");

		FirefoxProfile ffprofile = new FirefoxProfile();
		ffprofile.setPreference("general.useragent.override", "iPhone"); //this will change the user agent which will open mobile browser
		 driver = new FirefoxDriver(ffprofile);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().setSize(new Dimension(400,800)); //just to change the window size so that it will look like mobile ;)
		return driver;
	}


}



