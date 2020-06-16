package scripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.PropertyFile;
import genericlib.Utilites;
import pages.FacebookPage;
import pages.GmailPage;
import pages.SigninPage;

public class ValidGmailLogin extends BaseTest {
	@Test
	public void loginwithgmail() throws InterruptedException
	{
		PropertyFile p=new PropertyFile();
		Utilites u=new Utilites();		
		Thread.sleep(3000);
		SigninPage s=new SigninPage(driver);
		Thread.sleep(3000);
		u.waitforelemnttoload(driver);
		GmailPage g = s.gmailbutton();
		g.loginWithGmail(p.getproperty("Gmailusername"),p.getproperty("Gmailpassword"));
	
	}

}
