package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Includeexclude 
{
  @Test(groups="regression")
 public void test1()
  {
	  Reporter.log("cgvsdcjs",true);
  }
  
  @Test(groups="sanity")
  public void test2()
   {
 	  Reporter.log("cgvsdcjs",true);
   }
  
  @Test(groups="regression")
  public void test3()
   {
 	  Reporter.log("cgvsdcjs",true);
   }
  
  @Test(groups="sanity")
  public void test4()
   {
 	  Reporter.log("cgvsdcjs",true);
   }
  
  @Test(groups="regression")
  public void test5()
   {
 	  Reporter.log("cgvsdcjs",true);
   }
}
