package com.crm.objectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpApplyLeavePage {
	//Initilization
	
	public EmpApplyLeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Decleration
	@FindBy(id = "livAltEmpCode") private WebElement alternativeEmpCdNameFd;
	@FindBy(xpath = "//input[@name='livEmplivType']") private List<WebElement> leaveTypeRadiobutton;
	@FindBy(xpath = "//label[.='Casual Leave']") private WebElement casualLeave;
	@FindBy(xpath = "//label[.='Sick Leave']")private WebElement sickLeave;
	@FindBy(xpath = "//label[.='Earn Leave']") private WebElement earnLeave;
	@FindBy(xpath = "//label[.='Maternity Leave']") private WebElement maternityLeave;
	@FindBy(xpath = "//label[.='Paternity Leave']") private WebElement paternityLeave;
	@FindBy(xpath = "//label[.='Bereavement Leave']") private WebElement bereavementLeave;
	@FindBy(xpath = "//label[.='Sabbatical Leave']") private WebElement sabbaticalLeave;
	@FindBy(xpath = "//label[.='Unpaid Leave']") private WebElement unpaidLeave;
	@FindBy(id = "livReason") private WebElement leaveReasonTextFd;
	@FindBy(id = "livEmplivFrom") private WebElement fromDateCalenderTextFd;
	@FindBy(id = "livEmplivTo") private WebElement toDateCalenderTextFd;
	@FindBy(id = "livAddress") private WebElement contactAddressDurningLeaveTextFd;
	@FindBy(name = "btnSubmit") private WebElement applyBtn;
	@FindBy(xpath = "//a[text()=' Menu Bar']") private WebElement menuBar;
	
	//Utilization
	public WebElement getAlternativeEmpCdNameFd() {
		return alternativeEmpCdNameFd;
	}
	public WebElement getCasualLeave() {
		return casualLeave;
	}
	public WebElement getSickLeave() {
		return sickLeave;
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
	public WebElement getLeaveReasonTextFd() {
		return leaveReasonTextFd;
	}
	public WebElement getFromDateCalenderTextFd() {
		return fromDateCalenderTextFd;
	}
	public WebElement getToDateCalenderTextFd() {
		return toDateCalenderTextFd;
	}
	public WebElement getContactAddressDurningLeaveTextFd() {
		return contactAddressDurningLeaveTextFd;
	}
	public WebElement getApplyBtn() {
		return applyBtn;
	}
	public List<WebElement> getLeaveTypeRadiobutton() {
		return leaveTypeRadiobutton;
	}
	
	public void selectRadioButton(String leaveTypeRadionText) {
       for (WebElement webElement : leaveTypeRadiobutton) {
    	   if (webElement.getText().equalsIgnoreCase(leaveTypeRadionText)) {
    		   webElement.click();
			break;
		}
	}
		
	}
}
