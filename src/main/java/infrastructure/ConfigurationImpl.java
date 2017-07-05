package infrastructure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import com.google.inject.Singleton;

@Singleton
public class ConfigurationImpl implements Configuration{
	
	private Properties properties;
	
	public ConfigurationImpl(){
		loadGlobalProperties();
	}

	public String getValue(ConfigurationKeys configKey) {
		return properties.getProperty(configKey.toString());
	}

	private void loadGlobalProperties(){
		properties = new Properties();
		FileInputStream fileStream;
		try {
			fileStream = new FileInputStream(new File("global.properties"));
			properties.load(fileStream);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch	(IOException e){
			e.printStackTrace();
		}
		
	}
	
}
