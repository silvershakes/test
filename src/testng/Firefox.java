package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");

	}

}
