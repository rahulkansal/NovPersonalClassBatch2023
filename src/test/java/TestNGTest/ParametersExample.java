package TestNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParametersExample {

	public WebDriver driver; 
	
	   @Parameters({"url","expectedTitle"})
	   @Test 
	   public void TC_ProductPage(String urlValue, String expectedTitleValue) 
	   {  
	     driver = new ChromeDriver(); 
	     System.out.println("Launching chrome browser"); 
	     String URL = urlValue; // Creating string literal. 
	     driver.get(URL); 
	     String getTitle = driver.getTitle(); 
	     System.out.println("Title of home page: " +getTitle); 
	     Assert.assertEquals(expectedTitleValue, getTitle);
	     driver.close();
	     
	  } 
}
