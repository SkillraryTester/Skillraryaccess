package genericlib;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilites  {
	static final int OUTPUT_STRING_LENGTH = 20;
	public Random ram;
	
	public String getNextRandomString(String strAllowedCharacters) {
	    
		Random r=new Random();
	    StringBuilder sbRandomString = new StringBuilder(OUTPUT_STRING_LENGTH);
	    
	    for(int i = 0 ; i < OUTPUT_STRING_LENGTH; i++){
	        
	        //get random integer between 0 and string length
	        int randomInt = r.nextInt(strAllowedCharacters.length());
	      
	        
	        //get char from randomInt index from string and append in StringBuilder
	        sbRandomString.append( strAllowedCharacters.charAt(randomInt) );
	    }
	    
	    return sbRandomString.toString();
	    
	}
	
	

	
	public  void dropdown(String value,WebElement ele)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(value);
	}
	
	
	public   void mousehover(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	
	public void doubleclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
		
	}
	
	public void rightclick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		
	}
	
	public  void draganddrop(WebDriver driver,WebElement source,WebElement target)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
		
		
	}
	
	public void waitforelemntvisible(WebDriver driver,WebElement ele)
	{
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void waitforelemntclickable(WebDriver driver,WebElement ele)
	{
		WebDriverWait w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public void waitforelemnttoload(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	
	public String randomdata()
	{
		Random ram=new Random();
		int ran = ram.nextInt(10000000);
		return "988"+ran;
	}
	
	public String randomdemail()
	{
		Random ram=new Random();
		int ran = ram.nextInt(10000000);
		return "988"+"@gmail.com"+ran;
	}
	
	
	
	public void switching(WebDriver driver) throws InterruptedException
	{
		Set<String> tt = driver.getWindowHandles();
		System.out.println(tt);
		for (String ele : tt) {
			driver.switchTo().window(ele);

		}
		for (int i =1; i <4; i++) {
			Thread.sleep(1000);	
		
//		taketestrbutton.click();
//		savebtn.click();
		}
		Alert aa = driver.switchTo().alert();
		aa.accept();
		
		for (int i =1; i <3; i++) {
			Thread.sleep(1000);	
//			taketestrbutton.click();
//			savebtn.click();
		}
		
		Alert a1= driver.switchTo().alert();
		a1.accept();
		
		Thread.sleep(3000);
		
		for (int i =1; i <3; i++) {
			Thread.sleep(1000);	
//			taketestrbutton.click();
//			savebtn.click();
		}
	}
	
	

}
