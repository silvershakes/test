package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ps2 {
  @Test
  public void test2() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.youtube.com/watch?v=mXg0b5xRfYg");
	    
	    driver.manage().window().maximize();
	   
	    Thread.sleep(2000);
  }
}
