package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeforeFinalSubmissionPage {
public BeforeFinalSubmissionPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
}
@FindBy(xpath = "//div[@class='radio']/label[.='Sick Leave']") private WebElement radioBtn;
public WebElement getradioBtn() {
	return radioBtn;
}
@FindBy(name = "btnFinalSubmit") private WebElement appyBtn;
public WebElement getapplyBtn() {
	return appyBtn;
}
public void Beforefinalsubmition() {
	radioBtn.click();
	appyBtn.click();
	
}
}
