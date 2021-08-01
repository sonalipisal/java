package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex5_print_all_row_colwise 
{
  public static void main(String[] args) throws EncryptedDocumentException, IOException {
	  
	  FileInputStream file = new FileInputStream("C:\\selenium\\excel.xlsx\\");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int last = sh.getLastRowNum();
		
		for(int i=0;i<=last;i++)
		{
			String str = sh.getRow(i).getCell(2).getStringCellValue();
			System.out.println(str);
		}
	
}
}
