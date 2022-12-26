package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		
		//add log4j.jar to project - to build path
		//copy log4j.propertie directly inside src folder
		//create the object for logger in the code
		
		Logger print = Logger.getLogger("devpinoyLogger");
		
		print.debug("Hello");
		print.debug("HHH");
		print.debug("dsaddas");
		print.debug("hELLO");
	

	}

}
