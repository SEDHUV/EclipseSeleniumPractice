package logintestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class advancedlogin {
	
		
	@DataProvider(name="logindata")
	public String[][] logindataprovider() {
		String [][] data = {
				{"standard_user","secret_sauce"},
				{"standard_use","secret_saue"}
				};

		return data;
		
	}
	
	@Test(dataProvider="logindata")
		public void openbrowser(String userName,String Password ) throws InterruptedException{
//				 start = System.currentTimeMillis();
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
			      ChromeOptions options = new ChromeOptions();
			      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
			      ChromeDriver driver = new ChromeDriver(options);
			      driver.get("https://www.saucedemo.com/");
			      driver.manage().window().maximize();
			      driver.findElement(By.id("user-name")).sendKeys(userName);
			      driver.findElement(By.id("password")).sendKeys(Password);
			      driver.findElement(By.id("login-button")).click();
			      Thread.sleep(3000);
			      driver.quit();
			      
			      
			      
				}
		
		

}
