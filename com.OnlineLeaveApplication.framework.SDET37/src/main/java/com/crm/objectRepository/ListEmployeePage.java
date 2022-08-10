package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;
//intialization
public class ListEmployeePage extends WebDriverUtility {
public ListEmployeePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//declairation
@FindBy(id = "empDptName") 
private WebElement dropdown;

public WebElement getdropdown() {
	return dropdown;
}
//utilasation
public void selectDropdown(String visible) {
selectDropDownByVtext(dropdown, visible);
}
}