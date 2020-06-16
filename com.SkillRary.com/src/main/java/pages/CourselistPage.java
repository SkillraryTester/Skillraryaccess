package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourselistPage {
	public WebDriver driver;
    @FindBy(xpath="//a[.='courses']")
    private WebElement coursebtn;
           
    @FindBy(name="q")
    private WebElement searchtb;
    
    @FindBy(xpath="(//input[@type='submit'])")
    private WebElement searchbtn;
    
    public CourselistPage(WebDriver driver) {
    	PageFactory.initElements(driver,this); 
    	this.driver=driver;
    	
    }
    public  CourcePage course(String courcename)
    {
    	coursebtn.click();
    	searchtb.sendKeys(courcename);
    	searchbtn.click();
    	return new CourcePage(driver);
    }


}
