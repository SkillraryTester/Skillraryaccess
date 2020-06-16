package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.PropertyFile;
import genericlib.Utilites;
import pages.SigninPage;

public class ValidSignin extends BaseTest{
	@Test
	public void sigin() throws InterruptedException
	{
		PropertyFile p=new PropertyFile();
		Utilites u=new Utilites();
		Thread.sleep(3000);
		SigninPage s=new SigninPage(driver);
		Thread.sleep(3000);
		s.signindetails(p.getproperty("username"),p.getproperty("pass"));
	}

}
