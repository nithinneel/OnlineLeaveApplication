package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class BloodGroupPage extends WebDriverUtility{
public BloodGroupPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy (id = "menu-toggle") private WebElement menuBtneElement;
public WebElement getmenuBtnElement() {
	return menuBtneElement;
}
@FindBy(id = "empDptName") private WebElement bloodgroup;
public WebElement getbloodgroup() {
	return bloodgroup;
}
public void bloodgroupdropdown(String text) {
	selectDropDown(bloodgroup,text);
}
public void clickMenuBtn() {
	menuBtneElement.click();
}

}
