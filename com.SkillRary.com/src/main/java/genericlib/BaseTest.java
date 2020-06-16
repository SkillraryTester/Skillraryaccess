package genericlib;


import java.io.File;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

public class BaseTest implements AutoConstant{
public WebDriver driver;
public ExtentReports report;

@BeforeSuite
public void configBS()
{
	String currDate = new Date().toString().replace(":","_").replace(" ", "_");
	report=new ExtentReports("./advanceReport"+ currDate+".html" );
	report.loadConfig(new File("./extent-config.xml"));
}
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(Key,Value);
		driver=new ChromeDriver();
		PropertyFile p=new PropertyFile();
		driver.get(p.getproperty("url"));
		driver.manage().window().maximize();
	}
		
	@AfterMethod
	public void closeapp(ITestResult r)
	{
		int status = r.getStatus();
		String name = r.getMethod().getMethodName();
		if(status==2)
		{
			new Photo().getphoto(photopath,name,driver);
		}
		driver.close();
	}
	
	@AfterSuite
	public void configAS()
	{
		report.flush();
		report.close();
		
	}

}
