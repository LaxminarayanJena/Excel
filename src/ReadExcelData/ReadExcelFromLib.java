package ReadExcelData;

import java.io.IOException;

import lib.ExcelDataConfig;

public class ReadExcelFromLib {

	public static void main(String[] args) throws IOException {
		ExcelDataConfig excel= new ExcelDataConfig("D:\\Projects\\Excel\\src\\TestData\\TestData.xlsx");
		System.out.println(excel.getData(0, 0, 0));
		System.out.println(excel.getData(0, 1, 0));
		System.out.println(excel.getData(0, 0, 1));


	}

}
