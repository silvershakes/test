package selenium_study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwi2kJSuicL2AhUZyGEKHafCBOsQPAgI");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Honda");

		
		//List<WebElement> multiple = driver.findElements(By.xpath("//ul[1]//li[@role='presentation']"));
		
		//System.out.println("all elements "+multiple.size());
		
		//for(WebElement w : multiple)
//		{
//			System.out.println(w.getText());
//		}
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("honda");
		Thread.sleep(1000);
		List<WebElement> alloptions = driver.findElements(By.xpath("//ul[1]//li[@role='presentation']"));
		
		System.out.println(alloptions.size());
		for(WebElement w:alloptions)//0,1,...7..8..10.

		{
			String actualResult = w.getText();
			
			String expectedResult="honda amaze";
			
			if(actualResult.equals(expectedResult))
			{
				w.click();
				break;
			}
			}
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Images")).click();
	}


		
		
		
		//ul[@class='erkvQe']
	

}
