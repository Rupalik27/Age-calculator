package Pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.CalculationPage;
import POM.HomePage;

public class Varification {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal\\Downloads\\chromedriver_win32\\chromedriver.exe")	;
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.calculator.net/age-calculator.html");
	HomePage homePage= new HomePage(driver);
	homePage.sendDate_of_birth();
	homePage.sendMonth_of_birth();
	homePage.sendYear_of_birth(driver);
	homePage.sendCurrent_date();
	homePage.sendCurrent_month();
	homePage.sendCurrent_year(driver);
	homePage.clickOnCalculate();
	
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
		
	
	CalculationPage calculationPage=new CalculationPage(driver);
	calculationPage.Home_pageInput();
	
	String url1=driver.getCurrentUrl();
	String title2=driver.getTitle();
	System.out.println(url);
	System.out.println(title);
	
}
}
