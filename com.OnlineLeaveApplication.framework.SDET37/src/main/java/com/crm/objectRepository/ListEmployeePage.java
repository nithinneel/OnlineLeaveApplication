package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;
public class ListEmployeePage extends WebDriverUtility{
	
	//initialization
	public ListEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	
	}
	//declaration
	@FindBy(id = "empDptName") private WebElement deptDropDown;
	public WebElement getDeptDropDown() {
		return deptDropDown;
	}
	
	public void selectDepartment(String department) {
		selectDropDown(deptDropDown, department);
	}
}

