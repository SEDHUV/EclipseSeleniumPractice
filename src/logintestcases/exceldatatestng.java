package logintestcases;





import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldatatestng {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

//	public static void main(String[] args) {
//         getrowcount();
//		getcelldatastring(0,0);
//		getcelldatanum(1,1);
//
//	}
	public exceldatatestng(String excelpath,String sheetname)  {
		
		 try {
			workbook = new XSSFWorkbook(excelpath);
			 sheet = workbook.getSheet(sheetname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static int getrowcount() {
		int rowcount =0;
		try {
		
		    
		 rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowcount);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowcount;
		
	}
	public static int getcolcount() {
		int colcount=0;
		try {
		
		    
		colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println(colcount);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colcount;
		
	}
	public static String getcelldatastring(int rownum,int colnum) {
		String cell=null;
		try {
			
		    
		  cell = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
//		 System.out.println(cell);
			 
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cell;
		
		
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
