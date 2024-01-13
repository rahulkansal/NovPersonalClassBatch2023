package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null ;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}	
		
		driver.manage().window().maximize();

		driver.get("https://proflowers.com");
		String value = "Best Day Bouquet";
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//img[@alt='"+value+"']"))));

		
		
		driver.findElement(By.xpath("//img[@alt='"+value+"']")).click();
		
		
		
	}

}
