package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.genericUtilities.WebDriverUtility;

public class AddEmployeePage extends WebDriverUtility{
	//Initialization
	public  AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this );
	}
	
	//Declaration
	@FindBy(name = "cat") private WebElement empDepartmentOptions;
	@FindBy(name="subcat") private WebElement empDesignationOptions;
	@FindBy(name="empCodeNum") private WebElement empCodeNumberTextField;
	@FindBy (name="empEmailAddress") private WebElement empMailId;
	@FindBy(name = "empLoginPass") private WebElement empLoginPassword;
	@FindBy(name = "empFirstName") private WebElement empFirstNameTextField;
	@FindBy(name="empLastName") private WebElement empLastNameTextField;
	@FindBy(name="empDoB") private WebElement empDOBtextField;
	@FindBy(name="empBloodGroup")  private WebElement empBloodGroupOptions;
	@FindBy(name="empGender") private WebElement empGenderOptions;
	@FindBy(name = "empPhoneNumPersonal") private WebElement empPersonalPhoneNumber;
	@FindBy(name="empPhoneNumOffice") private WebElement empOfficePhoneNumber;
	@FindBy(name="empParmanentAddress") private WebElement empPermanentAddress;
	@FindBy(name="empPresentAddress") private WebElement empPresentAddress;
	@FindBy(name="btnSubmit") private WebElement addEmployeeButton;
	
	//Utilization
	public WebElement getEmpCodeNumberTextField() {
		return empCodeNumberTextField;
	}
	public WebElement getEmpDepartmentOptions() {
		return empDepartmentOptions;
	}
	public WebElement getEmpDesignationOptions() {
		return empDesignationOptions;
	}
	public WebElement getEmpBloodGroupOptions() {
		return empBloodGroupOptions;
	}
	public WebElement getEmpGenderOptions() {
		return empGenderOptions;
	}
	public WebElement getEmpMailId() {
		return empMailId;
	}
	public WebElement getEmpLoginPassword() {
		return empLoginPassword;
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
	public WebElement getEmpPersonalPhoneNumber() {
		return empPersonalPhoneNumber;
	}
	public WebElement getEmpOfficePhoneNumber() {
		return empOfficePhoneNumber;
	}
	public WebElement getEmpPermanentAddress() {
		return empPermanentAddress;
	}
	public WebElement getEmpPresentAddress() {
		return empPresentAddress;
	}
	public WebElement getAddEmployeeButton() {
		return addEmployeeButton;
	}
	
	public void addEmployeePage(String empDept,String empDesignation,String empCodeNumb,String empMailIds,String empPasword,String empFirstName,String empLastName,String empDOB,String empBloodgroup, String empGender,String empPersonalNumb,String empOfficeNumb, String employeePermanentAddress,String employeePresentAddress) throws InterruptedException {
		selectDropDownByVtext(empDepartmentOptions, empDept);
		Thread.sleep(3000);
		selectDropDownByVtext(empDesignationOptions, empDesignation);
		empCodeNumberTextField.sendKeys(empCodeNumb);
		empMailId.sendKeys(empMailIds);
		empLoginPassword.sendKeys(empPasword);
		empFirstNameTextField.sendKeys(empFirstName);
		empLastNameTextField.sendKeys(empLastName);
		empDOBtextField.sendKeys(empDOB);
		selectDropDownByVtext(empBloodGroupOptions, empBloodgroup);
		selectDropDown(empGenderOptions, empGender);
		empPersonalPhoneNumber.sendKeys(empPersonalNumb);
		empOfficePhoneNumber.sendKeys(empOfficeNumb);
		empPermanentAddress.sendKeys(employeePermanentAddress);
		empPresentAddress.sendKeys(employeePresentAddress);
		addEmployeeButton.click();
	}
	
	public void addEmployeeDepartmentOptions(String empdeptName) {
		selectDropDownByVtext(empDepartmentOptions, empdeptName);
	}
	public void addEmployeeDesignationOptions(String empDesign) {
		selectDropDownByVtext(empDesignationOptions, empDesign);
	}
	public void addEmployeeCodeNumber(String empCodeNumb) {
		empCodeNumberTextField.sendKeys(empCodeNumb);
	}
	public void addEmployeeMailId(String empMailIds) {
		empMailId.sendKeys(empMailIds);
	}
	public void addEmployeeLoginPassword(String empLoginPasswords) {
		empLoginPassword.sendKeys(empLoginPasswords);
	}
	public void addEmployeeFirstName(String empFirstName) {
		empFirstNameTextField.sendKeys(empFirstName);
	}
	public void addEmployeeLastName(String empLastName) {
		empLastNameTextField.sendKeys(empLastName);
	}
	public void addEmployeeDOB(String empDOB) {
		empDOBtextField.sendKeys(empDOB);
	}
	public void addEmployeeBloodGroup(String empBloodGroup) {
		selectDropDownByVtext(empBloodGroupOptions, empBloodGroup);
	}
	public void addEmployeeGender(String empgender) {
		selectDropDownByVtext(empGenderOptions, empgender);
	}
	public void addEmployeePersonalNumber(String empPersonalNumb) {
		empPersonalPhoneNumber.sendKeys(empPersonalNumb);
	}
	public void addEmployeeOfficeNumber(String empOfficeNumb) {
		empOfficePhoneNumber.sendKeys(empOfficeNumb);
	}
	public void addEmployeePermanentAddress(String empPermanenetAddress) {
		empPermanentAddress.sendKeys(empPermanenetAddress);
	}
	public void addEmployeePresentAddress(String empPresentAddres) {
		empPresentAddress.sendKeys(empPresentAddres);
	}
	public void saveEmpDetails() {
		addEmployeeButton.click();
	}
}
