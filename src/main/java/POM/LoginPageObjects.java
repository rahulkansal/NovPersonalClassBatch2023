package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Capabilities.CapabilityBase;

public class LoginPageObjects extends CapabilityBase{
	
	@FindBy(id="text")
	public WebElement userName;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(id="login-button")
	public WebElement loginButton;


	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	
	

}
