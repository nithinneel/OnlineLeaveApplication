package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpHomePage {
	//Initilization
	public EmpHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Decleration
	@FindBy(xpath = "//a[text()=' Apply Leave']") private WebElement applyLeave;
	@FindBy(xpath = "//a[text()=' User Profile']") private WebElement userProfile;
	@FindBy(xpath = "//a[text()=' Blood Group']") private WebElement bloodGroup;
	@FindBy(xpath = "//a[text()=' Logout']") private WebElement logout;
	@FindBy(id = "menu-toggle") private WebElement menuBar;
	
	//Utilization
	public WebElement getApplyLeave() {
		return applyLeave;
	}
	public WebElement getUserProfile() {
		return userProfile;
	}
	public WebElement getBloodGroup() {
		return bloodGroup;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getMenuBar() {
		return menuBar;
	}
	
	//Methods
	public void ApplyLeave() {
		applyLeave.click();
	}
	public void UserProfile() {
		userProfile.click();
	}
	public void BloodGroup() {
		bloodGroup.click();
	}
	public void Logout() {
		logout.click();
	}
	public void MenuBar() {
		menuBar.click();
	}
}
