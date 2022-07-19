package Pack123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//	String path="C:\\Users\\rupal\\Downloads\\Test case formate.xlsx ";
		String path="C:\\Users\\rupal\\Downloads\\FAMILY.xlsx";
		
		FileInputStream file=new FileInputStream(path);
	//	String value =WorkbookFactory.create(file).getSheet("12Mar22").getRow(4).getCell(2).getStringCellValue();
		
		String value1 =WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();

		
		System.out.println(value1);
}


	}


