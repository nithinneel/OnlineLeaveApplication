package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;
/**
 * 
 * @author SHUBH
 *
 */
public class AddEmployeePage extends WebDriverUtility{

	WebDriver driver;
	//Initialization
	public AddEmployeePage() {
		PageFactory.initElements(driver, this);
	}
	//Declaration
	@FindBy(id = "empDptName") private WebElement empDepaetmentOptions;
	@FindBy(id = "empDesiName") private WebElement empDesignationOptins;
	@FindBy(id = "empCodeNum") private WebElement empCodeTextField;
	@FindBy(id="empEmailAddress") private WebElement empEmailIdTextField;
	@FindBy(id = "empLoginPass") private WebElement empLoginPasswordTextField;
	@FindBy(id = "empFirstName") private WebElement empFirstNameTextField;
	@FindBy(id = "empLastName") private WebElement empLastNameTextField;
	@FindBy(id="empDoB") private WebElement empDOBtextField;
	@FindBy(id="empBloodGroup") private WebElement empBloodGroupOptions;
	@FindBy(id = "empGender") private WebElement empGenderOptions;
	@FindBy(id = "empPhoneNumPersonal") private WebElement empPersonalPhoneNumberTextField;
	@FindBy(id = "empPhoneNumOffice") private WebElement empOfficePhoneNumberTextField;
	@FindBy(id = "empParmanentAddress") private WebElement empPermanantAddresstextField;
	@FindBy(id = "empPresentAddress") private WebElement empPresentAddressTextField;
	@FindBy(id = "btnSubmit") private WebElement addEmpButton;

	//Utilization
	
	public WebElement getEmpDepaetmentOptions() {
		return empDepaetmentOptions;
	}
	public WebElement getEmpDesignationOptins() {
		return empDesignationOptins;
	}
	public WebElement getEmpCodeTextField() {
		return empCodeTextField;
	}
	public WebElement getEmpEmailIdTextField() {
		return empEmailIdTextField;
	}
	public WebElement getEmpLoginPasswordTextField() {
		return empLoginPasswordTextField;
	}
	public WebElement getEmpFirstNameTextField() {
		return empFirstNameTextField;
	}
	public WebElement getEmpLastNameTextField() {
		return empLastNameTextField;
	}
	public WebElement getEmpDOBtextField() {
		return empDOBtextField;
	}
	public WebElement getEmpBloodGroupOptions() {
		return empBloodGroupOptions;
	}
	public WebElement getEmpGenderOptions() {
		return empGenderOptions;
	}
	public WebElement getEmpPersonalPhoneNumberTextField() {
		return empPersonalPhoneNumberTextField;
	}
	public WebElement getEmpOfficePhoneNumberTextField() {
		return empOfficePhoneNumberTextField;
	}
	public WebElement getEmpPermanantAddresstextField() {
		return empPermanantAddresstextField;
	}
	public WebElement getEmpPresentAddressTextField() {
		return empPresentAddressTextField;
	}
	public WebElement getAddEmpButton() {
		return addEmpButton;
	}
	
  public void addEmployee(String empDept, String empDesign, String empCodeNumber, String empEmailadress, String empLoginPassword ,String empFirstName, String empLastName, String empDOB, String empBloodGroup, String empGender, String empphoneNumber, String empOfficeNumber, String empPermanentAddress,String empPresentAddress ) {
	  selectDropDown(addEmpButton, "empDept");
	  selectDropDown(empDesignationOptins, "empDesign");
	  empCodeTextField.sendKeys("empCodeNumber");
	  empEmailIdTextField.sendKeys("empEmailadress");
	  empLoginPasswordTextField.sendKeys("empLoginPassword");
	  empFirstNameTextField.sendKeys("empFirstName");
	  empLastNameTextField.sendKeys("empLastName");
	  empDOBtextField.sendKeys("empDOB");
	  selectDropDown(empBloodGroupOptions, "empBloodGroup");
	  selectDropDown(empGenderOptions, "empGender");
	  empPersonalPhoneNumberTextField.sendKeys("empphoneNumber");
	  empOfficePhoneNumberTextField.sendKeys("empOfficeNumber");
	  empPermanantAddresstextField.sendKeys("empPermanentAddress");
	  empPresentAddressTextField.sendKeys("empPresentAddress");
	  addEmpButton.click();
  }
}