package com.logger;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class User {
	
	private static Logger log=Logger.getLogger(User.class); 
	
	public static void main(String[] args) {
		
		Layout layout=new HTMLLayout();
		
		Appender app=new ConsoleAppender(layout);
		
		log.addAppender(app);
		
		log.info("FROM INFO");
		log.debug("FROM DEBUG");
		log.error("FROM ERROR");
		log.warn("FROM DEBUG");	
	}
	
	

}
