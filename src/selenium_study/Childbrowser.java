package selenium_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
//		String multiple = driver.getWindowHandle();
//		
//        System.out.println("for multiple ids "+multiple);
        
        driver.findElement(By.name("NewWindow")).click();
        
        Set<String> multiple = driver.getWindowHandles();
        
        System.out.println("multiple ids is "+multiple);
        
        Iterator<String> it= multiple.iterator();
        
        String mainpage = it.next();
        
        String childpage = it.next();
        
        
       //swith focus to child page
        
        driver.switchTo().window(childpage);
        
        Thread.sleep(2000);
        
        driver.manage().window().maximize();
        
        
       driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("pravin balgore");
       
       driver.switchTo().window(mainpage);
       
       driver.quit();
       
        
        
        
        
	}

}
