package pages;

import infrastructure.Driver;
import infrastructure.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.inject.Inject;

public class SelectFlightPage extends PageObject{

	@Inject
	public SelectFlightPage(Driver driver) {
		super(driver);		
	}
	
	@FindBy(css = "input[name='reserveFlights']")
	private WebElement continueButton;
	
	@FindBy(css = "input[name='outFlight']")
	private WebElement departRadioSelections;
	
	public boolean isOnSelectFlightPage(){
		return departRadioSelections.isDisplayed();
	}
	
	public void continueWithSelection(){
		continueButton.click();
	}

}
