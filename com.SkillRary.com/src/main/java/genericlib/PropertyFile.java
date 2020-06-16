package genericlib;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile implements AutoConstant {
	
	public  String getproperty(String key)
	{
		Properties p=new Properties();
		try {
		 p.load(new FileInputStream(propertyFilepath));
		}
		catch(Exception e)
		{
			System.out.println("data not taken");
		}
		return p.getProperty(key);
	}
	
	

}
