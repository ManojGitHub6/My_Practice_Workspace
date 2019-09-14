package testng.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ParallelTests extends TestBase{
	
	
	
	@Test
	public void test1() {
		
		WebElement user=getDriver().findElement(By.id("txtUsername"));
		user.sendKeys("admin");
		user.sendKeys(Keys.TAB);
	}
	
	@Test
	public void test2() {
		
		WebElement user=getDriver().findElement(By.id("txtUsername"));
		user.sendKeys("manoj");
		user.sendKeys(Keys.TAB);
	}
	
}