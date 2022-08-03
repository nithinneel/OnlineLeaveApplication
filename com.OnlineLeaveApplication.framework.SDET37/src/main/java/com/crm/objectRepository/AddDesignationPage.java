package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class AddDesignationPage extends WebDriverUtility{
	//Initilization
	public AddDesignationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Decleration
	@FindBy(id = "dptName") private WebElement departmentDrpDwn;
	@FindBy(id = "desiName") private WebElement designationNameTtFd;
	@FindBy(name = "btnSubmit") private WebElement addDestinationBtn;
	
	//Utilization
	public WebElement getDepartmentDrpDwn() {
		return departmentDrpDwn;
	}
	public WebElement getDesignationNameTtFd() {
		return designationNameTtFd;
	}
	public WebElement getAddDestinationBtn() {
		return addDestinationBtn;
	}
	
	public void selectDepartment(String departmentName) {
		selectDropDown(departmentDrpDwn, departmentName);
	}
	
}
