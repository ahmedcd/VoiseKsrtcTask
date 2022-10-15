package SelenuimTask.VoisKsrtcTask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test extends TestBase{
	
	HomePage homepage;
	TravelSeat travelSeat;
	CustomerInfo customer;
	Payment payment;
	
	
	@org.testng.annotations.Test
	public void Search_for_Bus() {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement selectTravel = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a")));
		selectTravel.click();
		
		
				
		homepage = new HomePage(driver);
		homepage.Search_Travel();
		
		
		travelSeat = new TravelSeat(driver);
		travelSeat.select_travel_seat();
		
		WebDriverWait wait2 = new WebDriverWait(driver,5);
		WebElement selectSeat = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ForwardResults\"]/div[6]/div[1]/div[1]/div[5]/div")));

		selectSeat.click();
		
		js.executeScript("window.scrollBy(0,400)", "");
		
		
		WebElement dropDownOption = driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[2]"));
		dropDownOption.click();
		
		WebDriverWait wait3 = new WebDriverWait(driver,5);
		WebElement sd = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Forward-1468044935052\"]")));
		sd.click();
		
		
		
		customer = new CustomerInfo(driver);
		customer.insert_customer_data();
		
		
		WebElement gender = driver.findElement(By.id("genderCodeIdForward0"));
		Select select = new Select(gender);
		select.selectByVisibleText("MALE");
		
		WebElement concession = driver.findElement(By.id("concessionIdsForward0"));
		Select select2 = new Select(concession);
		select2.selectByVisibleText("GENERAL PUBLIC");
		
		
		payment = new Payment(driver);
		payment.Customer_payment();
		
	}

}
