package Kiteappusingpomandtestng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class By_using_pom_and_testng 
{
	WebDriver driver;
	Sheet mysheet;
	Kitehomepage home;
	Kiteloginpage login;
	Kitepinpage pin;
	
	@BeforeClass
	public void launchingbrowser() throws EncryptedDocumentException, IOException
	{
		Reporter.log("opening browser",true);
		//opening browser and hitting website
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		 driver = new ChromeDriver(opt);
		 driver.get("https://kite.zerodha.com/#loggedout");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.manage().window().maximize();
		 Reporter.log(" browser open sucessfully",true);
		 //fetching data from excel sheet
		 
		 FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");
			
			mysheet = WorkbookFactory.create(myfile).getSheet("sheet3"); 
			
			// creating objects of pages
			
			home = new Kitehomepage(driver);
			login = new Kiteloginpage(driver);
			pin= new Kitepinpage(driver);
			
			
		 
	}
	
	@BeforeMethod
	
	public void Logintokite() throws InterruptedException
	{
		Reporter.log("enterning userid and password",true);
		String Userid = mysheet.getRow(0).getCell(0).getStringCellValue();
		String Pass = mysheet.getRow(0).getCell(1).getStringCellValue();
		String Pin = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		login.sendusername(Userid);
		login.sendPassword(Pass);
		login.clickOnContinueButton();
		Reporter.log("entered userid and password",true);
		Thread.sleep(1000);
		
		Reporter.log("enterning pin",true);
		 pin.sendpin(Pin);
		 Thread.sleep(3000);
		 pin.clickOnContinueButtonPin();
		 Reporter.log("entered pin",true);
		 Thread.sleep(3000);
		
		
		
	}
	
	@Test
	public void validateuserid()
	{
		Reporter.log("validating userid",true);
		String expecteduserid = mysheet.getRow(0).getCell(0).getStringCellValue();
		String actualuserid = home.getActualUserId();
		
		Assert.assertEquals(actualuserid, expecteduserid,"user id is not matching test case fail");
		Reporter.log("validating userid got sucess",true);
	}
	
	@AfterMethod
	public void gettinglogout() throws InterruptedException
	{Reporter.log("logout process",true);
		home.ClickOnlogoutButton();
	}
	
	@AfterClass
	public void closingbrowser()
	{Reporter.log("browser closed",true);
		driver.quit();
	}
  
}
