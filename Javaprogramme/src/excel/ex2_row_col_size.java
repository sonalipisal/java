package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;




public class ex2_row_col_size{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("C:\\selenium\\excel.xlsx\\");
	
	//display 0number cell row count
	int value = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	System.out.println("total number of rows: "+(value+1));
	
	FileInputStream file1 = new FileInputStream("C:\\selenium\\excel.xlsx\\");

	//display 2number row cell count
	short lastrowindex = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(2).getLastCellNum();   
System.out.println(lastrowindex);



	
}
}

