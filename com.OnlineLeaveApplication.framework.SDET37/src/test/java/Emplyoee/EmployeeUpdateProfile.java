package Emplyoee;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.EmpHomePage;
import com.crm.objectRepository.EmpUserProfilePage;

public class EmployeeUpdateProfile  extends BaseClass{
	@Test
	public void updateProfile() throws Throwable
	{
		//Go to home page and click on User Profile
		EmpHomePage emphomepage = new EmpHomePage(driver);
		emphomepage.UserProfile();
		
		//Go to user profile page and enter the updated data in their respective textfield
		EmpUserProfilePage empuserprofilepage = new EmpUserProfilePage(driver);
		String presentAddress = eLib.readDataFromExcel("Employee_Data", 5, 14);
		String personalNumber = eLib.readDataFromExcel("Employee_Data", 5, 11);
		System.out.println(personalNumber);
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
		updateUserProfile.updateUserData(personalNumber, presentAddress);
	}	
}
