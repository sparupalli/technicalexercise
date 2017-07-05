package pages;

import infrastructure.Driver;
import infrastructure.PageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.inject.Inject;

public class BookingConfirmationPage extends PageObject{

	@Inject
	public BookingConfirmationPage(Driver driver) {
		super(driver);		
	}
	
	@FindBy(css = "p[align='left']")
	private List<WebElement> confirmationTextList;
	
	
	public boolean isOnBookingConfirmationPage(){
		for(WebElement element : confirmationTextList){
			return element.getText().contains("Your itinerary has been booked!");
		}
		return false;
	}

}
