package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementsforfb {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
	
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/login");
	    
	    Thread.sleep(2000);
	    
	    driver.manage().window().maximize();
	   
	    Thread.sleep(2000);
	    
	    //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pravinbalgore2211@gmail.com");
	    
         WebElement UserName = driver.findElement(By.id("email"));
         
         UserName.sendKeys("123456");
         
         Thread.sleep(2000);
         
         UserName.clear();
         
         Thread.sleep(2000);
         
         UserName.sendKeys("chjbdhc");
         
         Thread.sleep(2000);

         
        WebElement Password = driver.findElement(By.id("pass"));
         
        Password.click();
        
        Password.sendKeys("46789");
        
        Thread.sleep(2000);

       Password.clear();
       
       Password.sendKeys("ckscyugsics");
       
       driver.findElement(By.name("login"));
       
       Thread.sleep(3000);
       
       driver.findElement(By.linkText("Forgotten account?")).click();
         
         
         
	}

}
