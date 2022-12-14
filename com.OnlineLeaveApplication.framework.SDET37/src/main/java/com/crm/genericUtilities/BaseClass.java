package com.crm.genericUtilities;
/**
 * 
 * @author SanjayBabu
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.objectRepository.LoginPage;
import com.crm.objectRepository.OlmHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	
	public static WebDriver sdriver;
	public WebDriver driver;
	public DataBaseUtility dLib=new DataBaseUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public FileUtility fLib=new FileUtility();
	public WebDriverUtility  wLib=new WebDriverUtility();
	public JavaUtility jLib=new JavaUtility();
	
	/**
	 * connecting to database
	 */
	@BeforeSuite
	public void dbConfig()
	{
		dLib.connectToDB();
	}
	/**
	 * launching the browser
	 * @throws Throwable
	 */
	//@Parameters("BROWSER")
	@BeforeClass
	public void launchTheBrowser()
	{  
		String BROWSER = null;
		try {
			BROWSER = fLib.getPropertKeyValue("browser");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println(BROWSER);
		String URL = null;
		try {
			URL = fLib.getPropertKeyValue("url");
		} catch (Throwable e) {
			e.printStackTrace();
		}

		if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(BROWSER.equalsIgnoreCase("chrome"))
		{
			System.out.println("1");
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else {
			driver=new ChromeDriver();
		}

		System.out.println("Browser successfully launched");
		//implicitly wait
		sdriver=driver;
		wLib.waitForPageToLoad(driver);
		//enter the URL of the Application
		sdriver.get(URL);
		//maximize the screen
		driver.manage().window().maximize();
	}
	
	/**
	 * login to application as employee
	 */
	@BeforeMethod
	public void loginToAppln()
	{
		String USERNAME = null;
		try {
			USERNAME = fLib.getPropertKeyValue("loginUserName");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		String PASSWORD = null;
		try {
			PASSWORD = fLib.getPropertKeyValue("loginPassword");
		} catch (Throwable e) {
			e.printStackTrace();
		}

		LoginPage loginpage  = new LoginPage(driver);
		loginpage.logintoOLMT(USERNAME, PASSWORD);
		System.out.println("Employee Login successful");
	}	
	/**
	 * logout from application
	 */
	@AfterMethod
	public void logoutFromAppln()
	{
		OlmHomePage homePage = new OlmHomePage(driver);
		homePage.Logout();
		System.out.println("Logout successful");
	}
	/**
	 * close the browser
	 */
	@AfterClass
	public void closeTheBrowser()
	{
		driver.quit();
		System.out.println("Browser successfully closed");
	}
	/**
	 * close database configuration
	 */
	@AfterSuite
	public void closeDBconfig()
	{
		dLib.closeDB();
	}
}