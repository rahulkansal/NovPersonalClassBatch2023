package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String browser = "chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		
		//abc.manage().window().minimize();
		// abc.manage().window().fullscreen();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		Actions action = new Actions(driver);
		//WebElement element= driver.findElement(By.id("double-click"));
		
		//action.doubleClick(element).perform();
		//action.contextClick(element).perform();
		
		//WebElement element= driver.findElement(By.xpath("//p[text()='Click and Hold!']"));
		
		//action.clickAndHold(element).perform();
		
		WebElement element= driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
		action.moveToElement(element).perform();
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		action.dragAndDrop(draggable, droppable).perform();

		
	}

}
