package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelForLoop {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream excel=new FileInputStream("C:/Users/Amol/Desktop/amol.xlsx");
		Sheet a=WorkbookFactory.create(excel).getSheet("Sheet1");
		
		int row=a.getPhysicalNumberOfRows();
		System.out.println(row);
		
		for(int i=0; i<row; i++) {
			
			int cellon=a.getRow(i).getPhysicalNumberOfCells();
			
			for(int j=0; j<cellon; j++) {
				String ss=a.getRow(i).getCell(j).getStringCellValue();
				System.out.print(" "+ss);
		     }
			System.out.println();
		}	
		

	
	
	}
}
