package testng;

import org.testng.annotations.Test;

public class Grouping {
	
	
	@Test(groups= {"perform"})
	public void test1() {
		
		System.out.println("first");
	}
	
	@Test(groups= {"regression","perform"})
	public void test2() {
		
		System.out.println("second");
	}
	
	@Test(groups= {"regression"})
	public void test3() {
		
		System.out.println("third");
	}

}
