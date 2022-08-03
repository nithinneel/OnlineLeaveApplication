package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author nithin ns
 *
 */
public class UserProfilePage {
	//initialization
	public UserProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	@FindBy(name = "userPersonalPhoneNumber") private WebElement userPersonalPhoneNumber;
	@FindBy(name = "userPresentAddress") private WebElement userPresentAddress;
	@FindBy(name = "btnUserInfoUpdate") private WebElement submitBtn;
	
	
	public WebElement getUserPersonalPhoneNumber() {
		return userPersonalPhoneNumber;
	}
	public WebElement getUserPresentAddress() {
		return userPresentAddress;
	}
	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public void AdminUpdateProfile(String personalPhoneNumber, String presentAddress) {
		userPersonalPhoneNumber.sendKeys(personalPhoneNumber);
		userPresentAddress.sendKeys(presentAddress);
		submitBtn.click();
	}
	
}
