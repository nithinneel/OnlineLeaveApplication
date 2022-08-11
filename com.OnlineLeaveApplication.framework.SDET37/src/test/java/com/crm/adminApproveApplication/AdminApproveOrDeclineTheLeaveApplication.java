package com.crm.adminApproveApplication;

import java.awt.AWTException;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.GoToApplicationPage;
import com.crm.objectRepository.GoToRecommendedLeaveApplication;
import com.crm.objectRepository.GoToUsersLeaveDetails;
import com.crm.objectRepository.OlmHomePage;

public class AdminApproveOrDeclineTheLeaveApplication extends BaseClass{

	@Test
	public void adminApprovveLeaveApplication() throws InterruptedException, AWTException
	{		
		//go to home page click on application link
		OlmHomePage homepage = new OlmHomePage(driver);
		homepage.Application();
			
		//goinside the application link and click on recommended button
		GoToApplicationPage applicationpage=new GoToApplicationPage(driver);
		applicationpage.recommendBtn();
		
		//click on users leavedetails
		homepage.UsersLeaveDetails();

		//click on go back button inside the user leave details & select an employee and check the leave details
		GoToUsersLeaveDetails userleavdetails = new GoToUsersLeaveDetails(driver);
		userleavdetails.viewLeaveDetails(driver);	
		//		
		//		//select an employee and check the leave details
		//		userleavdetails.selectemp(driver);

		//click on recommended application
		homepage.RecommendedApplication();

		//click on decline button

	GoToRecommendedLeaveApplication recommendedapplication = new GoToRecommendedLeaveApplication(driver);
//		recommendedapplication.declineBtn(driver);
		recommendedapplication.approveBtn();

		Thread.sleep(3000);
		//approve the leave application
		//recommendedapplication.clickOnCanclelPrint(driver);
		//recommendedapplication.mousehoverClickCancelPrint(driver);
		wLib.EnterTabAndClickOnDestination();
		wLib.backToPreviousPage(driver);


	}


}
