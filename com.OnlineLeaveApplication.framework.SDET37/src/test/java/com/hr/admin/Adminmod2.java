package com.hr.admin;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.ListEmployeePage;
import com.crm.objectRepository.OlmHomePage;
/**
 * 
 * @author V S GIRIDHAR
 *
 */
public class Adminmod2 extends BaseClass{
@Test
public void UsersLeaveDetails() throws InterruptedException {
	
	String department=eLib.readDataFromExcel("girigiri", 1, 1);
	String empcode = eLib.readDataFromExcel("girigiri", 2, 1);
	
	//CLick on list of employee btn
	OlmHomePage olmHomePage=new OlmHomePage(driver);
	olmHomePage.ListEmployee();
	
	//handling dropdown
	ListEmployeePage listEmployeePage=new ListEmployeePage(driver);
	listEmployeePage.selectDepartment(department);
		
	//click on excel btn
	listEmployeePage.clickOnActiveButton(driver,empcode);
	
	//click on empcode
	listEmployeePage.clickOnEmpCode(driver, empcode);
	
	
	
		

}

}
