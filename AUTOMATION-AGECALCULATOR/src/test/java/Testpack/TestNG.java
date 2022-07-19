package Testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Browsers.Base;
import POM.CalculationPage;
import POM.HomePage;

public class TestNG {
	
	WebDriver driver;
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe")	;
		 driver = new ChromeDriver();
		driver.get("https://www.calculator.net/age-calculator.html");
	}
	@BeforeMethod 
	public void homePageActions()
	{
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
	@Test()
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
		
		@AfterClass
		public void closeBrowser ()
		{
			driver.quit();
		}
		
		@Test()
		public void calculation()
		{
			CalculationPage calculationPage=new CalculationPage(driver);
			calculationPage.Home_pageInput();
			
		}
	}
	
			
		
			
		
	


