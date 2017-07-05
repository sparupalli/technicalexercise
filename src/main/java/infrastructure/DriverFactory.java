package infrastructure;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

/**
 * Builds a selenium webdriver instance
 * @author sparupalli
 *
 */
public interface DriverFactory {

	/**
	 * Need to implement a way to define the default browser currenlty using firefox as default
	 * @return
	 */
	WebDriver getDefaultDriver();
	
	WebDriver getFirefoxDriver(Capabilities desiredCapabilities);
	
	WebDriver getChromeDriver(Capabilities desiredCapabilities);
	
}
