package LoginToApplication;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;
import com.crm.objectRepository.GoToApplicationPage;
import com.crm.objectRepository.GoToRecommendedLeaveApplication;
import com.crm.objectRepository.GoToUsersLeaveDetails;
import com.crm.objectRepository.OlmHomePage;

public class AdminDeclineLeaveApplication  extends BaseClass{
	@Test
	public void adminDeclineleave() throws InterruptedException {
		OlmHomePage homepage = new OlmHomePage(driver);
		Thread.sleep(5000);
		homepage.Application();
		GoToApplicationPage applicationPage = new GoToApplicationPage(driver);
		applicationPage.recommendBtn();
		homepage.UsersLeaveDetails();
		GoToUsersLeaveDetails userleavedetails = new GoToUsersLeaveDetails(driver);
		userleavedetails.viewLeaveDetails(driver);
		homepage.RecommendedApplication();
		GoToRecommendedLeaveApplication recommandedapplication = new GoToRecommendedLeaveApplication(driver);
		recommandedapplication.declineBtn();
		//delete this durning merge
	}

}
