package com.vaishnavi.sonarlint;

//import java.util.logging.Logger;

public class Main {
	
	//Logger log=Logger.getLogger(Main.class.getName());
	
	public void operateNumber(int number)
	{
		if(number>10)
			//log.info("number is greater than 10");
			System.out.println("number is greater than 10");
	}
	
	public static void main(String[] args) {
		Main obj=new Main();
		obj.operateNumber(45);
	}

}
