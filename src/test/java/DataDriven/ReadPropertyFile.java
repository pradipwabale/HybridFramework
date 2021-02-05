package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	static Properties prop;

	public void ReadConfig() {

		File src = new File("./Configuration/Config.properties");
		try {

			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();

			prop.load(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	public String getApplicationUrl(){
		String url=prop.getProperty("baseUrl");
		return url;	
	}
	public static String getUserName(){
		String username=prop.getProperty("username");
		return username;	
	}
	public static String getPassword(){
		String password=prop.getProperty("password");
		return password;	
	}
	 

}
