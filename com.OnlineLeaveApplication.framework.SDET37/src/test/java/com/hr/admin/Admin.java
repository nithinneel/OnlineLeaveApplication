package com.hr.admin;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.BeforeFinalSubmissionPage;
import com.crm.objectRepository.GoToApplicationPage;
import com.crm.objectRepository.OlmHomePage;
import com.crm.objectRepository.onlineLeaveApplicationPage;

public class Admin extends BaseClass{
	@Test
	public void adminApplyForLeaveAndCheck() throws Throwable {
		//WebDriver driver=null;
		String altempcn = eLib.readDataFromExcel("girigiri", 1, 0);
		String reason = eLib.readDataFromExcel("girigiri", 2, 0);
		String fdate = eLib.readDataFromExcel("girigiri", 3, 0);
		String tdate = eLib.readDataFromExcel("girigiri", 4, 0);
		String urgent = eLib.readDataFromExcel("girigiri", 5, 0);

		//APPLING LEAVE ON ONLINE APPLICATION PAGE
		onlineLeaveApplicationPage onlineleaveapplicationpa =new onlineLeaveApplicationPage(driver);
		onlineleaveapplicationpa.onlineleaveappppage(altempcn, reason, fdate, tdate, urgent);

		//conformation leave application
		BeforeFinalSubmissionPage beforefinalsubmission = new BeforeFinalSubmissionPage(driver);
		beforefinalsubmission.Beforefinalsubmition();

		//move back to previous window
		driver.navigate().back();

		//Click on Application button
		OlmHomePage olmHomePage=new OlmHomePage(driver);
		olmHomePage.Application();

		//Getting text from gotoapplication page
		GoToApplicationPage goToApplicationPage=new GoToApplicationPage(driver);
		String adminname=goToApplicationPage.admintextname();
		System.out.println(adminname);

		//verification
		if (adminname.contains(altempcn)) {
			System.out.println("PASS - Leave application is displayed in leave applications page");
		}
		else {
			System.out.println("FAIL - Leave application IS NOT displayed in leave application page");
			
		}
	}
}