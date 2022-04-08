package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabled {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.discoveryplus.in/");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    
	   driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	   
	   Thread.sleep(3000);
	    
	  WebElement mono = driver.findElement(By.id("mobileNumber"));
	  
	  Thread.sleep(3000);
	  
	    mono.sendKeys("9604218810");
	    
	    WebElement forotp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	    
	    boolean result = forotp.isEnabled();
	    
	    if(result)
	    {
	    	System.out.println("button is enabled");
	    }
	    else
	    {
	    	System.out.println("button is not enabled");
	    	
	    	mono.sendKeys("1234567896");
	    	
	    	boolean result2 = forotp.isEnabled();
	    	
	    System.out.println("updated reult is otp button enabled "+result2);	
	    }  
	}

}
