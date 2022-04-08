package Testclass29march;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.checkerframework.checker.units.qual.s;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Baseclasses.Base;
import Kiteapp29march.Kitehomepage;
import Kiteapp29march.Kiteloginpage;
import Kiteapp29march.Kitepinpage;
import Utilityclass.Utility;

public class foruseriderror extends Base{
 Kitehomepage home;
 Kitepinpage pin;
 Kiteloginpage login;
 
	@BeforeClass
	public void launchingbrowser2()
	{
	  launchingbrowser();
	  
	  home= new Kitehomepage(driver);
	  login = new Kiteloginpage(driver);
	  pin= new Kitepinpage( driver);
	  
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		login.enterpass(Utility.getdatafromexcelsheet(0, 1));
		login.clickoncontinuebutton();
		
	}

	@Test
  public void errorforuserid() throws EncryptedDocumentException, IOException 
	{   int TCID=1;
		String Actualerror = login.usererror();
		String Expectederror = Utility.getdatafromexcelsheet(0, 3);
		SoftAssert sa = new SoftAssert();
		 
		sa.assertEquals(Actualerror, Expectederror,"not matching");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		Utility.takescreenshot(driver, TCID);
    }
	@AfterClass
	public void closingbrowser2()
	{
		closingbrowser();
	}
}
