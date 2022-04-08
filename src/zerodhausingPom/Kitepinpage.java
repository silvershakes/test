package zerodhausingPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitepinpage
{
	
	//1.variable location
	
	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement pincontinue;
	
	//2.constructor use
	
	public Kitepinpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public void enterpin()
	{
		pin.sendKeys("969696");
	}
	
	public void continuebutoon()
	{
		pincontinue.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
