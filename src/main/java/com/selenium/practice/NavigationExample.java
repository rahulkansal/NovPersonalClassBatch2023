package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationExample {

	public static void main(String[] args) throws InterruptedException {
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
		
		Thread.sleep(2000);
		
		abc.get("https://facebook.com");
		
Thread.sleep(2000);
		
		abc.navigate().back();
		
Thread.sleep(2000);
		
		abc.navigate().forward();
		
Thread.sleep(2000);
		
		abc.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
	}

}
