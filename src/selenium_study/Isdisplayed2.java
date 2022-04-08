package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Isdisplayed2 {

	public static void main(String[] args) throws InterruptedException
	{
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("facebook login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h3[text()='Facebook - Log In or Sign Up']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("angel");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("lastname")).sendKeys("priya");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("reg_email__")).sendKeys("9874563215");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("pravin");
		
		Thread.sleep(3000);
		
		//1.locate element
		
		WebElement multiple = driver.findElement(By.name("birthday_day"));
		
	    Select s = new Select(multiple);
	    
	    s.selectByValue("22");
	    
	    Thread.sleep(3000);
		
	    WebElement multiple1 = driver.findElement(By.name("birthday_month"));
	    
	    Thread.sleep(3000);
		
	    Select s1 = new Select(multiple1);
	    
	    s1.selectByVisibleText("Nov");
	    
	    
	    WebElement multiple2 = driver.findElement(By.name("birthday_year"));
	    
	    Thread.sleep(3000);
		
	    Select s2 = new Select(multiple2);
	    
	    s2.selectByValue("1997");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@value='1']")).click();
	    
	    Thread.sleep(1000);
	    
        driver.findElement(By.xpath("//input[@value='2']")).click();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.name("websubmit")).click();
	    
	    System.out.println("facebook sign up complete");
	   
	    Thread.sleep(1000);
	    
	   
	    
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
