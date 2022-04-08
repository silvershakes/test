package zerodhausing_pom_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/?next=%2Fdashboard#loggedout");
	
	Thread.sleep(1000);
		
	
	Kiteloginpage kl= new Kiteloginpage(driver);
	kl.sendusername();
	kl.sendpass();
	kl.continuebutton();
	
	Thread.sleep(1000);
	
	Kitepinpage kp = new Kitepinpage(driver);
	kp.sendpin();
	kp.continuebutton();
	
	Thread.sleep(1000);
	
	Kitehomepage kh =new Kitehomepage(driver);
	kh.verifysuerid();
	kh.clickonlogoutbutton();
	
	Thread.sleep(1000);
	
	driver.quit();
	
	
	
	

	}

}
