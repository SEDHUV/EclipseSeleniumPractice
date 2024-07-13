package selenium;


import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class calendars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement click = driver.findElement(By.id("datepicker"));
		click.click();
		Thread.sleep(3000);
         WebElement tu = driver.findElement(By.xpath("//th[3]"));
		System.out.println(tu.getText());
	
		Thread.sleep(2000);
		List<WebElement> get = driver.findElements(By.xpath("//a[contains(text(),'5')]"));
		get.get(0).click();
		
		
		
		
		
		
	
	
		

	}

}
