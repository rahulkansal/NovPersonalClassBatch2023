package TestNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {

	public WebDriver driver; 
	SoftAssert softAssert = new SoftAssert();
	   @Test(groups = {"Smoke"}) 
	   public void TC_ProductPage() 
	   {  
	     driver = new ChromeDriver(); 
	     System.out.println("Launching chrome browser"); 
	     String URL = "https://www.google.com"; // Creating string literal. 
	     driver.get(URL); 
	     String getTitle = driver.getTitle(); 
	     System.out.println("Title of home page: " +getTitle); 
	    // Assert.assertEquals("Gogle", getTitle);
	     
	    // Assert.assertEquals(true, true);
	     
	     softAssert.assertEquals("Gogle", getTitle);
	     
	     softAssert.assertEquals(true, true);
	     System.out.println("Last Assertion ");
	     softAssert.assertAll();
	     driver.close();
	     
	  } 
}
