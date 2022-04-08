package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forzerodha_withDDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		 FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");
			
			Sheet ref = WorkbookFactory.create(myfile).getSheet("sheet3"); 
			
			 String username = ref.getRow(0).getCell(0).getStringCellValue();
			 String password = ref.getRow(0).getCell(1).getStringCellValue();
			 String pinn = ref.getRow(0).getCell(2).getStringCellValue();
			
			
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				//opened login page
				driver.get("https://kite.zerodha.com/");
				
				Thread.sleep(1000);
				
				WebElement userid = driver.findElement(By.xpath("//input[@type='text']"));
				
				WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
				
				//entered username 
				
				userid.sendKeys(username);
				
				//entered pass
				
				pass.sendKeys(password);
				
				//clicked on continue 
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				Thread.sleep(1000);
				
				//entered pin
				
				WebElement pin = driver.findElement(By.xpath("//input[@type='password']"));
				
				pin.sendKeys(pinn);
				
				//click on continue
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				//login complete
				
				Thread.sleep(1000);
				
				WebElement id = driver.findElement(By.xpath("//span[@class='user-id']"));
				
				//matching user id 
				
				String actualresult = id.getText();
				
				String expectedresult = username;
				
				if(actualresult.equals(expectedresult))
				{
					System.out.println("login sucessful and id matched sucessfully");
					
				}
				else
				{
					System.out.println("id matching failed");
				}
				
				driver.findElement(By.xpath("//span[@class='user-id']")).click();
				
				//logout complete
				
				driver.findElement(By.xpath("//a[@target='_self']")).click();
				
				//colsed all pages oped by slenium
				
				driver.quit();


	}

}
