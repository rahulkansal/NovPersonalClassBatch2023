package com.selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PopUpExample {

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
		
		abc.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		
		 abc.findElement(By.id("button4")).click();
		 
		 
		 Alert alert = abc.switchTo().alert();
		 
		 String value = alert.getText();
		 
		 System.out.println(value);
		 
		// alert.accept();
		 
		 alert.dismiss();

	}

}
