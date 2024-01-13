package com.java.practice;

public class UsingInterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverExample driver = null;
		String browser = "edge";
		if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromDriverClass();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			//driver = new EdgeDriverClass();
		}
		
		 driver.get();
		 driver.findElement();
		 driver.sendkeys();
		

	}

}
