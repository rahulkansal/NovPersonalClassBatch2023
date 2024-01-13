package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver abc;
		String browser = "chrome";
		if(browser.equalsIgnoreCase("chrome")) {
		 abc = new ChromeDriver();
		}
		else {
		 abc = new EdgeDriver();
		}
		abc.manage().window().maximize();
		
		//abc.manage().window().minimize();
		// abc.manage().window().fullscreen();
		
		abc.get("https://webdriveruniversity.com");
		
		abc.findElement(By.xpath("//h1[text()='LOGIN PORTAL']")).click();
		
		//Store the ID of the original window
		String originalWindow = abc.getWindowHandle();
		//Loop through until we find a new window handle
		for (String windowHandle : abc.getWindowHandles()) {
			System.out.println(windowHandle);
		    if(!originalWindow.contentEquals(windowHandle)) {
		        abc.switchTo().window(windowHandle);
		        break;
		    }
		}
		
		abc.findElement(By.id("text")).sendKeys("Rahuldfgb");
		
		abc.close();
		
		abc.switchTo().window(originalWindow);
		
		abc.findElement(By.xpath("//h1[text()='CONTACT US']")).click();
		
	}

}
