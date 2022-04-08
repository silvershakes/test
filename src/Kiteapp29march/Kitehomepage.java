package Kiteapp29march;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehomepage
{
	//1.locate variable// //a[@target='_self']
		@FindBy(xpath = "//span[@class='user-id']") private WebElement userid;
		@FindBy(xpath = "//a[@target='_self']") private WebElement logoutbutton;
		@FindBy(xpath = "//span[contains(text(),'Password should be minimum ')]") private WebElement passerror;
		@FindBy(xpath = "//span[contains(text(),'User ID should be minimum ')]") private WebElement useriderror;
		
	//2.constructor use 
		
		public Kitehomepage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	//3.methods
		
		public String getactualuserid()
		{
			String actualuserid = userid.getText();
			return actualuserid;
		}
		
		public void logout() throws InterruptedException
		{
			userid.click();
			Thread.sleep(3000);
			
			logoutbutton.click();
		}
		
		
		
		
}
