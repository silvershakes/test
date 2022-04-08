package selenium_study;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpage {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
	    Thread.sleep(1000);
	    

	    
	    WebElement forscroll = driver.findElement(By.xpath("//div[text()='Get to Know Us']"));

	    Thread.sleep(1000);
	    
	    
//	    JavascriptExecutor js = (JavascriptExecutor)driver;
//	    
//	    js.executeScript("window.scrollBy(0,10000)");
//	    
//	    JavascriptExecutor js = (JavascriptExecutor)driver;
//	    
//	    js.executeScript("arguments[0].scrollIntoView();",forscroll);
//	    
//	    
//	   forscroll.click();
//	   
//	   driver.quit();
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    
	   js.executeScript("window.scrollBy(0,1000)");
	    
	}

}
