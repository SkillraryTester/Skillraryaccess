package scripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.PropertyFile;
import pages.SigninPage;
import pages.TwitterPage;

public class ValidTwitterLogin extends BaseTest {
@Test
public void loginwithtwitter() throws InterruptedException
{
	PropertyFile p=new PropertyFile();
	Thread.sleep(3000);
	SigninPage s=new SigninPage(driver);
	Thread.sleep(3000);
	TwitterPage t = s.twitterbutton();
	t.twitterlogin(p.getproperty("Twitterusername"),p.getproperty("Twitterpassword"));
}
}
