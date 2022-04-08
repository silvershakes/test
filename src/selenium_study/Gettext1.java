package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext1 {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(200);
	    
	    WebElement text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
	    
	    String actualtext = text.getText();
	    
	    System.out.println("actualtext is "+actualtext);
	    
	    String expectedtext = "Welcome To Practice Page";
	    
	    if(actualtext.equals(expectedtext))
	    {
	    	System.out.println("text is matched test case passed");
	    }
	    
	    else
	    {
	    	System.out.println("text not matched text case fail");
	    }
	    
	    Thread.sleep(2000);
	    
	    driver.get("https://zerodha.com/");
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
	    
	    WebElement signup = driver.findElement(By.id("acop_link"));
	    
	    signup.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement text1 = driver.findElement(By.xpath("//h2[text()='Join 6+ million investors & traders']"));
	    
	   String Actualtext = text1.getText();
	    
	    String Expectedtext = "Join 6+ million investors & traders";
	    
	    if(Actualtext.endsWith(Expectedtext))
	    {
	    	System.out.println("text matches and test case passed");
	    }
	    
	    else
	    {
	    	System.out.println("text not matched test case failed");
	    }
	    
	    
	    
	    
	    
	}

}
