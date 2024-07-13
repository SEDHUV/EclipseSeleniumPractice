


package selenium;
//import java.time.Duration;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;


//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class lie {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/edit");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        WebElement ca = driver.findElement(By.id("join"));
//        WebElement pa = driver.findElement(By.id("permanentAddress"));
       act.moveToElement(ca).click().keyDown(Keys.SHIFT).sendKeys("ssssss").keyUp(Keys.SHIFT).sendKeys(Keys.TAB)
//       .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
//       .keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
//       .sendKeys(Keys.TAB)
//       .keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
       .sendKeys("a").sendKeys("c").keyDown(Keys.TAB) 
       .sendKeys("v").build().perform();
       WebElement fn = driver.findElement(By.id("fullName"));
       act.moveToElement(fn).click().sendKeys("dscdssc").build().perform();
       Thread.sleep(3000);
       act.moveToElement(fn).sendKeys("hgcytchgtcyt").build().perform();
       Thread.sleep(2000);
       act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();
       driver.navigate().back();
       
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].value='acxaca';", ca);
//        //js.executeScript("document.getElementById('permanentAddress').value='555-55-5555';");
//        js.executeScript("arguments[0].value='acxaca';", pa);
//        
        
        
        
        
        
      
        
    
        


	}}


