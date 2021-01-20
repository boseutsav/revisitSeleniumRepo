package selenium_learning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Class_23 {
	String filePath1 = System.getProperty("user.dir") + "\\myExcel97.xls";
	String filePath2 = System.getProperty("user.dir") + "\\myExcel2003.xlsx";

	@Test
	public void readXLFile() throws IOException {

		FileOutputStream fileout1 = new FileOutputStream(filePath1);
		FileOutputStream fileout2 = new FileOutputStream(filePath2);

		HSSFWorkbook readXLS = new HSSFWorkbook();
		XSSFWorkbook readXLSX = new XSSFWorkbook();

		HSSFSheet sheet1 = readXLS.createSheet("Utsav");
		HSSFRow row1 = sheet1.createRow(0);
		row1.createCell(0).setCellValue("Utsav Bose");
		row1.createCell(1).setCellValue("Shah Rukh Khan");
		row1.createCell(2).setCellValue("Ajay Devgn");
		readXLS.write(fileout1);
		readXLS.close();
		XSSFSheet sheet11 = readXLSX.createSheet("UtsavSheet");
		XSSFRow row11 = sheet11.createRow(0);
		row11.createCell(0).setCellValue("Ranadeb Bose");
		row11.createCell(1).setCellValue("Kumir Khan");
		row11.createCell(2).setCellValue("Ajay Kartik");
		int[] arr = new int [] {1,2,3,4,5,6,7};
		for (int x : arr) {
			XSSFRow wrRow= sheet11.createRow(x);
			wrRow.createCell(0).setCellValue("Ranadeb Bose"+x);
			wrRow.createCell(1).setCellValue("Kumir Khan"+x);
			wrRow.createCell(2).setCellValue("Ajay Kartik"+x);
		}
		readXLSX.write(fileout2);
		readXLSX.close();
		

		FileInputStream file1 = new FileInputStream(filePath1);
		FileInputStream file2 = new FileInputStream(filePath2);
		XSSFWorkbook writeXLSX = new XSSFWorkbook(file2);
		XSSFSheet rdSheet = writeXLSX.getSheetAt(0);
		int rowCount = rdSheet.getLastRowNum()+1;
		System.out.println("Row Count is:"+rowCount);
		
		for (int row=0;row<rowCount;row++) {
			XSSFRow rdRow = rdSheet.getRow(row);
			int columnCount = rdRow.getLastCellNum();
			String rowContent=null;
			for (int col=0;col<columnCount;col++) {
				if (rowContent!=null){
					rowContent+=rdRow.getCell(col).getStringCellValue();
					rowContent+="-||-";
				}
				else {
					rowContent=rdRow.getCell(col).getStringCellValue();
					rowContent+="-||-";
				}
				
			}
			System.out.println(rowContent);
			
		}
		writeXLSX.close();

	}

}
