package Kiteappusingpomandtestng;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitepinpage
{

	//1.locate variable
	
	@FindBy(xpath = "//input[@type='password']") private WebElement Pin;
	@FindBy(xpath ="//button[@type='submit']") private WebElement ContinueButtonPin;
	
	//2.use constructor
	
	public Kitepinpage(WebDriver driver)
	{
		PageFactory.initElements(driver ,this);
	}
	
	//3. methods
	
	public void sendpin(String PIN)
	{
		Pin.sendKeys(PIN);
	}
	
	public void clickOnContinueButtonPin()
	{
		ContinueButtonPin.click();
	}
}
