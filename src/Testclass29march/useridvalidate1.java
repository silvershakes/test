package Testclass29march;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
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

public class useridvalidate1 extends Base {
  Kiteloginpage login;
  Kitepinpage pin;
  Kitehomepage home;
  
	@BeforeClass
	public void launchbrowser()
	{
		launchingbrowser();
		
		login =new Kiteloginpage(driver);
		pin = new Kitepinpage(driver);
		home = new Kitehomepage(driver);
		
		
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		login.enterusername(Utility.getdatafromexcelsheet(0, 0));
		login.enterpass(Utility.getdatafromexcelsheet(0, 1));
		login.clickoncontinuebutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.enterpin(Utility.getdatafromexcelsheet(0, 2));
		pin.continuebutoon();
	}
	
	@Test
  public void validateuserid() throws EncryptedDocumentException, IOException 
	{
		int TCID=100;
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    String Actualuserid = home.getactualuserid();	
	    String Expecteduserid = Utility.getdatafromexcelsheet(0, 0);
	    
	    Assert.assertEquals(Actualuserid, Expecteduserid,"not matching");
//	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//	    Utility.takescreenshot(driver, TCID);
    }
	@AfterMethod
	public void logout() throws InterruptedException
	{
		home.logout();
	}
	
	@AfterClass
	public void closignbrowser()
	{
		closingbrowser();
	}
}
