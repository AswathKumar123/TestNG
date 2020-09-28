package TestCaseforTNG;





import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public String path;
	public FileInputStream fis = null;
	public FileOutputStream fileOut = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row = null;
	private XSSFCell cell = null;
	
	
	public ExcelReader(String path) {
		this.path=path;
	
	try {
		fis = new FileInputStream(path);

		workbook = new XSSFWorkbook(fis);
		sheet=workbook.getSheetAt(0);
		fis.close();
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
//	}
//	
//	
//	public int getrowandCell(String Sheetname) throws IOException {
//	for (Row row : sheet) {
//		for (Cell cell : row) {
//
//			switch (cell.getCellType()) {
//
//			case Cell.class:
//				System.out.println(cell.getStringCellValue());
//
//			case Cell.CELL_TYPE_NUMERIC:
//				System.out.println(cell.getStringCellValue());
//
//			case Cell.CELL_TYPE_BLANK:
//				System.out.println(cell.getStringCellValue());
//	
////	//return the rows in the sheet
////	public int getRowCount(String Sheetname) {
////		int index = workbook.getSheetIndex(Sheetname);
////		if(index==-1) {
////			return 0;
////		} else {
////			sheet=workbook.getSheetAt(index);
////			int number= sheet.getLastRowNum()+1;
//			return number;
//		}
//	}
//
//	//return the data from the cell
//	public String getCellData(String Sheetname, int colNum, int rowNum) {
//		try {
//			if(rowNum<=0) 
//				return "";
//			int index = workbook.getSheetIndex(Sheetname);
//			
//			if(index==-1)
//				return "";
//			
//			sheet = workbook.getSheetAt(index);
//			row = sheet.getRow(rowNum-1);
//			if(row==null)
//				return "";
//			
//			cell = row.getCell(colNum);
//		}
//	}
//}