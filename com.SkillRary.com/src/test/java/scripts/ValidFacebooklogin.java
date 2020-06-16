package scripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.PropertyFile;
import genericlib.Utilites;
import pages.FacebookPage;
import pages.SigninPage;
import pages.TwitterPage;

public class ValidFacebooklogin extends BaseTest{

	@Test
	public void loginwithfacebook() throws InterruptedException
	{
		PropertyFile p=new PropertyFile();
		Utilites u=new Utilites();	
		Thread.sleep(3000);
		SigninPage s=new SigninPage(driver);
		Thread.sleep(3000);
		u.waitforelemnttoload(driver);
		s.facebookbutton();
		FacebookPage f=new FacebookPage(driver);
		f.loginwithfacebook(p.getproperty("Facebookusername"),p.getproperty("Facebookpassword"));
		
	
	
	}
	
}
