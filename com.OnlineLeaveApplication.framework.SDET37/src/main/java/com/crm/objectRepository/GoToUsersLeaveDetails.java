package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Anupam
 *
 */
public class GoToUsersLeaveDetails {

	//imitialisation
	public GoToUsersLeaveDetails(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//declaration
	@FindBy(xpath="//a[.='Go back ']")
	private WebElement gobackbtn;

	@FindBy(xpath="//a[.='BOE0002']")
	private WebElement selectemploye;

	//utilisation
	public void viewLeaveDetails(WebDriver driver)
	{
		gobackbtn.click();
		selectemploye.click();
	}


	public WebElement getGoBackBtn()
	{
		return gobackbtn;
	}

	public WebElement getSelectEmployee()
	{
		return selectemploye;
	}

}


