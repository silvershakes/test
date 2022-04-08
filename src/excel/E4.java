package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class E4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");

		Sheet start = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		int totalrows = start.getLastRowNum();
		
		short totalcolomn = start.getRow(0).getLastCellNum();
		
		System.out.println(totalcolomn);
		System.out.println(totalrows);
		
		int finalrows = totalrows;
		
		int finalcolomn = totalcolomn-1;
		
		for(int i=0;i<=finalrows;i++)
		{
			for(int j=0;j<=finalcolomn;j++)
			{
				String pre = start.getRow(i).getCell(j).getStringCellValue();
				System.out.print(pre+" ");
			}
			System.out.println();
		}
		
		
		
		
		
 
	}

}
