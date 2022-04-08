package Utilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Utility 

{
	static org.apache.poi.ss.usermodel.Sheet mysheet;
	
	public static String getdatafromexcelsheet(int Rowvalue,int Cellvalue) throws EncryptedDocumentException, IOException
	{
		 FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");
			
			
				mysheet = WorkbookFactory.create(myfile).getSheet("sheet3");
				
			     String value = mysheet.getRow(Rowvalue).getCell(Cellvalue).getStringCellValue();
			     
			     return value;
			
	}
	
	public static void takescreenshot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		
		File desti = new File("C:\\Users\\pravi\\Desktop\\velocity\\Practise screenshot\\TC"+TCID+"\\screenshot.png");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
			
		FileHandler.copy(src, desti);
	}
	
	
	
	
}

