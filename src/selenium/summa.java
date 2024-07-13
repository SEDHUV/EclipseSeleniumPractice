


package selenium;
//import java.time.Duration;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; 
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class summa {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("AUI - 2")).click();
        
    WebElement drag =  driver.findElement(By.id("draggable"));
   int x =  drag.getLocation().getX();
   int y =  drag.getLocation().getY();
   System.out.println(x +"  "+y);
   WebElement drop = driver.findElement(By.id("droppable"));
//    WebElement drop =  driver.findElement(By.className("example-boundary"));
    Actions act = new Actions(driver);
//   act.dragAndDrop(drag, drop).build().perform();
    act.clickAndHold(drag).moveToElement(drop).build().perform();
        
		
	}
	

	public static void main1(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/elements");
        driver.manage().window().maximize();
       List< WebElement> text = driver.findElements(By.xpath("/html/body/app-root/app-githome/section[1]/div/div/div[1]/div/div/div/div/ol/li"));
       System.out.println(text.size());
      System.out.println(text.get(text.size()-2).getText()); 
       System.out.println(text.get(3).getText());
       for (WebElement webElement : text) {
    	 
    	   System.out.println(webElement.getText());
		
	}
      



	}}

