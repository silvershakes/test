package testng;

import org.testng.annotations.Test;

public class Mytest {
  @Test(groups="regression")
  public void Test1()
  {
	  System.out.println("hi welcome");
  }
  @Test(groups="sanity")
  public void Test2()
  {
	  System.out.println("hi welcome");
  }
  @Test(groups="regression")
  public void Test3()
  {
	  System.out.println("hi welcome");
  }
  @Test(groups="sanity")
  public void Test4()
  {
	  System.out.println("hi welcome");
  }
  @Test(groups="regression")
  public void Test5()
  {
	  System.out.println("hi welcome");
  }
  
}

