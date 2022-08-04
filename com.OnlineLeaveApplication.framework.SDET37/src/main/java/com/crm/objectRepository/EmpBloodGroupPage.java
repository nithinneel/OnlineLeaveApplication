package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class EmpBloodGroupPage extends WebDriverUtility {
	//Initilization
	public EmpBloodGroupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Decleration
	@FindBy(id = "empDptName") private WebElement bloodGrpDrpDwn;
	@FindBy(id = "menu-toggle") private WebElement menuBar;

	//Utilization
	public WebElement getBloodGrpDrpDwn() {
		return bloodGrpDrpDwn;
	}

	public WebElement getMenuBar() {
		return menuBar;
	}

	public void EmpBloodGroupInfoPage(String selectBloodGrp) {
		selectDropDown(bloodGrpDrpDwn, "selectBloodGrp");
	}
}
