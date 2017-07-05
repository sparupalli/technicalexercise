package pages;

import infrastructure.Driver;
import infrastructure.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.inject.Inject;

public class BookAFlightPage extends PageObject{

	@Inject
	public BookAFlightPage(Driver driver) {
		super(driver);		
	}
	
	@FindBy(css ="input[name='passFirst0']")
	private WebElement firstName;
	
	@FindBy(css ="input[name='passLast0']")
	private WebElement lastName;
	
	@FindBy(css ="input[name='creditnumber']")
	private WebElement creditCardNumber;
	
	@FindBy(css ="input[name='ticketLess']")
	private WebElement ticketLessTravel;
	
	@FindBy(css ="input[name='buyFlights']")
	private WebElement securePurchaseButton;
	
	public void enterFirstName(String firstName){
		this.firstName.sendKeys(firstName);		
	}
	
	public void enterLastName(String lastName){
		this.lastName.sendKeys(lastName);		
	}
	
	public void enterCreditCard(String creditCardNumber){
		this.creditCardNumber.sendKeys(creditCardNumber);		
	}
	
	public void clickOnSecurePurchase(){
		securePurchaseButton.click();
	}

	public boolean isBookAFlightPage() {
		return creditCardNumber.isDisplayed();
	}

	public void clickTicketLessTravel() {
		ticketLessTravel.click();		
	}
	

}
