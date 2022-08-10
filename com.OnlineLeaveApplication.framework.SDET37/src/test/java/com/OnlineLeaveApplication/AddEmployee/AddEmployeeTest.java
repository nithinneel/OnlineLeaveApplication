package com.OnlineLeaveApplication.AddEmployee;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AddEmployeePage;
import com.crm.objectRepository.OlmHomePage;

public class AddEmployeeTest extends BaseClass{

	
	@Test
	public void addEmployeeDetails() throws InterruptedException  {
		
		OlmHomePage homePage = new OlmHomePage(driver);
		  homePage.AddEmployee();
		  String empdeptName = eLib.readDataFromExcel("EmployeeData", 5, 1);
		  System.out.println(empdeptName);
		  String empDesign = eLib.readDataFromExcel("EmployeeData", 5, 15);
		  System.out.println(empDesign);
		  String empCodeNumb = eLib.readDataFromExcel("EmployeeData", 6, 3);
		  String empMailIds = eLib.readDataFromExcel("EmployeeData", 6, 4);
		  String empLoginPasswords = eLib.readDataFromExcel("EmployeeData", 6, 5);
		  String empFirstName = eLib.readDataFromExcel("EmployeeData", 6, 6);
		  String empLastName = eLib.readDataFromExcel("EmployeeData", 6, 7);
		  String empDOB = eLib.readDataFromExcel("EmployeeData", 6, 8);
		  String empBloodGroup = eLib.readDataFromExcel("EmployeeData", 6, 9);
		  String empgender = eLib.readDataFromExcel("EmployeeData", 6, 10);
		  String empPersonalNumb = eLib.readDataFromExcel("EmployeeData", 6, 11);
		  String empOfficeNumb = eLib.readDataFromExcel("EmployeeData", 6, 12);
		  String empPermanenetAddress = eLib.readDataFromExcel("EmployeeData", 2, 13);
		  String empPresentAddres = eLib.readDataFromExcel("EmployeeData", 2, 14);
		  AddEmployeePage addEmployee = new AddEmployeePage(driver);
		  //addEmployee.addEmployeePage(empdeptName, empDesign, empCodeNumb, empMailId, empLoginPassword, empFirstName, empLastName, empDOB, empBloodGroup, empgender, empPersonalNumb, empOfficeNumb, empPermanenetAddress, empPresentAddress);
	}
}

