package selenium_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser1 {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("NewWindow")).click();
		
		Thread.sleep(2000);
		
		
		//create getwindowhandls , make them as a refrance variable
		//took iterator ceate object
		//then get next 
		//iterator means -1 condition
		//next means main page
		//next means child page
		
		Set<String> multiple = driver.getWindowHandles();
		
		Iterator<String> it = multiple.iterator();
		
		String formainpage = it.next();
		
		String forchildpage = it.next();
		
		driver.switchTo().window(forchildpage);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("pravin");
		
		driver.switchTo().window(formainpage);
		
		driver.findElement(By.name("NewWindow"));
		
		driver.manage().window().maximize();
		
		driver.quit();
		
		
		
		
		
		

	}

}
