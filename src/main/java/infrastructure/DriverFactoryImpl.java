package infrastructure;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactoryImpl implements DriverFactory {
	
	
	public DriverFactoryImpl(){
		addDriverPathToSystemProperty();
	}
	
	public WebDriver getDefaultDriver() {			
		return new ChromeDriver();
	}	

	public WebDriver getFirefoxDriver(Capabilities desiredCapabilities) {	
		return new FirefoxDriver(desiredCapabilities);
	}

	public WebDriver getChromeDriver(Capabilities desiredCapabilities) {
		return new ChromeDriver(desiredCapabilities);
	}
	
	private void addDriverPathToSystemProperty(){		
		ClassLoader classLoader = getClass().getClassLoader();		
		System.setProperty("webdriver.gecko.driver", classLoader.getResource("drivers/geckodriver.exe").getPath());
		System.setProperty("webdriver.chrome.driver", classLoader.getResource("drivers/chromedriver.exe").getPath());		
	}
	
}

