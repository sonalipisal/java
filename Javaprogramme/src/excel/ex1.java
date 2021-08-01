package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ex1
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file = new FileInputStream("C:\\selenium\\excel.xlsx\\");
	
	boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(2).getBooleanCellValue();
    System.out.println(value);

}

}
