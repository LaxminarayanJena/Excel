package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelLoop {

	public static void main(String[] args) throws IOException {
		File src= new File("D:\\Projects\\Excel\\src\\TestData\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		 int rowcount=sheet1.getLastRowNum();
		 System.out.println("total rows is"+ rowcount);
		 
		 for(int i=0;i<rowcount;i++)
		 {
			 String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			 System.out.println(data0);
		 }
		
		
		wb.close();

	}

}
