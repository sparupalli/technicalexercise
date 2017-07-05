package infrastructure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.google.inject.Inject;

/**
 * Base class for page object operations
 * @author sparupalli
 *
 */
public class PageObject {
	
	private Driver driver;
		
	@Inject
	public PageObject(Driver driver){		
		this.driver = driver;	
		setImplicitTimeOuts(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver.getInstance(), this);		
	}
	
	public WebDriver getDriver(){
		return driver.getInstance();
	}
	
	public void setImplicitTimeOuts(long time, TimeUnit timeUnit){
		driver.getInstance().manage().timeouts().implicitlyWait(time, timeUnit);
	}
	
	
	
}
