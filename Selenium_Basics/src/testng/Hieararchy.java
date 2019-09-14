package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hieararchy {
	
	@Test
	public void setup() {
		
		System.out.println("test1 passed");
	}
	
	@Test
	public void teaardown() {
		System.out.println("test2 passed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("login");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("logout");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("open browser");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("close browser");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
}
