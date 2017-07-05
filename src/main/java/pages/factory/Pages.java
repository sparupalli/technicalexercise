package pages.factory;

import pages.BookAFlightPage;
import pages.BookingConfirmationPage;
import pages.FlightFinderPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.NavigationPage;
import pages.SelectFlightPage;

import com.google.inject.Inject;

public class Pages {

	private LandingPage landingPage; 
	private NavigationPage navigationPage;
	private FlightFinderPage flightFinderPage;
	private LoginPage loginPage;	
	private SelectFlightPage selectFlightPage;
	private BookAFlightPage bookAFlightPage;
	private BookingConfirmationPage bookingConfirmationPage;
	
	public BookingConfirmationPage getBookingConfirmationPage() {
		return bookingConfirmationPage;
	}

	@Inject
	public Pages(LoginPage loginPage, LandingPage landingPage,
			NavigationPage navigationPage, FlightFinderPage flightFinderPage,
			SelectFlightPage selectFlightPage, BookAFlightPage bookAFlightPage, 
			BookingConfirmationPage bookingConfirmationPage) {
		
		super();
		this.loginPage = loginPage;
		this.landingPage = landingPage;
		this.navigationPage = navigationPage;
		this.flightFinderPage = flightFinderPage;
		this.selectFlightPage = selectFlightPage;
		this.bookAFlightPage = bookAFlightPage;
		this.bookingConfirmationPage = bookingConfirmationPage;
	}
	
	public BookAFlightPage getBookAFlightPage() {
		return bookAFlightPage;
	}

	public LoginPage getLoginPage() {
		return loginPage;
	}

	public LandingPage getLandingPage() {
		return landingPage;
	}

	public NavigationPage getNavigationPage() {
		return navigationPage;
	}
	
	public FlightFinderPage getFlightFinderPage() {
		return flightFinderPage;
	}

	public SelectFlightPage getSelectFlightPage() {
		return selectFlightPage;
	}
	
	
	
	
}
