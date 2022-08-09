package com.OnlineLeaveApplication.AddEmployee;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AddEmployeePage;
import com.crm.objectRepository.OlmHomePage;

public class AddEmployeeTest extends BaseClass{

	
	@Test
	public void addEmployeeDetails() {
		
		OlmHomePage homePage = new OlmHomePage(driver);
		  homePage.AddEmployee();
		  String empdeptName = eLib.readDataFromExcel("Employee_Data", 2, 1);
		  System.out.println(empdeptName);
		  String empDesign = eLib.readDataFromExcel("Employee_Data", 2, 2);
		  String empCodeNumb = eLib.readDataFromExcel("Employee_Data", 2, 3);
		  String empMailId = eLib.readDataFromExcel("Employee_Data", 2, 4);
		  String empLoginPassword = eLib.readDataFromExcel("Employee_Data", 2, 5);
		  String empFirstName = eLib.readDataFromExcel("Employee_Data", 2, 6);
		  String empLastName = eLib.readDataFromExcel("Employee_Data", 2, 1);
		  String empDOB = eLib.readDataFromExcel("Employee_Data", 2, 8);
		  String empBloodGroup = eLib.readDataFromExcel("Employee_Data", 2, 15);
		  String empgender = eLib.readDataFromExcel("Employee_Data", 2, 10);
		  String empPersonalNumb = eLib.readDataFromExcel("Employee_Data", 2, 11);
		  String empOfficeNumb = eLib.readDataFromExcel("Employee_Data", 2, 12);
		  String empPermanenetAddress = eLib.readDataFromExcel("Employee_Data", 2, 13);
		  String empPresentAddress = eLib.readDataFromExcel("Employee_Data", 2, 14);
		  AddEmployeePage addEmployee = new AddEmployeePage(driver);
		  addEmployee.addEmployeePage(empdeptName, empDesign, empCodeNumb, empMailId, empLoginPassword, empFirstName, empLastName, empDOB, empBloodGroup, empgender, empPersonalNumb, empOfficeNumb, empPermanenetAddress, empPresentAddress);
	}
}

