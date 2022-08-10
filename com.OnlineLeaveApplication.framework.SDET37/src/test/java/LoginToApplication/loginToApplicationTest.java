package LoginToApplication;

import org.testng.annotations.Test;

import com.crm.genericUtilities.BaseClass;

/**
 * 
 * @author nithin
 *
 */
import com.crm.objectRepository.LoginPage;


public class loginToApplicationTest extends BaseClass{
	
		@Test
		public void login() {
			LoginPage login = new LoginPage(driver);
			String USERNAME = fLib.getPropertKeyValue("adminUerName");
			String PASSWORD = fLib.getPropertKeyValue("adminPassword");
			login.logintoOLMT(USERNAME, PASSWORD);
			
		}
	 
	}


