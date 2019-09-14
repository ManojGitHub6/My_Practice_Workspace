package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demo {

   static	Logger logger=Logger.getLogger(Demo.class);
   
	public static void main(String[] args) {
		BasicConfigurator.configure();
		System.out.println("hello");
		logger.info("hello dispalyed");
		logger.info("Manoj kumar");
		logger.debug("debug message");
	/*	int a=24;
		int b=12;
		int c=a/b;*/
		logger.error("Error");
		logger.fatal("fatal message");
		
	}
	
}
