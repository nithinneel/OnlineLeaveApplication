package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoToApplicationPage {

	//initialisation
	public GoToApplicationPage(WebDriver driver)
	{ PageFactory.initElements(driver, this);
	
	}
	
	//declaration
	@FindBy(xpath="//button[@name='btnRecomand']")
	private WebElement recommendbtn;
	
	//utilisation
	public void recommendBtn(WebDriver driver)
	{
		recommendbtn.click();
	}
	
	
	
}
