package zerodhausingPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehomepage 
{
//1.locate variable// //a[@target='_self']
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userid;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutbutton;
	
	
//2.constructor use 
	
	public Kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//3.methods
	
	public void verifyuserid()
	{
		String actualresult = userid.getText();
		String expectedresult = "HD5857";
		
		if(actualresult.equals(expectedresult))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}
	}
	
	public void clickonlogoutbutton() throws InterruptedException
	{
		userid.click();
		Thread.sleep(1000);
		
		logoutbutton.click();
	}
	
	
	
}
