package DataDriven;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Utility.Test_Utils;

public class TestUtil  {
	
	
	@Test (dataProvider="getData")
	public void tested(String fname,String mname,String lname) {
	   
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login");
		WebElement user=driver.findElement(By.id("txtUsername"));
		user.sendKeys("admin");
		user.sendKeys(Keys.TAB);
		driver.findElement(By.name("txtPassword")).sendKeys("Admin@123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("Admin")).click();
		
		Actions action=new Actions(driver);
		WebElement pim=driver.findElement(By.linkText("PIM"));
		action.moveToElement(pim).perform();
		driver.findElement(By.partialLinkText("Add Emplo")).click();
		 WebElement firstname=driver.findElement(By.name("firstName"));
		 WebElement middleName=driver.findElement(By.name("middleName"));
		 WebElement lastName=driver.findElement(By.id("lastName"));
		 firstname.sendKeys(fname);
		 middleName.sendKeys(mname);
		 lastName.sendKeys(lname);
		 
	}
	
	@DataProvider
	public Iterator<Object[]> getData() throws IOException{
		ArrayList<Object[]> testinfo=Test_Utils.getdatafromExcel();
		return testinfo.iterator();
	}


}
