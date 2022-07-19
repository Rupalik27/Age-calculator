package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	@FindBy(xpath="(//select[@class='calendarDateInput'])[2]")
	private WebElement date_of_birth;
	
	
	@FindBy(xpath="(//select[@class='calendarDateInput'])[1]")
	private WebElement month_of_birth ;

	
	@FindBy(xpath="//input[@id='today_Year_ID']")
	private WebElement year_of_birth;

	
	@FindBy(xpath= "(//select[@class='calendarDateInput'])[4] ")
	private WebElement current_date;
	
	@FindBy(xpath=" (//select[@class='calendarDateInput'])[3] ")
	private WebElement current_month;
	
	@FindBy(xpath="//input[@id='ageat_Year_ID']")
	private WebElement current_year;
	
	@FindBy(xpath="//input[@type='image']")
	private WebElement calculate;
	
    public HomePage(WebDriver driver)
 {
PageFactory.initElements(driver,this);
 }
 
 public void sendDate_of_birth() {  
 Select p= new Select(date_of_birth);
 p.selectByVisibleText("27");
 }
 
 public void sendMonth_of_birth() {
	  Select r= new Select(month_of_birth);
	     r.selectByVisibleText("Oct");
 }
     public void sendYear_of_birth(WebDriver driver) {
	  Actions act = new Actions(driver);
	  act.moveToElement(year_of_birth).doubleClick().sendKeys("2000").build().perform();
	  }
 
     public void  sendCurrent_date() {
	 Select q= new Select(current_date);
     q.selectByVisibleText("16");
	  }
 
	 
	 public void  sendCurrent_month() {
	 Select t= new Select( current_month);
     t.selectByVisibleText("Jun");
	 }
		 
		 
		 
    public void  sendCurrent_year(WebDriver driver) {
    Actions act = new Actions( driver);
   act.moveToElement(current_year).doubleClick().sendKeys("2022").build().perform();
    }
			 	 
	 
    public void  clickOnCalculate() {	
    	calculate.click();
    	

}
}
