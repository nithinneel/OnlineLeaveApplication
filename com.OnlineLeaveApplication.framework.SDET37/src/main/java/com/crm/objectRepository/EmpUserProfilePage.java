package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpUserProfilePage {
	//Initilization
	public EmpUserProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Decleration
	@FindBy(id = "userPersonalPhoneNumber") private WebElement userPersonalPhoneNumberTextFd;
	@FindBy(id = "userPresentAddress") private WebElement userPresentAddressTextFd;
	@FindBy(id = "userPassword") private WebElement userNameTextfd;
	@FindBy(name = "btnUserInfoUpdate") private WebElement updateBtn;
	@FindBy(id = "menu-toggle") private WebElement menuBar;
	
	//Utilization
	public WebElement getUserPersonalPhoneNumberTextFd() {
		return userPersonalPhoneNumberTextFd;
	}
	public WebElement getUserPresentAddressTextFd() {
		return userPresentAddressTextFd;
	}
	public WebElement getUserNameTextfd() {
		return userNameTextfd;
	}
	public WebElement getUpdateBtn() {
		return updateBtn;
	}
	public WebElement getMenuBar() {
		return menuBar;
	}

	

}
