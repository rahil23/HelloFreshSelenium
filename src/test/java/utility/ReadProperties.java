package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperties {

	public static String sDirPath = System.getProperty("user.dir");
	public static String sConfigFile = sDirPath+"\\config.properties";
	
	@Test
public static String getConfigProperties(String skey)
{
		String sValue = null;
		
		FileInputStream	fis=null;
			
			try {
				fis = new FileInputStream(sConfigFile);  //TODO Catching FileNotFindException
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}   //TODO FileInputStream is class of IO Package
			Properties properties = new Properties();    //TODO Properties is class from util package
			try {
				properties.load(fis);   //TODO this will throw IO Exception
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sValue = properties.getProperty(skey);
		
		return sValue;
			
		}

}
