package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Difftypes2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");
			
			Sheet ref = WorkbookFactory.create(myfile).getSheet("sheet2"); 
			
			int totalrow = ref.getLastRowNum();                    //find out last row and colomn
			
			int totalcolomn = ref.getRow(0).getLastCellNum()-1;
			
			
			
			for(int i =0;i<=totalrow;i++)                      //outer for loop for row
			{
				for(int j=0;j<=totalcolomn;j++)                //inner for loop for colomn
				{
					
					Cell into = ref.getRow(i).getCell(j);       //find type of data
					
					CellType type = into.getCellType();         //find type of data
					
				
					
					if(type==CellType.STRING)                   //for string
					{
						String type1 = into.getStringCellValue();
						
						System.out.println(type1+" ");
					}
					
					
					
					else if(type==CellType.BOOLEAN)                       //for boolean
					{
						boolean type2 = into.getBooleanCellValue();
						
						System.out.println(type2+" ");
					}
					
				
					
					else if(type==CellType.NUMERIC)                        //for numeric
					{ 
						double type3 = into.getNumericCellValue();
						
						System.out.println(type3+" ");
					
					}
					
				}
				System.out.println();
				
			}
			
			
			


	}

}
