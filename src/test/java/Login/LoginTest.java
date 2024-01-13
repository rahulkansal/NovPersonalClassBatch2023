package Login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Capabilities.CapabilityBase;
import Pages.BaseClass;


public class LoginTest extends CapabilityBase{
	
	BaseClass baseClass = new BaseClass();
	
	@Test
	public void TC_ValidLogin(){
		
		baseClass.get("https://webdriveruniversity.com/Login-Portal/index.html");
		login.enterUserAndPassword(testData.get("username"),testData.get("password"));
		login.clickLoginButton();
	}
	
	
	@Test
	public void TC_ValidUserNameLogin(){
		
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		login.enterUserAndPassword("Rahul","dsfssdg");
		login.clickLoginButton();
	}
	
	@Test
	public void TC_ValidPasswordLogin(){
		
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		login.enterUserAndPassword("Rahul","dsfssdg");
		login.clickLoginButton();
	}

}
