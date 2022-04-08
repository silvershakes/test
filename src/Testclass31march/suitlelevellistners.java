package Testclass31march;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class suitlelevellistners {
  @Test(dependsOnMethods = {"b"})
  public void a() 
  {
	  Reporter.log("12345",true);
  }
  
  @Test
  public void b() 
  {
	  
	  Assert.fail();
		Reporter.log("sdfg",true);
  }
  
  @Test
  public void c() 
  {
	  Reporter.log("xcvb",true);
  }
  
}
