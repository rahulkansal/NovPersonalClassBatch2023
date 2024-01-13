package TestNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestCase {

	WebDriver driver= null;
	
	//@Test (retryAnalyzer=TestNGTest.MyRetry.class)
	   @Test
	   public void TC_ProductPage() 
	   {  
	     driver = new ChromeDriver(); 
	     System.out.println("Launching chrome browser"); 
	     String URL = "https://facebook.com"; // Creating string literal. 
	     driver.get(URL); 
	     String getTitle = driver.getTitle(); 
	     System.out.println("Title of home page: " +getTitle); 
	     Assert.assertEquals("Facebook – log in or sign up", getTitle);
	     driver.close();
	     
	  } 
	   
	   @Test
	   public void TC_ProductPage1() 
	   {  
	     driver = new ChromeDriver(); 
	     System.out.println("Launching chrome browser"); 
	     String URL = "https://facebook.com"; // Creating string literal. 
	     driver.get(URL); 
	     String getTitle = driver.getTitle(); 
	     System.out.println("Title of home page: " +getTitle); 
	     Assert.assertEquals("Facebook – log in or sign up", getTitle);
	     driver.close();
	     
	  }
	   
	   @Test
	   public void TC_ProductPage2() 
	   {  
	     driver = new ChromeDriver(); 
	     System.out.println("Launching chrome browser"); 
	     String URL = "https://facebook.com"; // Creating string literal. 
	     driver.get(URL); 
	     String getTitle = driver.getTitle(); 
	     System.out.println("Title of home page: " +getTitle); 
	     Assert.assertEquals("Facebook – log in or sign up", getTitle);
	     driver.close();
	     
	  }
}
