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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class By_testclass_using_if_else
{
	WebDriver driver;
	Sheet mysheet;
	Kitehomepage home1;
	Kiteloginpage login1;
	Kitepinpage pin1;

@Parameters("browsername")	
 @BeforeClass
 public void openingbrowser(String browser) throws EncryptedDocumentException, IOException
 {
	 if(browser.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\crome driver\\chromedriver.exe");
			ChromeOptions opt= new ChromeOptions();
			opt.addArguments("--disable-notifications");
			 driver = new ChromeDriver(opt);
	 }
	 else if (browser.equals("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\pravi\\Desktop\\silenium all\\geckodriver.exe");
		 FirefoxOptions opt1 = new FirefoxOptions();
		 opt1.addArguments("--disable-notifications");
		 driver = new FirefoxDriver();
	 }
	 
	 FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");
		
		 mysheet = WorkbookFactory.create(myfile).getSheet("sheet3"); 
		 
	 driver.get("https://kite.zerodha.com/#loggedout");
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 driver.manage().window().maximize();
	 
     home1 =new Kitehomepage(driver);
     login1 =new Kiteloginpage(driver);
     pin1 =new Kitepinpage(driver);
     
	 
	 
 }

@BeforeMethod
public void enteringuserid() throws InterruptedException
{
	String Userid = mysheet.getRow(0).getCell(0).getStringCellValue();
	String Pass = mysheet.getRow(0).getCell(1).getStringCellValue();
	String Pin = mysheet.getRow(0).getCell(2).getStringCellValue();
	
	login1.sendusername(Userid);
	login1.sendPassword(Pass);
	login1.clickOnContinueButton();
	
	Thread.sleep(3000);
	
	pin1.sendpin(Pin);
	pin1.clickOnContinueButtonPin();
	Thread.sleep(3000);
	
}

@Test
public void validateuserid()
{
	String expecteduserid = mysheet.getRow(0).getCell(0).getStringCellValue();
	
	String actualuserid = home1.getActualUserId();
	
	Assert.assertEquals(actualuserid, expecteduserid,"userid not matched");
	
}

@AfterMethod
public void clickonlogoutbutton() throws InterruptedException
{
	home1.ClickOnlogoutButton();
}

@AfterClass
public void closingbrowser()
{
	driver.quit();
}





}
