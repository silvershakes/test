package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    
	    WebElement o1 = driver.findElement(By.id("checkBoxOption1"));
	    
	 
	    
	    boolean result = o1.isSelected();
	    
	    if(result)
	    {
	    	System.out.println("option1 is selected");
	    }
	    else
	    {
	    	System.out.println("option 1 is not selected");
	    	o1.click();
	    	boolean result1 = o1.isSelected();
	    	
	    	System.out.println("updated status option 1 is selcted"+ result1);
	    	
      }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
