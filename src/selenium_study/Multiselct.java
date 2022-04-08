package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselct {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		
		
		WebElement forday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Thread.sleep(1000);
		
		Select s = new Select(forday);
		Thread.sleep(1000);
		
		s.selectByValue("22");
		
		
		
		
		

	}

}
