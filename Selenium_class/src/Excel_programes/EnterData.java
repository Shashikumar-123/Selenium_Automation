package Excel_programes;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EnterData {

	public static void main(String[] args) throws IOException {
XSSFWorkbook book = new XSSFWorkbook();
XSSFSheet sheet = book.createSheet("Sheet1");
XSSFRow row = sheet.createRow(0);
XSSFCell cell = row.createCell(2);
cell.setCellValue("bhvjvj");
FileOutputStream fos = new FileOutputStream("./Excel/Qspider.xlsx");
book.write(fos);
book.close();
fos.close();
System.out.println("written data");
	}

}
