package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxHandling {

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
		
		abc.get("https://www.makemytrip.com/flight/search?itinerary=DEL-GOI-22/12/2023&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
		
		Thread.sleep(25000);
		
		abc.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		
		Thread.sleep(3000);
		
		abc.findElement(By.xpath("(//input[@id='listingFilterCheckbox'])[3]")).click();
		abc.findElement(By.xpath("(//input[@id='listingFilterCheckbox'])[5]")).click();
		abc.findElement(By.xpath("(//input[@id='listingFilterCheckbox'])[3]")).click();
		System.out.println(abc.findElement(By.xpath("//span[text()='Student']")).isDisplayed());
		System.out.println(abc.findElement(By.xpath("//span[text()='Student']")).isEnabled());
		abc.findElement(By.xpath("//span[text()='Student']")).click();
		
		
	}

}
