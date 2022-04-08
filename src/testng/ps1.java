package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ps1 {
  @Test
  public void test1() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/login");
	    
	    driver.manage().window().maximize();
	   
	    Thread.sleep(2000);
	   
  }
}
