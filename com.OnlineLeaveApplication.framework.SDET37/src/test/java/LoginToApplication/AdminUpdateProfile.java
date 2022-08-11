package LoginToApplication;

import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.OlmHomePage;
import com.crm.objectRepository.UserProfilePage;

public class AdminUpdateProfile extends BaseClass {
	@Test
	public void adminUpdateProfile() throws Throwable {
		OlmHomePage olmhomepage = new OlmHomePage(driver);
		olmhomepage.UserProfile();
		UserProfilePage adminuserprofilepage = new UserProfilePage(driver);
		String personalPhoneNumber = eLib.readDataFromExcel("Employee_Data", 10, 11);
		String presentAddress = eLib.readDataFromExcel("Employee_Data", 10, 14);
		Thread.sleep(5000);
		adminuserprofilepage.AdminUpdateProfile(personalPhoneNumber, presentAddress);
		String updateVerification = adminuserprofilepage.getUpdateVerification().getText();
		assertTrue(updateVerification.contains("Successfully Updated"));
		Reporter.log("Admin Data is Updated",true);
		
	}

}
