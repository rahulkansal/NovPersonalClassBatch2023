package com.selenium.practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;


public class ScreenshotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://www.google.com");
	        
	        
	      //  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      //  FileUtils.copyFile(scrFile, new File("C:\\Users\\rniwas2\\eclipse-workspace\\NovPersonalClass2023\\failed_1.png"));
	        
	        WebElement element = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
	        File scrFile = element.getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File("C:\\Users\\rniwas2\\eclipse-workspace\\NovPersonalClass2023\\failed_2.png"));
	        
	        
	        driver.quit();

	
}
}
