package excel;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex9_verify_type_of_cell_value
{
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	  
	FileInputStream file = new FileInputStream("C:\\selenium\\excel.xlsx\\");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	
	Cell cellinfo = sh.getRow(0).getCell(0);
	
	CellType celltypeinfo = cellinfo.getCellType();
	System.out.println(celltypeinfo);
	
	if(celltypeinfo==CellType.STRING)
	{
		System.out.println(cellinfo.getStringCellValue());
	}
	else if(celltypeinfo==CellType.NUMERIC)
	{
		System.out.println(cellinfo.getNumericCellValue());
	}
	else if(celltypeinfo==CellType.BOOLEAN)
	{
		System.out.println(cellinfo.getBooleanCellValue());
	}
	
	
}
}
