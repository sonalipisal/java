package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex11_print_all_data_verifying_typeofcell 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("C:\\selenium\\excel.xlsx\\");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	int lastrow = sh.getLastRowNum();
	
	for(int i=0;i<=lastrow;i++)
	{
		int lastcell = sh.getRow(i).getLastCellNum()-1;
		for(int j=0;j<=lastcell;j++)
		{
			Cell cellinfo = sh.getRow(i).getCell(j);
			CellType cell = cellinfo.getCellType();
			
			if(cell == CellType.STRING)
			{
				System.out.print(cellinfo.getRichStringCellValue()+" ");
			}
			else if (cell == CellType.NUMERIC) 
			{
				System.out.print(cellinfo.getNumericCellValue()+" ");
			}
			else if(cell==CellType.BOOLEAN)
			{
				System.out.println(cellinfo.getBooleanCellValue()+" ");
			}
			
			
			
		}
		System.out.println();
	
		
	
	}
	
}

}

