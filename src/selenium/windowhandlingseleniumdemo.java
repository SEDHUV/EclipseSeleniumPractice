


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
import org.openqa.selenium.support.Color;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class windowhandlingseleniumdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/test");
        String homewindow = driver.getWindowHandle();
        System.out.println(homewindow);
       driver.manage().window().maximize();
    WebElement link = driver.findElement(By.linkText("Tabs"));
    link.click();
   driver.findElement(By.cssSelector("button#home")).click();
   driver.findElement(By.id("multi")).click();
 Set<String> multiplewindows =   driver.getWindowHandles();
 
  
  for (String eachwindowtitle : multiplewindows) {
	  driver.switchTo().window(eachwindowtitle);
	  System.out.println(driver.getTitle());
	
}
//  driver.switchTo().window(homewindow).close();
  
//  Thread.sleep(5000);
  
  
//  driver.switchTo().window(homewindow);
//  driver.findElement(By.id("multi")).click();
//  System.out.println(driver.getTitle()); 
//  driver.switchTo().window(list.get(1));
// System.out.println(driver.getTitle()); 
  
    
   


 
   
   
       
   
        
        
      
        
    
        


	}}


