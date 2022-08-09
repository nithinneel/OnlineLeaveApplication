package com.crm.objectRepository;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatedEmployeeDashBoard {
	
//Initialization
	public CreatedEmployeeDashBoard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath = "//tr") List<WebElement> listofEmpCode;

	public List<WebElement> getEmpCode() {
		return listofEmpCode;
	}
	
	public void listofEmployeeDashBoard(String empName ) {
	    for (WebElement empCode : listofEmpCode) {
			if (empCode.getText().contains(empName)) {
				System.out.println("Pass :- Employee is Created ");
				break;
			}else {
				System.out.println("Fail :- Employee isnot Created ");
			}
		}
	}
}
