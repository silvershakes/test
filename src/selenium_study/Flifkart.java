package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flifkart {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("pravinbalgore2211@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("2356141");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);


		driver.findElement(By.xpath("//img[@alt='Top Offers'] ")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt='Grocery'] ")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt='Mobiles'] ")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt='Fashion'] ")).click();
		
		
		

		
	}

}
