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
public class GoToApplicationPage {

	//initialisationn
	public GoToApplicationPage(WebDriver driver)
	{ 
		PageFactory.initElements(driver, this);
	}

	//declaration
	@FindBy(xpath="//button[@name='btnRecomand']")
	private WebElement recommendbtn;
	
	@FindBy(xpath = "//div[@class=\"table-responsive\"]//tbody//td[text()='User Id :BOE0001']")
	private WebElement adminleave;

	//utilisation
	public void recommendBtn(WebDriver driver)
	{
		recommendbtn.click();

	}

	public WebElement getadmintext() {
		return adminleave;
	}
	
	public String admintextname() {
		return adminleave.getText();
	}
}
