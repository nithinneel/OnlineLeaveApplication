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
	@FindBy(xpath = "//h3[text()='Successfully Updated']") private WebElement updateVerification;
	
	
	public WebElement getUpdateVerification() {
		return updateVerification;
	}
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
		WebElement personalNumber = userPersonalPhoneNumber;
		personalNumber.clear();
		personalNumber.sendKeys(personalPhoneNumber);
		WebElement personalAddress = userPresentAddress;
		personalAddress.clear();
		personalAddress.sendKeys(presentAddress);
		submitBtn.click();
	}
	
}
