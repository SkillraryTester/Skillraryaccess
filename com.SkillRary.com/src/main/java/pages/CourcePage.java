package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourcePage {
	public WebDriver driver;
	@FindBy(xpath="(//a[.=' Demo Internship On Automation '])[1]")
    private WebElement cource;
	 
	@FindBy(xpath="//a[.='courses']")
	 private WebElement coursebtn;
	
	@FindBy(xpath="(//li[@class='dropdown-submenu'])[1]")
	private WebElement aptitudecourse;
	
	@FindBy(xpath="//a[.='Verbal Aptitude']")
	private WebElement verbal;

	@FindBy(xpath="//a[.=' Cocubes Verbal Aptitude']")
	private WebElement verbalcource;
	
	public WebElement getAptitudecourse() {
		return aptitudecourse;
	}


	public WebElement getCource() {
		return cource;
	}
	
	@FindBy(xpath="(//i[@class='fa fa-heart-o'])[1]")
    private WebElement whishlist;

    
    public CourcePage(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    	this.driver=driver;
    }
    
    public void addingwishlist()
    {
    	whishlist.click();
    }
    
    public void courcebtn()
    
    {
    	coursebtn.click();
    }
    
    public void serachingcource()
    {
    	verbal.click();
    	verbalcource.click();
    	
    }

}
