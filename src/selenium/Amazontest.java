package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazontest {
	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	      ChromeOptions options = new ChromeOptions();
	      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
			driver = new ChromeDriver(options);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	 WebElement ele = driver.findElement(By.id("searchDropdownBox"));
	 Select select = new Select(ele);
	 select.selectByVisibleText("Electronics");
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("tv");
	 Thread.sleep(4000);
	 List<WebElement> tvlist = driver.findElements(By.id("nav-flyout-searchAjax"));
	 //List<WebElement> tvlist = driver.findElements(By.className("s-suggestion-container"));
	 for(int i =0;i<tvlist.size();i++) {
    	 String ser = tvlist.get(i).getText();
    	System.out.println(ser);
    	if(ser.contains("tv 55 inch+")) {
    		tvlist.get(i).click();
    		break;
    		}
    	Thread.sleep(4000);
    	scrolldown(0, 1000);
    		
	 }}
	
    	private void scrolldown(int x,int y) {
    		JavascriptExecutor JsEngine;
    		JsEngine= (JavascriptExecutor)driver;
    		String Jscommand  = String.format("window.scrollBy(%d,%d)",x,y);
    		JsEngine.executeScript(Jscommand);
    	}
    		
    		
    		
    		
    		
    		
    		
    	
    	
    	
    	
     }
		
	
	
	
	
	


