package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Radio3']")).click();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Radio4']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value='option2']")).click();
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='checkBoxOption3']")).click();
		
		Thread.sleep(1000);

		
		

		
		
		
	
		
	}

}
