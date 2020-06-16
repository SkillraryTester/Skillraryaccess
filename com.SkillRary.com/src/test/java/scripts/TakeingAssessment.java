package scripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.PropertyFile;
import genericlib.Utilites;
import pages.CourcePage;
import pages.MycourcePage;
import pages.SigninPage;

public class TakeingAssessment extends BaseTest {
	@Test
	public void privateAssessment() throws InterruptedException
	{
		PropertyFile p=new PropertyFile();
		Utilites u=new Utilites();
		u.waitforelemnttoload(driver);
		SigninPage s=new SigninPage(driver);
		s.signindetails(p.getproperty("username"),p.getproperty("pass"));
		MycourcePage m=new MycourcePage(driver);
		m.clickprivate();
		m.elsemethod();
		Thread.sleep(3000);
		//m.ifmethod();
		//m.restartbtn();
		Thread.sleep(20000);
//		if(m.ifmethod())
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			m.elsemethod();
//		}
		m.start();
		m.ansfirst();
		
		if(m.sumbit())
		{
			
		}
		else
		{
		m.nextq();
		}
		m.ansfirst();
		if(m.sumbit())
		{
			
		}
		else
		{
		m.nextq();
		}
		m.sumbit();
		m.nextq();
		Thread.sleep(2000);
		m.ansfirst();
		Thread.sleep(2000);
		m.sumbit();
		Thread.sleep(2000);
		m.nextq();
		
	}

}
