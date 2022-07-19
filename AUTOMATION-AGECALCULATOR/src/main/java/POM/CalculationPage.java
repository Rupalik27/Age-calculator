package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculationPage {
	@FindBy(xpath= "//p[@class='verybigtext'] ")
	private WebElement get_calculation;
	
	
	
	
	public CalculationPage(WebDriver driver)
	 {
	PageFactory.initElements(driver,this);
	 }
	 
	 public void Home_pageInput() {
	 
	 
		String text= get_calculation.getText();
		System.out.println(text);
		 
} 
}
