package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExample {

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
		
		abc.get("https://webdriveruniversity.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) abc;  
	//	WebElement button =abc.findElement(By.xpath("//h1[text()='CONTACT US']"));			
        //Perform Click on LOGIN button using JavascriptExecutor		
        //   js.executeScript("arguments[0].click();", button);
		
        js.executeScript("window.scrollBy(0,1000)");
        //Find element by link text and store in variable "Element"        		
      WebElement element = abc.findElement(By.xpath("//h1[text()='ACTIONS']"));

       //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", element);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");



	}

}
