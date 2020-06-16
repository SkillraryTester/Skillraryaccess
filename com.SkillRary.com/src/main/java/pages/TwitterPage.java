package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage {
	@FindBy(id="username_or_email")
	private WebElement emailtb;
	
	@FindBy(id="password")
	private WebElement passwordtb;
	
	@FindBy(id="allow")
	private WebElement loginbtn;
	
	public TwitterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void twitterlogin(String twus,String twpwd)
	{
		emailtb.sendKeys(twus);
		passwordtb.sendKeys(twpwd);
		loginbtn.click();

}
}