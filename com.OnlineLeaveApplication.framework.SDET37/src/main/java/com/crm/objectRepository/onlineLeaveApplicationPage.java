package com.crm.objectRepository;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import freemarker.core.ReturnInstruction.Return;

public class onlineLeaveApplicationPage {
	public onlineLeaveApplicationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "livAltEmpCode") private WebElement alternateempcodename;

	public WebElement getalternateempcodename() {
		return alternateempcodename;
	}
	@FindBy(xpath = "//div[@class='radio']/label[.='Sick Leave']") private WebElement sickleave;
	public WebElement getsickleave() {
		return  sickleave;
	}
	@FindBy(id = "livReason") private WebElement leavereason;

	public WebElement getsickleavetext() {
		return leavereason;
	}
	@FindBy(id="livEmplivFrom") private WebElement fromdate;
	public WebElement getfromdate() {
		return fromdate;
	}
	@FindBy (id="livEmplivTo") private WebElement todate;
	public WebElement gettodate() {
		return todate;
	}
	@FindBy (id = "livAddress") private WebElement contaddrduringleave;
	public WebElement getcontaddrduringleave() {
		return contaddrduringleave;
	}
	@FindBy(name = "btnSubmit") private WebElement applyBtn;
	public WebElement getapplyBtn() {
		return applyBtn;
	}


	public void onlineleaveappppage(String altempcn,String reason,String fdate,String tdate, String urgent) {
		alternateempcodename.sendKeys(altempcn);
		sickleave.click();
		leavereason.sendKeys(reason);
		fromdate.sendKeys(fdate);
		todate.sendKeys(tdate);
		contaddrduringleave.sendKeys(urgent);
		applyBtn.click();
	}
}