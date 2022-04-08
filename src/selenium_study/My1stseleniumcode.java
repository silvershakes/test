package selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stseleniumcode {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//Thread.sleep(1000);
		
		//driver.get("https://www.flipkart.com/");
		
		//Thread.sleep(1000);
		
		//driver.get("https://www.youtube.com/");
		
		//Thread.sleep(1000);
		
		//driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		
		//driver.navigate().back();
		//driver.navigate().refresh();
		//driver.navigate().back();
		//driver.quit();
		
		System.out.println(driver.getTitle());
		
		String title= driver.getTitle();
		System.out.println("title is "+title);
		
		
		
		
		
		
		
		
		
		
		
	}

}
