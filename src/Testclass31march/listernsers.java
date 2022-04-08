package Testclass31march;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listerners.listerners23252.class)

public class listernsers {
  
	@Test
  
  public void e1() 
	{
		Reporter.log("12345",true);
  }
	
	@Test
	  
	  public void e2() 
		{
		Assert.fail();
			Reporter.log("sdfg",true);
	  }
	
	@Test//(dependsOnMethods = {"b"})
	  
	  public void e3() 
		{
			Reporter.log("xcvb",true);
	  }
	
}
