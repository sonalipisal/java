package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3_read_numericdata_asstring
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream file = new FileInputStream("C:\\selenium\\excel.xlsx\\");
	
	String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	  System.out.println(value);
}

}
