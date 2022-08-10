package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author SHUBH
 *
 */
public class LoginPage {
    //Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Declaration 
	@FindBy(name = "officeUserCode") private WebElement userNameTextField;
	@FindBy(name = "officeUserPass") private WebElement passwordTextField;
	@FindBy(name = "btnSubmit") private WebElement loginButton;
	
	//Utilization
	
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	//methods
	public void logintoOLMT(String userName, String Password) {
		userNameTextField.sendKeys(userName);
		passwordTextField.sendKeys(Password);
		loginButton.click();
	}
	
}
