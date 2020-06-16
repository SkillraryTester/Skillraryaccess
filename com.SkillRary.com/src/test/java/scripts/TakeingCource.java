package scripts;

import org.omg.CORBA.CODESET_INCOMPATIBLE;
import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.PropertyFile;
import genericlib.Utilites;
import pages.CourcePage;
import pages.CourselistPage;
import pages.SigninPage;
import pages.TakethiscourcePage;

public class TakeingCource extends BaseTest {
	@Test
	public void courcetaken() throws InterruptedException
	{
		PropertyFile p=new PropertyFile();
		Utilites u=new Utilites();
		u.waitforelemnttoload(driver);
		Thread.sleep(3000);
		SigninPage s=new SigninPage(driver);
		s.signindetails(p.getproperty("username"),p.getproperty("pass"));
		CourcePage l=new CourcePage(driver);
		l.courcebtn();
		u.mousehover(driver,l.getAptitudecourse());
		l.serachingcource();
		TakethiscourcePage t=new TakethiscourcePage(driver);
		t.pay();
}}
