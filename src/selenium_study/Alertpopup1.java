package selenium_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup1 {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		alt.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		Thread.sleep(7000);
		
		alt.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmButton")).click();
		
		Thread.sleep(2000);
		
		alt.dismiss();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(2000);
		
		alt.sendKeys("pravin balgore");
		
		Thread.sleep(2000);
		
		alt.accept();
		
		
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
