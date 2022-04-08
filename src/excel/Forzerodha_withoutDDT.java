package excel;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forzerodha_withoutDDT {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//opened login page
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		
		WebElement userid = driver.findElement(By.xpath("//input[@type='text']"));
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		
		//entered username 
		
		userid.sendKeys("HD5857");
		
		//entered pass
		
		pass.sendKeys("Ajinkya@123");
		
		//clicked on continue 
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		//entered pin
		
		WebElement pin = driver.findElement(By.xpath("//input[@type='password']"));
		
		pin.sendKeys("969696");
		
		//click on continue
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//login complete
		
		Thread.sleep(1000);
		
		WebElement id = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		//matching user id 
		
		String actualresult = id.getText();
		
		String expectedresult = "HD5857";
		
		if(actualresult.equals(expectedresult))
		{
			System.out.println("login sucessful and id matched sucessfully");
			
		}
		else
		{
			System.out.println("id matching failed");
		}
		
		driver.findElement(By.xpath("//span[@class='user-id']")).click();
		
		//logout complete
		
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		//colsed all pages oped by slenium
		
		driver.quit();
		
		
	}

}
