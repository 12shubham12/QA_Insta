package qa_paytm.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	public Properties prop;

/*-----------------------------To Load the config.properties file---------------------------------*/	
	public ConfigDataProvider(){
		
		try{
		File src = new File("./Config/config.properties");
		FileInputStream fis = new FileInputStream(src);
		prop = new Properties();
		prop.load(fis);	
		}
		catch(Exception e){
			System.out.println("Not able to load config file :"+e.getMessage());
		}
	}
	
	
	/*-----------------------------To Read the data config.properties file---------------------------------*/	
		
	public String getBrowser(){
		return prop.getProperty("browser");
	}
	
	public String getQAURL(){
		return prop.getProperty("qaURL");
	}
	
	/*--------------generic method that will read the key that we have passed & return the same---------------*/	
	
	public String getDataFromConfig(String keyToSearch){
		return prop.getProperty(keyToSearch);
	}
}
