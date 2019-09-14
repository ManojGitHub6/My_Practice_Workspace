package testng.parallel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class TestBase  {
	
	ThreadLocal<WebDriver> dr=new ThreadLocal<WebDriver>();
	WebDriver driver=null;
	
	@BeforeTest
	public void setup() {
		
		driver=new BrowserFactory().create("chrome");
		setWebDriver(driver);
	}
	
	public void setWebDriver(WebDriver driver) {
	 
	dr.set(driver);	
}
	
	public  WebDriver getDriver() {
		
		return dr.get();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
}