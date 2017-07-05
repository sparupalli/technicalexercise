package pages;

import infrastructure.Configuration;
import infrastructure.ConfigurationImpl;
import infrastructure.ConfigurationKeys;
import infrastructure.Driver;
import infrastructure.PageObject;

import com.google.inject.Inject;

public class NavigationPage extends PageObject{

	private Configuration configuration;

	@Inject
	public NavigationPage(Driver driver) {		
		super(driver);		
		this.configuration = new ConfigurationImpl();
	}

	public void openApplication(){
		this.getDriver().get(configuration.getValue(ConfigurationKeys.FRAMEWORK_BASE_URL));
	}
	
	
}
