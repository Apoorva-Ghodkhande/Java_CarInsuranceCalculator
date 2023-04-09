package reusableComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class PropertiesOperations {
	
	static Properties prop=new Properties();	
	public static String getValueForTheKey(String key) throws IOException
	{
		String filePath= System.getProperty("user.dir")+"/src/test/resources/config.properties";	
		FileInputStream file= new FileInputStream(filePath);
		prop.load(file);
		return prop.get(key).toString();
	}
	
	
  
}
