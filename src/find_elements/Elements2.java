package find_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> listoflinks = driver.findElements(By.tagName("a"));
		
		System.out.println("list of links in page "+listoflinks.size());
		
		for(WebElement w: listoflinks)
		{
			System.out.println(w.getText());
		}
		
		
		
		
		
		
		
	}

}
