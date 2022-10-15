package SelenuimTask.VoisKsrtcTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]")
	WebElement date;
	
	@FindBy(xpath = "//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")
	WebElement SearchForBus;
	
	
	public void Search_Travel() {
		
		date.click();
		SearchForBus.click();
	}
	

	
	
}
