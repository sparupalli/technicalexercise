package pages;

import infrastructure.Driver;
import infrastructure.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.inject.Inject;

public class LoginPage extends PageObject {

	@Inject
	public LoginPage(Driver driver) {
		super(driver);
	}

	@FindBy(css = "input[name='userName']")
	private WebElement userName;

	@FindBy(css = "input[name='password']")
	private WebElement passWord;

	@FindBy(css = "input[name='login']")
	private WebElement loginButton;
	
	@FindBy(linkText = "SIGN-OFF")
	private WebElement singOffLink;
	
	public void loginToApplication(String username, String password){
		userName.sendKeys(username);
		passWord.sendKeys(password);
		loginButton.click();
	}
	
	public boolean isSignedIn(){
		return singOffLink.isDisplayed();
	}
	
}
