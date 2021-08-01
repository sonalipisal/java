package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex10_print_All_data 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	
	FileInputStream file = new FileInputStream("C:\\selenium\\excel.xlsx\\");
	
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	
	int lastrowindex = sh.getLastRowNum();
	
	for(int i=0;i<=lastrowindex;i++)
	{
		int lastcellindex = sh.getRow(i).getLastCellNum()-1;
		
		for(int j=0;j<=lastcellindex;j++)
		{
			System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+" ");
		}
		System.out.println();
	}
	
	
	}
	
	
}
