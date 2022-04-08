package Kiteapp29march;

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
		@FindBy(xpath = "//span[contains(text(),'Password should be minimum ')]") private WebElement passerror;
		@FindBy(xpath = "//span[contains(text(),'User ID should be minimum ')]") private WebElement useriderror;
		
		//2.construtor
		
		public Kiteloginpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3. methods
		
		public void enterusername(String UID)
		{
			userid.sendKeys(UID);
			
		}
		
		public void enterpass(String PASS)
		{
			password.sendKeys(PASS);
		}
		
		public void clickoncontinuebutton()
		{
			continueb.click();
		}
		
		public String passerrormsg()
		{
			String perrormsg = passerror.getText();
			return perrormsg;
		}
		
		public String usererror()
		{
			String uerrormsg = useriderror.getText();
			return uerrormsg;
		}
}
