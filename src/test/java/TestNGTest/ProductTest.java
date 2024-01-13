package TestNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class ProductTest {

	
	public WebDriver driver; 
	
	   @Test(groups = {"Smoke"}) 
	   public void TC_ProductPage() 
	   {  
	     driver = new ChromeDriver(); 
	     System.out.println("Launching Firefox browser"); 
	     String URL = "https://www.google.com"; // Creating string literal. 
	     driver.get(URL); 
	     String getTitle = driver.getTitle(); 
	     System.out.println("Title of home page: " +getTitle);  
	     driver.close();
	  } 
	   
	   @Test(groups = {"Regression"})
	   public void TC_ProductPage1() 
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
