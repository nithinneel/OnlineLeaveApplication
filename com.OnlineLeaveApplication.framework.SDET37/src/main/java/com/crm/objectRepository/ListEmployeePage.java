package com.crm.objectRepository;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;
import com.github.dockerjava.api.model.Driver;
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
		selectDropDownByVtext(deptDropDown, department);
	}
	
	public void clickOnActiveButton(WebDriver driver, String empID) {
		WebElement activeButton = driver.findElement(By.xpath("//a[.='"+empID+"']/../..//button[@name='btnVerify']"));
	    activeButton.click();	 
	}
	public void clickOnEmpCode(WebDriver driver, String empID) {
	WebElement empcode = driver.findElement(By.xpath("//a[.='"+empID+"']"));
	empcode.click();
	}
	}

