package genericlib;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo extends BaseTest{
	
public  String getphoto(String photospath,String name ,WebDriver driver)
	{
		
		
		Date d=new Date();
		
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);	
		String destpath = photospath+d.toString().replace(":", "").replace(" ", "")+name+"png";
		File dest=new File(destpath);
		try {
		FileUtils.copyFile(src, dest);
		}
		catch(Exception e)
		{
			System.out.println("photo not taken");
		}
		return dest.getPath();
		
	}

}
