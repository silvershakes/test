package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Staticcoding {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");

		Sheet start = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		
		for(int i=0;i<=3;i++)
		{
		
		String test1 = start.getRow(1).getCell(i).getStringCellValue();
		System.out.println(test1);
		}
		
		
		
		
		
		
	}

}
