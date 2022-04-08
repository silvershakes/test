package selenium_study;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(200);
	    
//	   WebElement Text = driver.findElement(By.xpath("//div[text()='Recent logins']"));
//	   
//	    Text.getText();
//	    
	    
//	   WebElement Text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and ')]"));
//	    		
//	    Text.getText();
//	    
//	    System.out.println("text is "+ Text.getText());
	    
	    WebElement Text = driver.findElement(By.xpath("//span[text()=' Meta © 2022']"));
	    
	    String fortext = Text.getText();
	    
	    System.out.println("text is "+fortext);
	}

}
