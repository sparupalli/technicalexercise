package infrastructure;

import org.openqa.selenium.WebDriver;

/**
 * Maintains a singleton instance of a webDriver. 
 * @author sparupalli
 *
 */
public interface Driver {

	/**
	 * Get a driver instance to interact
	 * @return WebDriver
	 */
	WebDriver getInstance();	
	
}