package com.OnlineLeaveApplication.AddEmployee;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AddEmployeePage;
import com.crm.objectRepository.OlmHomePage;

public class AddEmployeeTest extends BaseClass{

	
	@Test
	public void addEmployeeDetails() throws InterruptedException  {
		//click on Add Employee button
		OlmHomePage homePage = new OlmHomePage(driver);
		  homePage.AddEmployee();
		  
		  // Fill the Details of the Employee
		AddEmployeePage addEmployee = new AddEmployeePage(driver);
		
		//Fetching EmpDepartment  details from excel and entering into dropdown
		 String empdeptName = eLib.readDataFromExcel("EmployeeData", 5, 1);
		 System.out.println(empdeptName);
		 addEmployee.addEmployeeDepartmentOptions(empdeptName);
		
		 //Enter the EmpDesignation
		 String empDesign = eLib.readDataFromExcel("EmployeeData", 5, 15);
		 System.out.println(empDesign);
		  addEmployee.addEmployeeDesignationOptions(empDesign);
		 
		  //Enter the EmpCode Number
		  String empCodeNumb = eLib.readDataFromExcel("EmployeeData", 6, 3);
		  addEmployee.addEmployeeCodeNumber(empCodeNumb);
		  
		  //Enter the EmpMail Address
		  String empMailIds = eLib.readDataFromExcel("EmployeeData", 6, 4);
		  addEmployee.addEmployeeMailId(empMailIds);
		  
		  //Enter the EmpLogin PassWord
		  String empLoginPasswords = eLib.readDataFromExcel("EmployeeData", 6, 5);
		  addEmployee.addEmployeeLoginPassword(empLoginPasswords);
		  
		  //Enter the EmpFirst Name
		  String empFirstName = eLib.readDataFromExcel("EmployeeData", 6, 6);
		  addEmployee.addEmployeeFirstName(empFirstName);
		  
		  //Enter the Employee Last Name
		  String empLastName = eLib.readDataFromExcel("EmployeeData", 6, 7);
		  addEmployee.addEmployeeLastName(empLastName);
		  
		  //Enter the Employee Date of Birth
		  String empDOB = eLib.readDataFromExcel("EmployeeData", 6, 8);
		  addEmployee.addEmployeeDOB(empDOB);
		  
		  //Enter the Employee BloodGroup DropDown
		  String empBloodGroup = eLib.readDataFromExcel("EmployeeData", 6, 9);
		  addEmployee.addEmployeeBloodGroup(empDOB);
		  
		  
		  
		  
		  
		  String empgender = eLib.readDataFromExcel("EmployeeData", 6, 10);
		  String empPersonalNumb = eLib.readDataFromExcel("EmployeeData", 6, 11);
		  String empOfficeNumb = eLib.readDataFromExcel("EmployeeData", 6, 12);
		  String empPermanenetAddress = eLib.readDataFromExcel("EmployeeData", 2, 13);
		  String empPresentAddres = eLib.readDataFromExcel("EmployeeData", 2, 14);
		  //AddEmployeePage addEmployee = new AddEmployeePage(driver);
		  //addEmployee.addEmployeePage(empdeptName, empDesign, empCodeNumb, empMailId, empLoginPassword, empFirstName, empLastName, empDOB, empBloodGroup, empgender, empPersonalNumb, empOfficeNumb, empPermanenetAddress, empPresentAddress);
	}
}

