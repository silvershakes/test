package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Celltype {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");
		
		Sheet ref = WorkbookFactory.create(myfile).getSheet("sheet2"); 

		CellType type1 = ref.getRow(0).getCell(0).getCellType();
		CellType type2 = ref.getRow(0).getCell(1).getCellType();
		CellType type3 = ref.getRow(0).getCell(2).getCellType();
		CellType type4 = ref.getRow(0).getCell(3).getCellType();
		CellType type5 = ref.getRow(0).getCell(4).getCellType();
		
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println(type4);
		System.out.println(type5);
		
		System.out.println(ref.getRow(0).getCell(0).getStringCellValue());
		System.out.println(ref.getRow(0).getCell(1).getStringCellValue());
		System.out.println(ref.getRow(0).getCell(2).getStringCellValue());
		System.out.println(ref.getRow(0).getCell(3).getNumericCellValue());
		System.out.println(ref.getRow(0).getCell(4).getBooleanCellValue());
	}

}
