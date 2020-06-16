package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpassword {
	@FindBy(xpath="//input[@name='credit_email']")
	private WebElement forgotemailaddress;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement sumbitforgotbutton;

	@FindBy(xpath="//a[.='Return to login page']")
	private WebElement returnloginpagelink;

	public Forgotpassword(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void forgotdetaails(String forgotpassword)
	{
		forgotemailaddress.sendKeys(forgotpassword);
		sumbitforgotbutton.click();
		//returnloginpagelink.click();
	}

}
