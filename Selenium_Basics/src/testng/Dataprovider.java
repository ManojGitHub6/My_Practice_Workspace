package testng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

	@DataProvider
	public Object[][] details(){
		
		Object[][] obj=new Object[2][2];
		obj[0][0]="manoj";
		obj[0][1]="kumar";
		
		obj[1][0]="testing";
		obj[1][1]="selenium";
		return obj;
	}
	
	@Test(dataProvider="details")
	public void form(String name,String lastname) {
		
		System.out.println(name);
		System.out.println(lastname);
	}
	
	@DataProvider(name="dat")
	public static Object[][] data(Method m){
		Object[][] obj=null;
		
		if(m.getName().equals("register")) {
		    obj=new Object[2][2];
			obj[0][0]="manoj";
			obj[0][1]="selenium";
			
			obj[1][0]="book";
			obj[1][1]="pages";
		}
		if(m.getName().equals("forms")) {
			obj=new Object[1][4];
			
			obj[0][0]="red";
			obj[0][1]="blue";
			obj[0][2]="green";
			obj[0][3]="yellow";
		}
		 return obj;
	}
	
	
	
}
