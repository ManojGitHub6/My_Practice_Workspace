package testng.RunningBatches;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Child2 {
	
	@Test
	public void testA() {
		System.out.println("testA passed");
	}
	
	// <parameter name="name" value="xyz"/> - in Xml file
		// IN class @Parameters(name), in method(String name) using name to call in method
		
	
	@Parameters("browser")
	@Test
	public void testB(String browser) {
		System.out.println("testB passed");
		System.out.println(browser);
	}
	
	@Test
	public void testC() {
		System.out.println("testC passed");
	}

}
