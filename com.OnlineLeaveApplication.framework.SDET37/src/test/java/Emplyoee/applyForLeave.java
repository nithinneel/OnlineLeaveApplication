package Emplyoee;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.EmpApplyLeaveFinalSubmissionPage;
import com.crm.objectRepository.EmpApplyLeavePage;
/**
 * 
 * @author Zabiulla
 *
 */
public class applyForLeave  extends BaseClass{

	@Test
	public void leave() throws AWTException, Throwable {
		//Enter the Data in the Alternate Employee Code Name
		EmpApplyLeavePage empapplyleavepage = new EmpApplyLeavePage(driver);
		String empName = eLib.readDataFromExcel("Employee_Data",6,3);
		String leaveType = eLib.readDataFromExcel("Employee_Data", 3, 19);
		String  text= eLib.readDataFromExcel("Employee_Data", 3, 15);
		String  fromDate= eLib.readDataFromExcel("Employee_Data", 3, 16);
		String  toDate= eLib.readDataFromExcel("Employee_Data", 3, 17);
		String  contactAddress= eLib.readDataFromExcel("Employee_Data", 2, 18);
		//System.out.println(empName);
		empapplyleavepage.ApplyLeave(empName,text, fromDate, toDate, contactAddress);
		
		//Enter the Data in Final Submission Page and click on submit Btn
		EmpApplyLeaveFinalSubmissionPage empFinalPage = new EmpApplyLeaveFinalSubmissionPage(driver);
		empFinalPage.getCasualLeave().click();
		empFinalPage.getApplyBtnFinalSbt().click();
		
		//using Robot Class  i am gng to handle window Popup
		wLib.EnterTabAndClickOnDestination();
		wLib.backToPreviousPage(driver);
		
	}
}
