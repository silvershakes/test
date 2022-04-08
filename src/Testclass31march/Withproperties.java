package Testclass31march;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Kiteapp29march.Kitehomepage;
import Kiteapp29march.Kiteloginpage;
import Kiteapp29march.Kitepinpage;
import Utilityclasswithproperties31march.Utilityclasswithproperties;
import baseclasswithproperties31march.Baseclasswithproperties;

public class Withproperties extends Baseclasswithproperties{
 Kitehomepage home;
 Kiteloginpage login;
 Kitepinpage pin;
 
	@BeforeClass
	public void launnchingbrowsser()
	{
		launchingbrowser();
		
		home = new Kitehomepage(driver);
		login = new Kiteloginpage(driver);
		pin=new Kitepinpage(driver);
		
	}
	
	@BeforeMethod
	public void getlogin() throws IOException
	{
		login.enterusername(Utilityclasswithproperties.getdatafromproperties("UN"));
		login.enterpass(Utilityclasswithproperties.getdatafromproperties("PASS"));
		login.clickoncontinuebutton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.enterpin(Utilityclasswithproperties.getdatafromproperties("PIN"));
		pin.continuebutoon();
	}
	
	
	@Test
  public void Validateuseeeerid() throws IOException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		String Actualuser = home.getactualuserid();
		
		String Expecteduser = Utilityclasswithproperties.getdatafromproperties("UN");
		
		Assert.assertEquals(Actualuser, Expecteduser,"TC not matching");
		
		
    }
	
	@AfterMethod
	
	public void getttinglogout() throws InterruptedException
	{
		home.logout();
	}
	
	@AfterClass
	
	public void closingbrow()
	{
		closingbrowser();
	}
}
