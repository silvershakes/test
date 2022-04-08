package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_intro {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
      FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");
      
//       String text = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
//      
//      System.out.println("value from sheet is "+text);
     
      
      String tsr = WorkbookFactory.create(myfile).getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
     
      System.out.println(tsr);
      
	}

}
