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

public class forerroruser extends Baseclasswithproperties
{
	int TCID=10;
	Kitehomepage home;
	Kiteloginpage login;
	Kitepinpage pin;
  @BeforeClass
  public void launchingbrowser3()
  {
	  launchingbrowser();
	  
	  home = new Kitehomepage(driver);
	  login = new Kiteloginpage(driver);
	  pin = new Kitepinpage(driver);
  }
  
  @BeforeMethod
  public void gettinglogininfo() throws IOException
  {
	  
	  login.enterpass(Utilityclasswithproperties.getdatafromproperties("PASS"));
	  login.clickoncontinuebutton();
	  
	  
  }

	@Test
  public void validateusereroor() throws IOException 
	{
		String Expectedre = Utilityclasswithproperties.getdatafromproperties("ERRORMSGFORUSER");
		String Actualerror = login.usererror();
		
		Assert.assertEquals(Expectedre, Actualerror,"not matching");
  }
	
	@AfterClass
	public void clsinggggbrow() throws IOException
	{
		
		Utilityclasswithproperties.screenshot(driver, TCID);
		
		closingbrowser();
	}
}
