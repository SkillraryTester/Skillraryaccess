package pages;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
public WebDriver driver;
@FindBy(id="email")
private WebElement usernametb;

@FindBy(xpath="//a[.='Sign In']")
private WebElement sigininbtn;

@FindBy(name="password")
private WebElement passwordtb;

@FindBy(name="captcha_type")
private WebElement catchbutton;

@FindBy(name="captcha")
private WebElement capchtb;

@FindBy(xpath="//button[.=' Submit ']")
private WebElement sumbitbtn;

@FindBy(xpath="//span[.='login with facebook']")
private WebElement facebookbtn;

@FindBy(xpath="//span[.='login with twitter']")
private WebElement twitterbtn;

@FindBy(xpath="//span[.='login with google+ ']")
private WebElement googlebtn;

@FindBy(xpath="//a[.='Forgot Password']")
private WebElement forgotpasswordbtn;

@FindBy(xpath="(//button[@class='close'])[1]")
private WebElement closepopup;

public SigninPage(WebDriver driver)
{
PageFactory.initElements(driver,this);
this.driver=driver;
}

public void signindetails(String us,String pwd)
{
	closepopup.click();
	sigininbtn.click();
	usernametb.sendKeys(us);
	passwordtb.sendKeys(pwd);
	catchbutton.click();
	String p = JOptionPane.showInputDialog("Enter the valid captch");
	capchtb.sendKeys(p);
	sumbitbtn.click();
	
}

public FacebookPage facebookbutton()
{
	closepopup.click();
	sigininbtn.click();
	facebookbtn.click();
	return new FacebookPage(driver);

}
public TwitterPage twitterbutton()
{
	closepopup.click();
	sigininbtn.click();
	twitterbtn.click();
	return new TwitterPage(driver);

}

public GmailPage gmailbutton()
{
	closepopup.click();
	sigininbtn.click();
	googlebtn.click();
	return new GmailPage(driver);

}
public Forgotpassword forgotpassword()
{
	closepopup.click();
	sigininbtn.click();
	forgotpasswordbtn.click();
	return new Forgotpassword(driver);
	
}
}
