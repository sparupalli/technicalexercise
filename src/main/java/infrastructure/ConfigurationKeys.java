package infrastructure;

public enum ConfigurationKeys {

	FRAMEWORK_BASE_URL ("framework.base.url"),
	FRAMEWORK_DEFAULT_DRIVER ("framework.default.driver"),
	FRAMEWORK_IMPLICIT_TIMEOUT ("framework.implicit.timeout");
	
	private final String text;

	private ConfigurationKeys(String text){
		this.text = text;
	}

	@Override
	public String toString(){		
		return text;
	}
	
}
