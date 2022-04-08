package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframe-name");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframe-name");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		

	}

}
