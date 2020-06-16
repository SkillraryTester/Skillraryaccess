package scripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.PropertyFile;
import genericlib.Utilites;
import pages.CourcePage;
import pages.CourselistPage;
import pages.SigninPage;

public class Serachingforcourse extends BaseTest {
	@Test
	public void serachingcource() throws InterruptedException
	{
	PropertyFile p=new PropertyFile();
	Utilites u=new Utilites();
	u.waitforelemnttoload(driver);
	SigninPage s=new SigninPage(driver);
	s.signindetails(p.getproperty("username"),p.getproperty("pass"));
	CourselistPage c=new CourselistPage(driver);
	CourcePage l = c.course(p.getproperty("coursename"));
	u.mousehover(driver,l.getCource());
	//l.addingwishlist();
	}
}
