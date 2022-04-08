package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class E4copy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");
		
		Sheet ref = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		int totalrow = ref.getLastRowNum();
		short totalcolomn = ref.getRow(0).getLastCellNum();

		int finalrow = totalrow;
		int finalcolomn = totalcolomn-1;
		
		for(int i=0;i<=finalrow;i++)
		{
			for(int j=0;j<=finalcolomn;j++)
			{
				String finals = ref.getRow(i).getCell(j).getStringCellValue();
				System.out.print(finals+" ");
			}
			System.out.println();
		}
		
	}

}
