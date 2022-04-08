package zerodhawithpom_and_ddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testclass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		
		ChromeOptions op = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver(op);
		
		op.addArguments("incognito");
		
		driver.get("https://kite.zerodha.com/?next=%2Fdashboard#loggedout");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");

		Sheet refer = WorkbookFactory.create(myfile).getSheet("sheet3");
		
		String user = refer.getRow(0).getCell(0).getStringCellValue();
		String pas = refer.getRow(0).getCell(1).getStringCellValue();
		String pin = refer.getRow(0).getCell(2).getStringCellValue();
		
		Kiteloginpage kl = new Kiteloginpage(driver);
		
		kl.enterusername(user);
		kl.enterpassword(pas);
		kl.clickoncontinuebutton();
		
		Thread.sleep(1000);
		
		Kitepinpage kp = new Kitepinpage(driver);
		kp.enterPin(pin);
		kp.clickonContinueButton();
		
		Thread.sleep(1000);
		
		Kitehomepage kh= new Kitehomepage(driver);
		kh.verifyuserid(user);
		kh.clickonlogoutbutton();
		
		
		driver.quit();
		
		
		
		
	}

}
