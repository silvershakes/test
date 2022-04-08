package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.resources.Resource;

public class Annotations {
  
	
	@BeforeClass
	public void tggt()
	{
		Reporter.log("bclass",true);
	}
	
	@AfterClass
	public void slxc()
	{
		Reporter.log("aclass",true);
	}
	@BeforeMethod
	
	public void calss()
	{
		Reporter.log("before",true);
	}
	
	
	@AfterMethod
	public void class23()
	{
		Reporter.log("after",true);
	}
	
	
	@Test
  public void test1()
	{
		Reporter.log("12345",true);
		
    }
	
	@Test
	  public void test2()
		{
			Reporter.log("9875",true);
			
	    }
	
	@Test
	  public void test3()
		{
			Reporter.log("6532",true);
			
	    }
}
