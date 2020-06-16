package scripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.PropertyFile;
import genericlib.Utilites;
import pages.SignupPage;

public class Validsignup extends BaseTest {
@Test
public void signupdetails() throws InterruptedException
{
	Utilites u=new Utilites();
	PropertyFile p=new PropertyFile();
	Thread.sleep(3000);
	SignupPage s=new SignupPage(driver);
	Thread.sleep(3000);
	u.waitforelemnttoload(driver);
	s.siginupcredentials(u.getNextRandomString(strAllowedCharacters),u.getNextRandomString(strAllowedCharacters),u.randomdemail(),u.randomdata(),p.getproperty("password"),p.getproperty("password"));
	
}
}
