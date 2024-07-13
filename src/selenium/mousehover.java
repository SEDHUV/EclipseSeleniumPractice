


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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
   WebElement courses =  driver.findElement(By.className("navbar-link"));
   Actions act = new Actions(driver);
   act.moveToElement(courses).build().perform();
   WebElement playwright =  driver.findElement(By.xpath("//*[@id=\'navbar-menu\']/div[1]/div[1]/div/a[3]"));
   act.moveToElement(playwright).click().build().perform();
   
    
  


 
   
   
       
   
        
        
      
        
    
        


	}}


