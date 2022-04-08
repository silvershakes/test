package zerodhausingPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard#loggedout");
		
		Thread.sleep(1000);
		
		Kiteloginpage kl = new Kiteloginpage(driver);
		kl.sendusername();
		kl.sendpassword();
		kl.clickoncontinuebutton();
		
		Thread.sleep(1000);
		
		Kitepinpage kp =new Kitepinpage(driver);
		kp.enterpin();
		kp.continuebutoon();
		
		Thread.sleep(1000);
		
		Kitehomepage kh =new Kitehomepage(driver);
		kh.verifyuserid();
		kh.clickonlogoutbutton();
		
		driver.quit();
		
				
		
		
		
		
		
		
		
		
		
		
		

	}

}
