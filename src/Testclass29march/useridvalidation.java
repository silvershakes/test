package Testclass29march;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Baseclasses.Base;
import Kiteapp29march.Kitehomepage;
import Kiteapp29march.Kiteloginpage;
import Kiteapp29march.Kitepinpage;
import Utilityclass.Utility;

public class useridvalidation extends Base
{
	//WebDriver driver;
 Kiteloginpage login;
 Kitepinpage pin;
 Kitehomepage home;
 
	@BeforeClass
	public void launchingbrowser1()
	{
		launchingbrowser();
		
		login = new Kiteloginpage(driver);
		pin =new Kitepinpage(driver);
		home = new Kitehomepage(driver);
	}
	
	@BeforeMethod
	public void logintokite() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.enterusername(Utility.getdatafromexcelsheet(0, 0));
		login.enterpass(Utility.getdatafromexcelsheet(0, 1));
		login.clickoncontinuebutton();
	
		Thread.sleep(1000);
		
		pin.enterpin(Utility.getdatafromexcelsheet(0, 2));
		pin.continuebutoon();
	}
	
	@Test
  public void Validateuserid() throws EncryptedDocumentException, IOException 
	{
		int TCID=100;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String Actualuserid = home.getactualuserid();
		String expecteduserid = Utility.getdatafromexcelsheet(0, 0);
		
		Assert.assertEquals(Actualuserid, expecteduserid,"not maching");
		
		//Utility.takescreenshot(driver, TCID);
		
    }
	
  @AfterMethod
  public void gettinglogout() throws InterruptedException 
  {
	  home.logout();
  }
  @AfterClass
  public void closebrowser()
  {
	  closingbrowser();
  }
}
