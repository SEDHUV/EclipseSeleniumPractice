


package selenium;
//import java.time.Duration;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.Point;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	      ChromeOptions options = new ChromeOptions();
	      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
			WebDriver driver = new ChromeDriver(options);
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
    WebElement link = driver.findElement(By.linkText("Toggle"));
    link.click();
    WebElement yes = driver.findElement(By.cssSelector("label.radio"));
    yes.click(); 
   System.out.println(yes.getText()); 
   WebElement onlyone = driver.findElement(By.id("one"));
   WebElement onlyone1 = driver.findElement(By.id("two"));
		   onlyone.click();
		   onlyone1.click();
		   if(onlyone.isSelected()== true)
			   System.out.println("two buttons enabled");
		   else
			   System.out.println("one button enabled");
		   WebElement bug = driver.findElement(By.id("nobug"));
		   WebElement bug1 = driver.findElement(By.id("bug"));
		   bug.click();
		   bug1.click();
		   if(bug1.isSelected())
			   System.out.println("there is a bug in the application bcoz it is radio button");
		   
		WebElement get = driver.findElement(By.id("foo"));
		WebElement get1 = driver.findElement(By.id("notfoo"));
		if(get.isSelected())
			System.out.println("foo selected");
		else
			System.out.println("bar selected");
		if(driver.findElement(By.id("maybe")).isEnabled())
			System.out.println("is there");
		else
			System.out.println("disabled");
		List<WebElement> agreed = driver.findElements(By.cssSelector("label.checkbox"));
		 System.out.println(agreed.size());
		 System.out.println(agreed.get(1).getText());
		 agreed.get(1).click();
		System.out.println(agreed.get(0).getText()); 
		 boolean sollu =agreed.get(0).isSelected();
		 System.out.println(sollu);
		 boolean sollu1=agreed.get(1).isSelected();
		 System.out.println(sollu1);
	System.out.println( driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected()
	 );	
	List <WebElement> twoitemssamecss = driver.findElements(By.cssSelector("input[type='checkbox']"));
	
		System.out.println(twoitemssamecss.size());	
		
	
System.out.println(twoitemssamecss.get(1).isSelected());	
			
		
		
		
   
   


 
   
   
       
   
        
        
      
        
    
        


	}}


