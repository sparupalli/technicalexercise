package guice;

import infrastructure.Configuration;
import infrastructure.ConfigurationImpl;
import infrastructure.Driver;
import infrastructure.DriverFactory;
import infrastructure.DriverFactoryImpl;
import infrastructure.DriverImpl;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class FrameworkModule extends AbstractModule {

	@Override
	protected void configure() {		
		bind(Configuration.class).to(ConfigurationImpl.class).in(Singleton.class);
		bind(Driver.class).to(DriverImpl.class).in(Singleton.class);
		bind(DriverFactory.class).to(DriverFactoryImpl.class);
	}	
}
