package com.crm.designation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.AddDesignationPage;
import com.crm.objectRepository.OlmHomePage;

public class CreateDesignationTest extends BaseClass{
	
	@Test
	public void addDesignation()
	{
		// fetch depart name from excel sheet
	String deptname = eLib.readDataFromExcel("Employee_Data", 3, 20);
		
	// fetch designation name from excel sheet
	String desgname = eLib.readDataFromExcel("Employee_Data", 4, 2);
// click on  designation 
		OlmHomePage olmhp = new OlmHomePage(driver);
		olmhp.AddDesignation();
		
		
		
		AddDesignationPage adDesignation = new AddDesignationPage(driver);
		adDesignation.selectDepartment(deptname);
		
	
		//give data in designation 
		adDesignation.getAddDestinationBtn().sendKeys(desgname);
		
		//click on add designation btn
		adDesignation.getAddDestinationBtn().click();
		
		//click on list of designation
		olmhp.ListDesignation();
		
		//check the data is inserted or not
		String check = driver.findElement(By.xpath("//td[.='Production']/..//td[.='apple']")).getText();
		//Assert.assertTrue(check.contains(desgname));
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(check.contains(desgname));
		Reporter.log("CreateDesignation is pass",true);
		sa.assertAll();
}
}