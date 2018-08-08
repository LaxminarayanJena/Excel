package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		File src= new File("D:\\Projects\\Excel\\src\\TestData\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		//xlsx-XSSF
		//XLS-HSSF
		XSSFSheet sheet1=wb.getSheetAt(0);
		String  data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		String  data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data0);
		wb.close();

	}

}
