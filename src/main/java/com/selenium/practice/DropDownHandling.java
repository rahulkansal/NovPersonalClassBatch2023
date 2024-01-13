package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) throws InterruptedException {
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
		
		abc.get("https://facebook.com");
		
		abc.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement element = abc.findElement(By.id("month"));
		
		Select dropdown = new Select(element );
		
		//dropdown.selectByIndex(4);
		
		//dropdown.selectByVisibleText("Sep");
		
		dropdown.selectByValue("8");

		
		
		
		
	}

}
