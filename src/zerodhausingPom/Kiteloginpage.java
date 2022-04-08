package zerodhausingPom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage 
{
      //1.veriable location
	   
	@FindBy(id = "userid") private WebElement userid;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueb;
	
	//2.construtor
	
	public Kiteloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	//3.methods
	
	public void sendusername()
	{
		userid.sendKeys("HD5857");
	}
	
	public void sendpassword()
	{
		password.sendKeys("Ajinkya@123");
	}
	
	public void clickoncontinuebutton()
	{
		continueb.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
