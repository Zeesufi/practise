package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametrization {
	public static  String values(String sheet,int row,int columb) throws IOException {
		FileInputStream file = new FileInputStream("C:\\code save\\KiteZerodha\\src\\main\\resources\\abc.xlsx");
		String a=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(columb).getStringCellValue();
		return a;
	}

}
