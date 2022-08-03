package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This page contains all the Home Page element Locators.
 * @author Zabiulla
 *
 */
public class OlmHomePage {
	//initilization
	public OlmHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//decleration
	@FindBy(xpath="//a[text()=' User Profile']") private WebElement userProfile;
	@FindBy(xpath = "//a[text()=' Applications ']") private WebElement applications;
	@FindBy(xpath = "//a[text()=' Recommended Applications']") private WebElement recommendedApplication;
	@FindBy(xpath = "//a[text()=' Add Department']") private WebElement addDepartment;
	@FindBy(xpath = "//a[text()=' List Department']") private WebElement listDepartment;
	@FindBy(xpath = "//a[text()=' Add Designation']") private WebElement addDesignation;
	@FindBy(xpath = "//a[text()=' List Designation']") private WebElement listDesignation;
	@FindBy(xpath = "//a[text()=' Add Employee']") private WebElement addEmployee;
	@FindBy(xpath = "//a[text()=' List Employee']") private WebElement listEmployee;
	@FindBy(xpath = "//a[text()=\" User's Leave Details\"]") private  WebElement usersLeaveDetails;
	@FindBy(xpath = "//a[text()=\" Blood Group\"]") private WebElement bloodGroup;
	@FindBy(xpath = "//a[text()=\" Logout\"]") private WebElement logout;
	
	//utilization
	public WebElement getUserProfile() {
		return userProfile;
	}
	public WebElement getApplications() {
		return applications;
	}
	public WebElement getRecommendedApplication() {
		return recommendedApplication;
	}
	public WebElement getAddDepartment() {
		return addDepartment;
	}
	public WebElement getListDepartment() {
		return listDepartment;
	}
	public WebElement getAddDesignation() {
		return addDesignation;
	}
	public WebElement getListDesignation() {
		return listDesignation;
	}
	public WebElement getAddEmployee() {
		return addEmployee;
	}
	public WebElement getListEmployee() {
		return listEmployee;
	}
	public WebElement getUsersLeaveDetails() {
		return usersLeaveDetails;
	}
	public WebElement getBloodGroup() {
		return bloodGroup;
	}
	public WebElement getLogout() {
		return logout;
	}
		
	//methods
	public void UserProfile() {
		userProfile.click();
	}
	public void Application() {
		applications.click();
	}
	public void RecommendedApplication() {
		recommendedApplication.click();
	}
	public void AddDepartment() {
		addDepartment.click();
	}
	public void ListDepartment() {
		listDepartment.click();
	}
	public void AddDesignation() {
		addDesignation.click();
	}
	public void ListDesignation() {
		listDesignation.click();
	}
	public void AddEmployee() {
		addEmployee.click();
	}
	public void ListEmployee() {
		listEmployee.click();
	}
	public void UsersLeaveDetails() {
		usersLeaveDetails.click();
	}
	public void BloodGroup() {
		bloodGroup.click();
	}
	public void Logout() {
		logout.click();
	}
}
