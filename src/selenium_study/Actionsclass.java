package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
	    driver.manage().window().maximize();
	    
	    WebElement amazon = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
	    
	    Thread.sleep(1000);
	    
	    Actions act = new Actions(driver);
	    
	    Thread.sleep(1000);
	    
	    
	    act.click(amazon).perform();
	    
	    
	    WebElement cart = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
	    
	    act.click(cart).perform();
	    
	    

	}

}
