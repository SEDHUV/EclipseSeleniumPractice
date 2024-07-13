


package selenium;
//import java.time.Duration;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class sortables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		List<WebElement> frame = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		System.out.println(frame.size());
		Actions act = new Actions(driver);
		act.dragAndDrop(frame.get(2), frame.get(0)).build().perform();
		
      
        
        
        
        
    	
   
        
        
      
        
    
        


	}}


