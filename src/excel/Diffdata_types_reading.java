package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Diffdata_types_reading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 FileInputStream myfile = new FileInputStream("C:\\Users\\pravi\\Desktop\\silenium all\\1excel.xlsx");
			
			Sheet ref = WorkbookFactory.create(myfile).getSheet("sheet2"); 
			
			int totalrowcount = ref.getLastRowNum();
			
			short totalColomnCount = ref.getRow(0).getLastCellNum();
			
			int finalrowcount = totalrowcount;
			int finalcolomncount = totalColomnCount-1;
			
			for(int i=0;i<=finalrowcount;i++)
			{
				for(int j=0;j<=finalcolomncount;j++)
				{
					Cell info = ref.getRow(i).getCell(j);
					
					CellType type = info.getCellType();
					
					//System.out.println(type);
					
					if(type==CellType.STRING)
					{
						String type1 = info.getStringCellValue();
						
						System.out.println(type1+" ");
						
					}
					else if(type==CellType.NUMERIC)
					{
						double type2 = info.getNumericCellValue();
						
						System.out.println(type2+" ");
					}
					else if(type==CellType.BOOLEAN)
					{
					    boolean type3 = info.getBooleanCellValue();
					    
					    System.out.println(type3+" ");
					    
					}
					
					
					
					
				}
				System.out.println();
			}
			

	}

}
