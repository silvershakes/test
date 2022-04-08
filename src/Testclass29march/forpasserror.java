package Testclass29march;

import java.io.IOException;

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

public class forpasserror extends Base {
  Kitehomepage home;
  Kiteloginpage login;
  Kitepinpage pin;
  
	@BeforeClass
	public void launchingbrowser1()
	{
		launchingbrowser();
		
		home= new Kitehomepage(driver);
		login= new Kiteloginpage(driver);
		pin=new Kitepinpage( driver);
		
	}
	
	@BeforeMethod
	public void login1() throws EncryptedDocumentException, IOException
	{
		login.enterusername(Utility.getdatafromexcelsheet(0, 0));
		login.clickoncontinuebutton();
	}
	
	@Test
  public void errorforpass() throws EncryptedDocumentException, IOException
	 {
		 String Actualerror = login.passerrormsg();
		 String Expectederror = Utility.getdatafromexcelsheet(0, 4);
		 
		 Assert.assertEquals(Actualerror, Expectederror,"not showing error msg");
     }
	
	
	
	@AfterClass
	
	public void closeb() 
	{
		closingbrowser();
	}
}
