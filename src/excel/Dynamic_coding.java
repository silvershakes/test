package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dynamic_coding 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");
        
		Sheet up = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		
	   for(int i=0;i<=1;i++)               // for outerloop to row
	   {
		   for(int j=0;j<=4;j++)           //inner loop to coloumn
		   {
			   String slow = up.getRow(i).getCell(j).getStringCellValue();
			   System.out.print(slow+" ");
			   
		   }
		   System.out.println();
	   }
	   
		
	}

}
