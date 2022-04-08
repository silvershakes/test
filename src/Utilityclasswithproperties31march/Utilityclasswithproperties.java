package Utilityclasswithproperties31march;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import selenium_study.Takescreenshot;

public class Utilityclasswithproperties
{ WebDriver driver;
	public static String getdatafromproperties(String key) throws IOException
	{
		Properties pr = new Properties();
		FileInputStream Myfile = new FileInputStream("C:\\Users\\pravi\\eclipse-workspace\\11th batch morning\\1stpropertyfile.properties");
	    pr.load(Myfile);
	     String value = pr.getProperty(key);
	     return value;
	}
	
	public static void screenshot(WebDriver driver,int TCID) throws IOException 
	{
       File sr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       
       System.out.println(sr);
       
       File destinnation = new File("C:\\Users\\pravi\\Desktop\\velocity\\Practise screenshot\\TC"+TCID+"screenshot.png");
	
	org.openqa.selenium.io.FileHandler.copy(sr, destinnation);
	}

	
}
