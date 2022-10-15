package SelenuimTask.VoisKsrtcTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment extends PageBase{

	public Payment(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	@FindBy(xpath = "//*[@id=\"PgBtn\"]")
	WebElement paymentbtn;
	
	public void Customer_payment() {
	
		paymentbtn.click();
	}

}
