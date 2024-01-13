package Pages;

import com.relevantcodes.extentreports.LogStatus;

import Capabilities.CapabilityBase;

import POM.LoginPageObjects;

public class Login extends CapabilityBase{
	
	LoginPageObjects loginPageObjects = new LoginPageObjects();
	BaseClass baseClass = new BaseClass();
	
	public void enterUserAndPassword(String userNameValue, String passwordValue){
		
		baseClass.sendKeys(loginPageObjects.userName, userNameValue, extentTest, "Enter username value");		
		baseClass.sendKeys(loginPageObjects.password, passwordValue, extentTest, "Enter password");
		
	}
	
	public void clickLoginButton() {

		baseClass.click(loginPageObjects.loginButton, extentTest, "clicked on login buton");
	}

}
