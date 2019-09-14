package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTests {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login");
	}
	
	
	@Test
	public void test1() {
		
		WebElement user=driver.findElement(By.id("txtUsername"));
		user.sendKeys("admin");
		user.sendKeys(Keys.TAB);
		
	}
	
	@Test
	public void test2() {
		
		WebElement user=driver.findElement(By.id("txtUsername"));
		user.sendKeys("manoj");
		user.sendKeys(Keys.TAB);
		
	}
	
}