package find_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwi2kJSuicL2AhUZyGEKHafCBOsQPAgI");
		
		Thread.sleep(2000);
		
		List<WebElement> listof = driver.findElements(By.tagName("a"));
		
		System.out.println("list of links in page "+listof.size());
		
		for(WebElement w: listof)
		{
			System.out.println(w.getText());
		}
		
		
		
		
		
	}

}
