package Emplyoee;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.EmpApplyLeaveFinalSubmissionPage;
import com.crm.objectRepository.EmpHomePage;
import com.crm.objectRepository.EmpUserProfilePage;
/**
 * 
 * @author Zabiulla
 *
 */
public class EmployeeUpdateProfile  extends BaseClass{
	@Test
	public void updateProfile() throws Throwable
	{
		//Go to home page and click on User Profile
		EmpHomePage emphomepage = new EmpHomePage(driver);
		emphomepage.UserProfile();
		
		//Go to user profile page and enter the updated data in their respective textfield
		EmpUserProfilePage empuserprofilepage = new EmpUserProfilePage(driver);
		String presentAddress = eLib.readDataFromExcel("Employee_Data", 7, 14);
		String personalNumber = eLib.readDataFromExcel("Employee_Data", 7, 11);
		//System.out.println(personalNumber);
		Thread.sleep(2000);
		
//		WebElement empUpdateTextFld = empuserprofilepage.getUserPresentAddressTextFd();
//		empUpdateTextFld.clear();
//		empUpdateTextFld.sendKeys(presentAddress);
//		
//		Thread.sleep(2000);
//		 WebElement updatephonenumber = empuserprofilepage.getUserPersonalPhoneNumberTextFd();
//		 updatephonenumber.clear();
//		 updatephonenumber.sendKeys(personalNumber);
//		 
//		Thread.sleep(2000);
//		empuserprofilepage.getUpdateBtn().click();
		EmpUserProfilePage updateUserProfile = new EmpUserProfilePage(driver);
		Thread.sleep(2000);
		updateUserProfile.updateUserData(personalNumber, presentAddress);
		EmpApplyLeaveFinalSubmissionPage empfinalsubmission = new EmpApplyLeaveFinalSubmissionPage(driver);
		Thread.sleep(2000);
		String verificationtext = empfinalsubmission.getVerification().getText();
		assertTrue(verificationtext.contains("Successfully Updated"));
		Reporter.log("Data is updated successfully",true);
//		if (verificationtext.contains("Successfully Updated")) {
//			System.out.println("Data is updated");
//					}
//		else {
//			System.out.println("Data is not updated");
//		}
		
	}	
}
