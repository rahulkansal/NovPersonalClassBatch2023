package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver abc;
		String browser = "egse";
		if(browser.equalsIgnoreCase("chrome")) {
		 abc = new ChromeDriver();
		}
		else {
		 abc = new EdgeDriver();
		}
		abc.manage().window().maximize();
		
		//abc.manage().window().minimize();
		// abc.manage().window().fullscreen();
		
		abc.get("https://google.com");
		
		String value = abc.getTitle();
		
		System.out.println(value);
		
		String value1 = abc.getPageSource();
		
		System.out.println(value1);

	}

}
