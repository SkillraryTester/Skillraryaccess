package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MycourcePage {
	public WebDriver driver;
	@FindBy(xpath="//a[.='my course']")
	private WebElement mycoursebtn;
	
	@FindBy(xpath="(//a[.='Assessment'])[2]")
	private WebElement assessmenttab;
	
	@FindBy(xpath="//a[.=' Private ']")
	private WebElement privatetab;
	
	@FindBy(xpath="(//a[.=' Automation testing'])[2]")
    private WebElement coursebtn;
	
	@FindBy(xpath="//a[.=' Retake    assessement ']")
	private WebElement retakeassessment;
	
	@FindBy(xpath="//a[.=' resume    assessement ']")
	private WebElement resumeassessment;
	

	@FindBy(xpath="//a[.=' Start Assessment ']")
	private WebElement startassessment;
	
	@FindBy(xpath="(//li[@class='qanswer'])[1]")
	private WebElement firstans;
	
	@FindBy(xpath="(//button[.=' Submit '])[1]")
	private WebElement sumbitbtn;

     @FindBy(xpath="(//button[.=' Next Question '])[1]")
     private WebElement nextquestion;
     
     @FindBy(xpath="//a[.=' restart    assessement ']")
     private WebElement restart;
	
	public MycourcePage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	this.driver=driver;
	}
	public void privateassessment()
	{
		mycoursebtn.click();
		assessmenttab.click();
		
	}
	public void clickprivate()
	{
		assessmenttab.click();
		privatetab.click();
		coursebtn.click();
		//retakeassessment.click();
		
	}
	
	public void start()
	{
		startassessment.click();
	}
	public boolean ansfirst() 
	{
		firstans.click();
		return false;
		
		
	}
	
	public void restartbtn()
	{
		restart.click();
	}
	public void ifmethod()
	{
		retakeassessment.click();
	
}
	public void elsemethod() {
		resumeassessment.click();
		
	}
	public void nextq()
	{
		nextquestion.click();
	}
	public boolean sumbit()
	{
		sumbitbtn.click();
		return false;
	}
}