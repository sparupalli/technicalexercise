package techexercise;

import static org.hamcrest.Matchers.is;

import org.junit.Assert;
import org.junit.Test;

import pages.factory.Pages;

public class TechExerciseTests extends BaseTest{
	
	private Pages pages;
	
	public TechExerciseTests(){
		this.pages = getPages();
	}
	
	@Test
	public void flightBookingJourneyTest(){
		
		pages.getNavigationPage().openApplication();	
		pages.getLoginPage().loginToApplication("mercury", "mercury");
		Assert.assertThat(pages.getLoginPage().isSignedIn(), is(true));

		pages.getFlightFinderPage()
					.withOnewayType()
					.departingFrom("Sydney")
					.arrivingIn("London")
					.withFirstClass()
					.continueWithSubmission();		
		Assert.assertThat(pages.getSelectFlightPage().isOnSelectFlightPage(), is(true));
		
		pages.getSelectFlightPage().continueWithSelection();		
		Assert.assertThat(pages.getBookAFlightPage().isBookAFlightPage(), is(true));
		
		pages.getBookAFlightPage().enterFirstName("Srinivasa");
		pages.getBookAFlightPage().enterLastName("Parupalli");
		pages.getBookAFlightPage().enterCreditCard("12345678910");
		pages.getBookAFlightPage().clickTicketLessTravel();		
		pages.getBookAFlightPage().clickOnSecurePurchase();
		
		Assert.assertThat(pages.getBookingConfirmationPage().isOnBookingConfirmationPage(), is(true));
		
		pages.getNavigationPage().getDriver().quit();
	}
	
	
	
	
}
