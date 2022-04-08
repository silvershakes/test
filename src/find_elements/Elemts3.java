package find_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elemts3 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> listofoption = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement w : listofoption)
		{
			w.click();
			
		}
		
		Thread.sleep(3000);
		
		
		for(WebElement w : listofoption)
		{
			w.click();
			
		}
		
	}

}
