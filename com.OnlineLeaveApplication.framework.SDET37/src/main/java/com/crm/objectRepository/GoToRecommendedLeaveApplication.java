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
public class GoToRecommendedLeaveApplication {

	//initialisationn
	public GoToRecommendedLeaveApplication(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//declaration
	@FindBy(xpath="//button[@name='btnApproved']")
	private WebElement approvebtn;
	
	@FindBy(xpath="//button[@name='btnNotApproved']")
	private WebElement declinebtn;
	
	//utilisation
	public void approveBtn(WebDriver driver)
	{
		approvebtn.click();
	}
	
	public void declineBtn(WebDriver driver)
	{
		declinebtn.click();
	}
	
	
	
}
