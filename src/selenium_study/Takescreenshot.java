package selenium_study;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshot {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File sr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destu = new File("C:\\\\Users\\\\pravi\\\\Desktop\\\\velocity\\\\Practise screenshot\\\\1.png");
		
		org.openqa.selenium.io.FileHandler.copy(sr, destu);

	}

}
