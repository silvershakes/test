package zerodhausing_pom_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehomepage 
{
//1.locate variables
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userid;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutbutton;
	
//2.constructor use
	
	public Kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//3.methods
	
	public void verifysuerid()
	{
		String actualresult = userid.getText();
		String expectedresult = "HD5857";
		
		if(actualresult.equals(expectedresult))
		{
			System.out.println("userid is matched test case passed");
		}
		else
		{
			System.out.println("userid is not matched test case failed");
		}
		
		
	}
	
	
	public void clickonlogoutbutton() throws InterruptedException
	{
		userid.click();
		
		Thread.sleep(100);
		
		logoutbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
