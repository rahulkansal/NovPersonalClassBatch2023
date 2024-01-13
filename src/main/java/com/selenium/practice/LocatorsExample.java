package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsExample {

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
		
		abc.get("https://google.com");
		
		//abc.findElement(By.id("APjFqb")).sendKeys("Rahul Automation");
		
		//abc.findElement(By.className("gLFyf")).sendKeys("Rahul Automation");
		
		//abc.findElement(By.name("q")).sendKeys("Rahul Automation");
		
		abc.findElement(By.linkText("हिन्दी")).click();
		
		abc.findElement(By.partialLinkText("Eng")).click();
		
		//abc.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Rahul");

	abc.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("Rahul");
	
	/*List<WebElement> links = abc.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	
	for(int i = 0;i<links.size();i++) {
		System.out.println(links.get(i).getText());
	} */
	
	abc.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).clear();
	abc.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("Automation Studio");
	abc.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys(Keys.ENTER);
	
	
	
	
	
	}

}
