package techexercise;

import guice.Injectors;
import pages.factory.Pages;

public class BaseTest {

	private Pages pages;

	public BaseTest(){
		this.pages = Injectors.getInjector().getInstance(Pages.class);
	}

	public Pages getPages() {
		return pages;
	}
	
}
