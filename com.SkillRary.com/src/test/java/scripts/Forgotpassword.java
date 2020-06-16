package scripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.PropertyFile;
import genericlib.Utilites;
import pages.GmailPage;
import pages.SigninPage;

public class Forgotpassword extends BaseTest {
@Test
public void forgotpassword() throws InterruptedException
{
	PropertyFile p=new PropertyFile();
	Utilites u=new Utilites();
	u.waitforelemnttoload(driver);
	Thread.sleep(3000);
	SigninPage s=new SigninPage(driver);
	Thread.sleep(3000);
	pages.Forgotpassword f = s.forgotpassword();
	f.forgotdetaails(p.getproperty("forgotemail"));
	driver.get("https://accounts.google.com/");
	GmailPage g=new GmailPage(driver);
	g.loginWithGmailForgotpassword(p.getproperty("forgotemail"), p.getproperty("forgotpassword"));
}
}
