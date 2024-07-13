package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testngdatadriven {
	@DataProvider(name="testdata")
	public static Object[][] dataprovider(){
		String excelpath = "C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\excel\\Book1.xlsx";
	Object[][]data =testdata(excelpath, "Sheet1");
		return data;
		}
	
	@Test(dataProvider="testdata")
	public void saucelabslogin(String username,String password) throws InterruptedException {
		System.out.println(username+"|"+password);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	      ChromeOptions options = new ChromeOptions();
	      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
	      ChromeDriver driver = new ChromeDriver(options);
	      driver.get("https://www.saucedemo.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.id("user-name")).sendKeys(username);
	      driver.findElement(By.id("password")).sendKeys(password);
	      driver.findElement(By.id("login-button")).click();
	      Thread.sleep(3000);
	      driver.quit();
		
		
		
		
	}
	
	public static Object[][] testdata(String excelpath,String sheetname) {
		
		exceldatatestng excel = new exceldatatestng(excelpath, sheetname);
		 int rowcount = excel.getrowcount();
		 int colcount = excel.getcolcount();
		 Object[][] finaldata = new Object[rowcount-1][colcount];
		
		for(int i =1;i<rowcount;i++) {
			for(int j =0;j<colcount;j++) {
				String celldata = excel.getcelldatastring(i, j);
//			System.out.print(celldata+" | ");
				finaldata[i-1][j]=celldata;
				
			}
			System.out.println();
			
		}
		
		return finaldata;
		
	}

}
