package selenium_study;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forsize {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
//		Dimension d= new Dimension(100, 100);
//		
//		driver.manage().window().setSize(d);
		
//		Point p =new Point(100, 100);
//		
//		driver.manage().window().setPosition(p);
//		
		
		Dimension d =new Dimension(100, 100);
		
		driver.manage().window().setSize(d);
		
		Thread.sleep(1000);
		
		Point p = new Point(100, 100);
		
		driver.manage().window().setPosition(p);
		
		
		
		
	}

}
