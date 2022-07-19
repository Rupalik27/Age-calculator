package Testpack2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Browsers.Base;
import POM.CalculationPage;
import POM.HomePage;

public class TestNGCopy extends Base {
        WebDriver driver;
        HomePage homePage;
        CalculationPage calculationPage;
        static ExtentTest test;
    	static ExtentHtmlReporter reporter;
        @Parameters("browserName")
        
    
        @BeforeTest
        public void launchBrowser(String browser) {
        	reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
    		ExtentReports extend = new ExtentReports();
    		extend.attachReporter(reporter);
        	System.out.println("before test");
        	if(browser.equalsIgnoreCase("Chrome")) 
        	{
        		driver=openChromeBrowser();
        	}
        	if(browser.equalsIgnoreCase("Opera"))
        	{
        		driver=openOperaBrowser();
        	}
        	if(browser.equalsIgnoreCase("Edge"))
        	{
        		driver=openMSedgeBrowser();
        	}
        		
        }
		@BeforeClass
		public void createPOMObjects()
		{
			
			homePage=new HomePage(driver);
			calculationPage=new CalculationPage(driver);
		}
		@BeforeMethod 
		public void homePageActions()
		{
			driver.get("https://www.calculator.net/age-calculator.html");
			HomePage homePage= new HomePage(driver);
			homePage.sendDate_of_birth();
			homePage.sendMonth_of_birth();
			homePage.sendYear_of_birth(driver);
			homePage.sendCurrent_date();
			homePage.sendCurrent_month();
			homePage.sendCurrent_year(driver);
			homePage.clickOnCalculate();
			//SoftAssert soft =new SoftAssert();
		}
		@Test(priority=1)
		public void varifyUrlAndTitle() throws InterruptedException
		{
			Thread.sleep(2000);
			String url=driver.getCurrentUrl();
			String title=driver.getTitle();
			System.out.println(url);
			System.out.println(title);
	   if (url.equals("https://www.calculator.net/age-calculator.html?today=10%2F27%2F2000&ageat=06%2F16%2F2022&x=69&y=19")&& title.equals("Age Calculator")) {
				System.out.println("Passed");
			}
			else {
				System.out.println(" Failed");
			     }
		//	SoftAssert soft =new SoftAssert();
		//	soft.assertEquals(url,"https://www.calculator.net/age-calculator.html","testA");
		//	System.out.println("hello");
		//	soft.assertAll();
			
		}
			
			@Test(priority=2)
			public void calculation()
			{
				CalculationPage calculationPage=new CalculationPage(driver);
				calculationPage.Home_pageInput();
				
			} 
			@AfterMethod
			
			public void  aftermethod ()
			{
				System.out.println("AfterMethod");
			}
			
			@AfterClass
			public void clearObject ()
			{
			homePage= null;
			calculationPage=null;
			}
			@AfterTest
			public void closeBrowser ()
			{
				driver.quit();
				driver=null;
				System.gc();//garbage collector
			}
		}
		
				
			
				
			
		





