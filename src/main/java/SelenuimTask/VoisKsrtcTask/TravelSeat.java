package SelenuimTask.VoisKsrtcTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class TravelSeat extends PageBase {

	public TravelSeat(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(id = "BpFid")
	WebElement boardPoint;
	
	@FindBy(xpath = "//*[@id=\"filterByDiv\"]/div[1]/div/div[3]/div/div/ul/li[1]/label")
	WebElement boardPointOption;
	
	@FindBy(xpath = "//*[@id=\"DpFid\"]")
	WebElement dropPoint;
	
	@FindBy(xpath = "//*[@id=\"filterByDiv\"]/div[1]/div/div[4]/div/div/ul/li[3]/label")
	WebElement dropPointOption;
	
	public void select_travel_seat() {
		boardPoint.click();
		boardPointOption.click();
		
		dropPoint.click();
		dropPointOption.click();
	}
	
}
