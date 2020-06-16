package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakethiscourcePage {
	public WebDriver driver;
    @FindBy(xpath="(//button[@type='submit'])")
    private WebElement takecoursebtn;
    
    @FindBy(xpath="(//input[@class='btn btn-color events-submit'])")
    private  WebElement paybtn;
    
    
    
    public TakethiscourcePage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    	this.driver=driver;
    }
    
    public void pay()
    {
    	takecoursebtn.click();
    	paybtn.click();
    }


}
