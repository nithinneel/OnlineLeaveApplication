package com.OnlineLeaveApplication.AddEmployee;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AddEmployeePage;
import com.crm.objectRepository.OlmHomePage;
/*
 * Shubham 
 */

public class AddEmployeeTest extends BaseClass{

	@Test
	public void addEmployeeDetails() throws Throwable  {
		//Random Number from JavaUtil Package
		int randNumb = jLib.getRandomNumber();
		
		//click on Add Employee button
		OlmHomePage homePage = new OlmHomePage(driver);
		  homePage.AddEmployee();
		  
		  // Fill the Details of the Employee
		AddEmployeePage addEmployee = new AddEmployeePage(driver);
		
		//Fetching EmpDepartment  details from excel and entering into dropdown
		 String empdeptName = eLib.readDataFromExcel("EmployeeData", 2, 1);
		 System.out.println(empdeptName);
		 addEmployee.addEmployeeDepartmentOptions(empdeptName);
		
		 //Enter the EmpDesignation
		 String empDesign = eLib.readDataFromExcel("EmployeeData", 5, 15);
		 System.out.println(empDesign);
		 addEmployee.addEmployeeDesignationOptions(empDesign);
		 
		  //Enter the EmpCode Number
		  String empCodeNumb = eLib.readDataFromExcel("EmployeeData", 6, 3);
		  addEmployee.addEmployeeCodeNumber(empCodeNumb+randNumb);
		  
		  //Enter the EmpMail Address
		  String empMailIds = eLib.readDataFromExcel("EmployeeData", 6, 4);
		  addEmployee.addEmployeeMailId(randNumb+empMailIds);
		  
		  //Enter the EmpLogin PassWord
		  String empLoginPasswords = eLib.readDataFromExcel("EmployeeData", 6, 5);
		  addEmployee.addEmployeeLoginPassword(empLoginPasswords);
		  
		  //Enter the EmpFirst Name
		  String empFirstName = eLib.readDataFromExcel("EmployeeData", 6, 6);
		  addEmployee.addEmployeeFirstName(empFirstName+randNumb);
		  
		  //Enter the Employee Last Name
		  String empLastName = eLib.readDataFromExcel("EmployeeData", 6, 7);
		  addEmployee.addEmployeeLastName(empLastName);
		  
		  //Enter the Employee Date of Birth
		  String empDOB = eLib.readDataFromExcel("EmployeeData", 6, 8);
		  addEmployee.addEmployeeDOB(empDOB);
		  
		  //Enter the Employee BloodGroup DropDown
		  String empBloodGroup = eLib.readDataFromExcel("EmployeeData", 6, 9);
		  addEmployee.addEmployeeBloodGroup(empBloodGroup);
		  
		  //Enter the Employee Gender DropDown
		  String empgender = eLib.readDataFromExcel("EmployeeData", 6, 10);
		  addEmployee.addEmployeeGender(empgender);
		  
		  //Enter the Employee Personal Number
		  String empPersonalNumb = eLib.readDataFromExcel("EmployeeData", 6, 11);
		  addEmployee.addEmployeePersonalNumber(empPersonalNumb+randNumb);
		  
		  //Enter the Employee Office Number
		  String empOfficeNumb = eLib.readDataFromExcel("EmployeeData", 6, 12);
		  addEmployee.addEmployeeOfficeNumber(empOfficeNumb+randNumb);
		  
		  //Enter the Employee Permanent Address
		  String empPermanenetAddress = eLib.readDataFromExcel("EmployeeData", 2, 13);
		  addEmployee.addEmployeePermanentAddress(empPermanenetAddress);
		  
		  //Enter the Employee Present Address
		  String empPresentAddres = eLib.readDataFromExcel("EmployeeData", 2, 14);
		  addEmployee.addEmployeePresentAddress(empPresentAddres);
		  
		  //Save the Employee Data
		  addEmployee.saveEmpDetails();
		  
		  //Thread.sleep(4000);
		  String verificationText = addEmployee.employeeCreatedDashBoard();

		Assert.assertTrue(verificationText.contains("Employee Added Successfully"));
		Reporter.log("Pass: Employee is created",true);
	}
}

