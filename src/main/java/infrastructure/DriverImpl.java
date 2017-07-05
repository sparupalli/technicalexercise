package infrastructure;

import org.openqa.selenium.WebDriver;

import com.google.inject.Inject;

public class DriverImpl implements Driver {

	private static WebDriver driver;
	private DriverFactory driverFactory;
	
	@Inject
	public DriverImpl(DriverFactory driverFactory){
		this.driverFactory = driverFactory;
	}	
	
	// implementation can be moved to Guice @Providers
	public WebDriver getInstance(){
		if(driver == null){
			driver = driverFactory.getDefaultDriver(); 
		}
		return driver;
	}
}
