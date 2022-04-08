package selenium_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsfordoubleclick {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement multi = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Thread.sleep(1000);
		
		Actions act= new Actions(driver);
		
		Thread.sleep(1000);
		
		act.doubleClick(multi).perform();
		
		
      Alert alt = driver.switchTo().alert();
      
      alt.accept();
      
      //right click me
      WebElement rightcl = driver.findElement(By.xpath("//span[text()='right click me']"));
      
      Actions act1 =new Actions(driver);
      
      act1.contextClick(rightcl).perform();
     
	}

}
