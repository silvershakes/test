package Kiteappusingpomandtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;

public class Kitehomepage 
{
//1.locate variables
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogOut;
	
	//2. use constructor
	
	public Kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	
	public String getActualUserId()
	{
		String Actualuserid = UserId.getText();
		return Actualuserid; 
		
	}
	
	public void ClickOnlogoutButton() throws InterruptedException
	{
		UserId.click();
		Thread.sleep(5000);
		
		LogOut.click();
	}
}
