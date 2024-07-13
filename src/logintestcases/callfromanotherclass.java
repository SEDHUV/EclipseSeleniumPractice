package logintestcases;

public class callfromanotherclass {
	public static void main(String[] args) {
		String excelpath = "C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\excel\\Book1.xlsx";
		exceldata excel = new exceldata(excelpath, "Sheet1");
		excel.getrowcount(); 
		excel.getcelldatastring(0, 0);
		excel.getcelldatanum(1, 1);
		
	}

}
