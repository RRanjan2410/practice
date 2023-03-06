package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/Book.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Sheet1").getRow(1).getCell(10).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream("./data/Book.xlsx");
		wb.write(fos);
		wb.close();

	}

}
