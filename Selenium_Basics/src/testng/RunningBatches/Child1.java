package testng.RunningBatches;

import org.testng.annotations.Test;

public class Child1 {
	
	@Test(priority=3)
	public void test1() {
		System.out.println("test1 passed");
	}
    
	@Test(priority=1)
	public void test2() {
		System.out.println("test2 passed");
	}
	
	@Test(priority=2)
	public void test3() {
		System.out.println("test3 passed");
	}
}