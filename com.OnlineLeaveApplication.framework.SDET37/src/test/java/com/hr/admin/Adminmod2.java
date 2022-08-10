package com.hr.admin;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.OlmHomePage;

public class Adminmod2 extends BaseClass{
@Test
public void UsersLeaveDetails() {
	eLib.readDataFromExcel("", 0, 0)
	//
	OlmHomePage olmHomePage=new OlmHomePage(driver);
	olmHomePage.ListEmployee();
	
}
}
