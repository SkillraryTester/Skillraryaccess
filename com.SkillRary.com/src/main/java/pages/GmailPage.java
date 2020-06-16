package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPage {
	@FindBy(xpath = "(//div[.='Use another account'])[3]")
	private WebElement anotheraccount;

	@FindBy(id = "identifierId")
	private WebElement emailtb;

	@FindBy(xpath = "(//span[.='Next'])[1]")
	private WebElement nextbtn;

	@FindBy(name = "password")
	private WebElement passwordtb;

	@FindBy(xpath = "(//span[.='Next'])[1]")
	private WebElement nextbtn2;

	public GmailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loginWithGmail(String gmailus, String gmailpwd) {
		emailtb.sendKeys(gmailus);
		nextbtn.click();
	}
	
	public void loginWithGmailForgotpassword(String us,String pwd)
	{
		emailtb.sendKeys(us);
		nextbtn.click();
		passwordtb.sendKeys(pwd);
		nextbtn2.click();
		
	}

}
