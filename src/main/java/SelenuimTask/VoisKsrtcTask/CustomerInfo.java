package SelenuimTask.VoisKsrtcTask;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CustomerInfo extends PageBase {

	public CustomerInfo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath = "//*[@id=\"myTab\"]/li[3]")
	WebElement customerDetails;
	
	@FindBy(id = "mobileNo")
	WebElement MobileNo;
	
	@FindBy(id = "email")
	WebElement emailId;
	
	@FindBy(xpath = "//*[@id=\"Forward16\"]")
	WebElement location;
	
	@FindBy(id = "passengerNameForward0")
	WebElement passengerName;
	
	@FindBy(id = "genderCodeIdForward0")
	WebElement gender;
	
	@FindBy(id = "passengerAgeForward0")
	WebElement Age;
	
	
	@FindBy(id = "concessionIdsForward0")
	WebElement concession;
	
	
	public void insert_customer_data() {
			
		customerDetails.click();
		MobileNo.sendKeys("6789125987");
		emailId.sendKeys("ahmed@gmail.com");
		
		location.click();
		
		passengerName.sendKeys("Ahmed Wageeh");
		
		
		Age.sendKeys("25");
		
	}

}
