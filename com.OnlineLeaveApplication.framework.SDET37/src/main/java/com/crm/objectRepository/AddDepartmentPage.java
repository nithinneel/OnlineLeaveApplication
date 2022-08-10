package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Zabiulla
 *
 */
public class AddDepartmentPage {
	//Initilization
	public AddDepartmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Decleration
	@FindBy(id = "dptName") private WebElement departmentNameTtFd;
	@FindBy(name = "btnSubmit") private WebElement addDepartmentBtn;
	
	
	
	//Utilization
	public WebElement getDepartmentName() {
		return departmentNameTtFd;
	}
	public WebElement getAddDepartmentBtn() {
		return addDepartmentBtn;
	}
	
	public void addDepartment(String departmentName) {
		departmentNameTtFd.sendKeys(departmentName);
		addDepartmentBtn.click();
	}
	
}
