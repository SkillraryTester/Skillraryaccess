package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
	
	@FindBy(name="email")
	private WebElement emailtb;
	
	@FindBy(name="pass")
	private WebElement passwordtb;
	
	@FindBy(id="loginbutton")
	private WebElement loginbtn;
	
	public FacebookPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginwithfacebook(String fbus,String fbpwd)
	{
		
		emailtb.sendKeys(fbus);
		passwordtb.sendKeys(fbpwd);
		loginbtn.click();
		
	}

}
