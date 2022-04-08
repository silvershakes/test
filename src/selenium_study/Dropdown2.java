package selenium_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiYlPr7lML2AhVQ7nMBHVg8AYkQPAgI");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Honda a");
		Thread.sleep(2000);
		
		List<WebElement> multiple = driver.findElements(By.xpath("//ul[1]//li[@role='presentation']"));
		Thread.sleep(2000);
		
		System.out.println(multiple.size());
		Thread.sleep(2000);
		
		for(WebElement w : multiple)
		{
			String actualresult=w.getText();
			
			String expectedresult="honda amaze";
			
			if(actualresult.equals(expectedresult) )
			{
				w.click();
				break;
				
			}
			
		}
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@data-hveid='CAIQAw']")).click();
	}

}
