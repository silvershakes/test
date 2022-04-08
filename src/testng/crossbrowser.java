package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
    @Parameters("browser name")
	@Test
  public void crossbrowser(String browsername)  
    {   
    	WebDriver driver=null;
    	if(browsername.equals("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
    		
    		 driver = new ChromeDriver();
    	}
    	
    	else if(browsername.equals("firefox"))
    	{
    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\geckodriver.exe");
    		
    		 driver = new FirefoxDriver();
    	}
    	
    	driver.get("https://vctcpune.com/selenium/practice.html");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    	driver.quit();
    }
}
