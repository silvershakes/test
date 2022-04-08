package Testclass31march;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class listnersat_suitelevel {
  
	@Test
	  
	  public void e1() 
		{
			Reporter.log("12345",true);
	  }
	
	@Test
	  
	  public void e2() 
		{
		Assert.fail();
			Reporter.log("qwerty",true);
	  }
	
	@Test(dependsOnMethods = {"e1"})
	  
	  public void e3() 
		{
			Reporter.log("zxcvb",true);
	  }
	

}
