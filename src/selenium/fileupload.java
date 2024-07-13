


package selenium;
//import java.time.Duration;

import java.util.Set;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
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
public class fileupload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://blueimp.github.io/jQuery-File-Upload/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
     WebElement fileup=   driver.findElement(By.cssSelector("input[type='file']"));
     
     
        Actions act = new Actions(driver);
        act.moveToElement(fileup).click().build().perform();
        Thread.sleep(3000);
        Robot robo = new Robot();
     
        
        
       
       
       // "C:\Users\SEDHU\OneDrive - Capgemini\Pictures\Screenshots\Screenshot (1).png"
       //"C:\Users\SEDHU\OneDrive - Capgemini\Pictures\Screenshots\Screenshot (1).png"
       
        
     
        
        StringSelection select = new StringSelection("\"C:\\Users\\SEDHU\\OneDrive - Capgemini\\Desktop\\Screenshot (1).png\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
         robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
        Thread.sleep(3000);
        robo.keyRelease(KeyEvent.VK_V);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER); 
       WebElement poo =  driver.findElement(By.className("btn-primary"));
       act.moveToElement(poo).click().perform();
       Thread.sleep(5000);
       WebElement thrash = driver.findElement(By.className("btn-warning"));
       act.moveToElement(thrash).click().perform();
       
        
        
        
        
        
        
        
        
        
        
       
        
        
        
        
        
        
        
      
        
    
        


	}}


