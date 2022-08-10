package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpApplyLeaveFinalSubmissionPage {
	//Initilization
	
	public EmpApplyLeaveFinalSubmissionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//decleartion
	@FindBy(xpath = "//label[text()='Sick Leave']") private WebElement sickleave;
	@FindBy(xpath = "//label[.='Casual Leave']") private WebElement casualLeave;
	@FindBy(xpath = "//label[.='Earn Leave']") private WebElement earnLeave;
	@FindBy(xpath = "//label[.='Maternity Leave']") private WebElement maternityLeave;
	@FindBy(xpath = "//label[.='Paternity Leave']") private WebElement paternityLeave;
	@FindBy(xpath = "//label[.='Bereavement Leave']") private WebElement bereavementLeave;
	@FindBy(xpath = "//label[.='Sabbatical Leave']") private WebElement sabbaticalLeave;
	@FindBy(xpath = "//label[.='Unpaid Leave']") private WebElement unpaidLeave;
	@FindBy(name = "btnFinalSubmit") private WebElement applyBtnFinalSbt;
	@FindBy(xpath = "//h3[text()='Successfully Updated']") private WebElement verification;
	
	public WebElement getVerification() {
		return verification;
	}
	//Utilization
	public WebElement getSickleave() {
		return sickleave;
	}
	public WebElement getCasualLeave() {
		return casualLeave;
	}
	public WebElement getEarnLeave() {
		return earnLeave;
	}
	public WebElement getMaternityLeave() {
		return maternityLeave;
	}
	public WebElement getPaternityLeave() {
		return paternityLeave;
	}
	public WebElement getBereavementLeave() {
		return bereavementLeave;
	}
	public WebElement getSabbaticalLeave() {
		return sabbaticalLeave;
	}
	public WebElement getUnpaidLeave() {
		return unpaidLeave;
	}
	public WebElement getApplyBtnFinalSbt() {
		return applyBtnFinalSbt;
	}
	
	
	
}
