package guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class Injectors {

	private static Injector injector;

	public static synchronized Injector getInjector() {
		if (injector == null) {
			injector = Guice.createInjector(new Module[] { new FrameworkModule() });
		}
		return injector;
	}	
}
