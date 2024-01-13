package TestNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	
	   public WebDriver driver; 
	   @Test(groups = {"Smoke","Regression"},invocationCount=4,threadPoolSize=2) 
	   public void homePage() 
	   {  
	     driver = new ChromeDriver(); 
	     System.out.println("Launching Firefox browser"); 
	     String URL = "https://www.google.com"; // Creating string literal. 
	     driver.get(URL); 
	     String getTitle = driver.getTitle(); 
	     System.out.println("Title of home page: " +getTitle);  
	     driver.close();
	  } 
	   
	   @Test(timeOut=5000, groups = {"Regression"})
	   public void homePageUser() 
	   {  
	     driver = new ChromeDriver(); 
	     System.out.println("Launching Firefox browser"); 
	     String URL = "https://www.google.com"; // Creating string literal. 
	     driver.get(URL); 
	     String getTitle = driver.getTitle(); 
	     System.out.println("Title of home page: " +getTitle);  
	     driver.close();
	  } 


}
