package wait;

import java.beans.Visibility;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explisitwait {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		WebElement signup = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		
		signup.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		WebElement mono = driver.findElement(By.id("mobileNumber"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		mono.sendKeys("9604218810");
		
		WebElement otpbu = driver.findElement(By.xpath("//button[@type='submit']"));
        
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(1000));
		
	    w.until(ExpectedConditions.visibilityOf(otpbu));
	    
	    otpbu.click();
		
		
		
		
		
		
		
		
	}

}
