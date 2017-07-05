package pages;

import infrastructure.Driver;
import infrastructure.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.google.inject.Inject;

public class FlightFinderPage extends PageObject{

	@Inject
	public FlightFinderPage(Driver driver) {
		super(driver);		
	}
	
	@FindBy(css = "input[value='oneway']")
	private WebElement oneWayTypeChkBox; 
	
	@FindBy(css = "select[name='fromPort']")
	private WebElement departingFrom;
	
	@FindBy(css = "select[name='toPort']")
	private WebElement arrivingIn;	
	
	@FindBy(css = "input[value='First']")
	private WebElement serviceClass;
	
	@FindBy(css = "input[name='findFlights']")
	private WebElement continueButton;
	
	public FlightFinderPage withOnewayType(){
		oneWayTypeChkBox.click();
		return this;
	}
	
	public FlightFinderPage departingFrom(String departingFrom){
		new Select(this.departingFrom).selectByValue(departingFrom);
		return this;
	}
	
	public FlightFinderPage arrivingIn(String arrivingIn){
		new Select(this.arrivingIn).selectByValue(arrivingIn);
		return this;
	}
	
	public FlightFinderPage withFirstClass(){
		serviceClass.click();
		return this;
	}
	
	public void continueWithSubmission(){
		continueButton.click();
	}
	
	
	
}
