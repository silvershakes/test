package introduction;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium_study.Takescreenshot;

public class Screnshot {

	public static void main(String[] args) throws IOException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File pr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(pr);
		
		File destination = new File("C:\\Users\\pravi\\Desktop\\velocity\\Practise screenshot\\myscreeenshot.png");
		
		org.openqa.selenium.io.FileHandler.copy(pr, destination);

	}

}
