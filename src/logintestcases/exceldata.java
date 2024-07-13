package logintestcases;



import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldata {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
         getrowcount();
		getcelldatastring(0,0);
		getcelldatanum(1,1);

	}
	public exceldata(String excelpath,String sheetname)  {
		
		 try {
			workbook = new XSSFWorkbook(excelpath);
			 sheet = workbook.getSheet(sheetname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void getrowcount() {
		try {
		
		    
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowcount);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	public static void getcelldatastring(int rownum,int colnum) {
		try {
			
		    
			 String  celldata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			 System.out.println(celldata);
			 
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		
	}
	public static void getcelldatanum(int rownum,int colnum) {
		try {
			
		     
			double celldata = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			 System.out.println(celldata);
			 
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		
	}


}
