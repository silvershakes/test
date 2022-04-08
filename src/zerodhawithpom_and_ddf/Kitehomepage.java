package zerodhawithpom_and_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehomepage
{
 //1.locate variables
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement id;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	
  //2.useconstructor
	
	public Kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
   //3.methods
	
	public void verifyuserid(String USERID)
	{
		String actualresult = id.getText();
		
		String expectedresult = USERID;
	
	
	  if(actualresult.equals(expectedresult))
	  {
		  System.out.println("userid matched test case passsed");
	  }
	  else
	  {
		  System.out.println("userid is not matched test case failed");
	  }
	}
	
	public void clickonlogoutbutton() throws InterruptedException
	{
		id.click();
		Thread.sleep(100);
		
		logout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
