package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	public static WebDriver openChromeBrowser()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe")	;
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver openFirefoxBrowser()
	{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rupal\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe")	;
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

	public static WebDriver openMSedgeBrowser()
	{

		System.setProperty("webdriver.edge.driver", "C:\\Users\\rupal\\Downloads\\edgedriver_win64\\msedgedriver.exe")	;
		WebDriver driver = new EdgeDriver();
		return driver;
	}
	
	public static WebDriver openOperaBrowser()
	{

		System.setProperty("webdriver.opera.driver", "C:\\Users\\rupal\\Downloads\\operadriver_win64 (1)\\operadriver_win64\\operadriver.exe")	;
		WebDriver driver = new OperaDriver();
		return driver;
	}


}
