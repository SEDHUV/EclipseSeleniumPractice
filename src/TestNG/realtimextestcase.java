package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class realtimextestcase {
	WebDriver driver;
	long start,end,total;
	
	@BeforeSuite
	public void openbrowser(){
		 start = System.currentTimeMillis();
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	      ChromeOptions options = new ChromeOptions();
	      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
			 driver = new ChromeDriver(options);
		}
	
@Test(priority=0)
	public void opengoogle(){
	
	driver.navigate().to("https://www.google.com/");
	driver.manage().window().maximize();
	System.out.println("google opened");
	}
@Test(priority=0)
public void openbing(){

	driver.navigate().to("https://www.bing.com/");
	driver.manage().window().maximize();
	
	
}
@Test(priority=2)
public void openyahoo(){
	
	driver.navigate().to("https://in.search.yahoo.com/");
	driver.manage().window().maximize();
}

@AfterSuite
public void closebrowser(){
	driver.quit();
	 end = System.currentTimeMillis();
	 total = end-start;
	System.out.println(total);
	
	
}

//testng always executes alphabetical wise. for that you have to set priority whichever you want

// using enabled we can skip a testcase 
}
