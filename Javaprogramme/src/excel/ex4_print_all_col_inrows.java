package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex4_print_all_col_inrows 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("C:\\selenium\\excel.xlsx\\");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	int last = sh.getLastRowNum();
	
	for(int i=0;i<=last-1;i++)
	{
		String str = sh.getRow(3).getCell(i).getStringCellValue();
		System.out.print(str+" ");
	}
	
	
}
}

	