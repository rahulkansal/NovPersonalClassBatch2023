package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameExample {

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
		
		abc.get("https://webdriveruniversity.com/IFrame/index.html");
		
		//abc.switchTo().frame(0);
		
		//abc.switchTo().frame("frame");
		
		abc.switchTo().frame(abc.findElement(By.xpath("//iframe[@id='frame']")));
		
		
		abc.findElement(By.xpath("//a[text()='Our Products']")).click();
		
		abc.switchTo().defaultContent();
		
	
	}

}
