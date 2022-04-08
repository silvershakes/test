package Kiteappusingpomandtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage 
{
	//1.locate variable
	
	@FindBy(id = "userid") private WebElement Userid;
	@FindBy(xpath = "//input[@type='password']") private WebElement Pass;
	@FindBy(xpath = "//button[@type='submit']") private WebElement ContinueButton;
	
	//2.use constructor
	
	public Kiteloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public void sendusername(String UID)
	{
		Userid.sendKeys(UID);
	}

	public void sendPassword(String PASS)
	{
		Pass.sendKeys(PASS);
	}
	
	public void clickOnContinueButton()
	{
		ContinueButton.click();
	}
}
