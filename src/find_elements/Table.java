package find_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		//1.locate table
		//tr for table row 
		//td for table data
		//th for table header
		
		List<WebElement> multipleheaders = driver.findElements(By.xpath("//table[@id='product']//tr[1]//th"));
		
		System.out.println(multipleheaders.size());
		
		//2.locate table row
		
		List<WebElement> multiplerows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		System.out.println(multiplerows.size());
		
		//3.for printing row
		for(int i=1;i<=multipleheaders.size();i++)
		
		{
			String listofrow = driver.findElement(By.xpath("//table[@id='product']//tr[1]//th["+i+"]")).getText();
			
			System.out.println(listofrow+ " ");
		}
		
		//4.for printing coloum
		for(WebElement w : multiplerows)
		{
			System.out.println(w.getText()+ " ");
		}
		System.out.println();
		
	}

}
