package pages;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	@FindBy(xpath="//a[.='Sign Up']")
	private WebElement signupbtn;
	
	@FindBy(name="first_name")
	private WebElement firstnametb;

	
	@FindBy(name="last_name")
	private WebElement lastnametb;
	
	@FindBy(name="email")
	private WebElement emailtb;
	
	@FindBy(name="phone")
	private WebElement phonenumbertb;
	
	@FindBy(id="password")
	private WebElement passwordtb;
	
	@FindBy(name="password_confirmation")
	private WebElement passwordconfirmationtb;
	
	@FindBy(name="captcha_type")
	private WebElement captch;
	
	@FindBy(xpath="//button[.='Sign Up ']")
	private WebElement signupbutton;
	
	@FindBy(name="recaptcha_response")
	private WebElement repatch;
	
	public SignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void siginupcredentials(String firstname,String lastname,String emailaddress,String phonenumb,String password ,String passcon)
	{
		signupbtn.click();
		firstnametb.sendKeys(firstname);
		lastnametb.sendKeys(lastname);
		emailtb.sendKeys(emailaddress);
		phonenumbertb.sendKeys(phonenumb);
		passwordtb.sendKeys(password);
		passwordconfirmationtb.sendKeys(passcon);
		captch.click();
		String j = JOptionPane.showInputDialog("enter the valid captch");
		repatch.sendKeys(j);
		signupbutton.click();
		
		 }

	
	

}
