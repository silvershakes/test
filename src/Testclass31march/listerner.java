package Testclass31march;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class listerner {
  @Test(dependsOnMethods = {"b"})
  public void a() 
  {
	  Reporter.log("pravin",true);
  }
  
  @Test(dependsOnMethods = {"c"})
  public void b() 
  {
	  Reporter.log("krupa",true);
  }
  
  @Test(priority = -5)
  public void c() 
  {
	  Reporter.log("apoorva",true);
  }
  
  @Test(timeOut = 1000)
  public void d() 
  {
	  Reporter.log("deepashri",true);
  }
  
  @Test
  public void e() 
  {
	  Assert.fail();
	  Reporter.log("karan",true);
  }
  
  @Test(enabled = false)
  public void f() 
  {
	  Reporter.log("aditi",true);
  }
}
