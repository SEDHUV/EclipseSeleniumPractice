


package selenium;
//import java.time.Duration;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class windowshandlewithiterate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
        WebElement windowbutton = driver.findElement(By.linkText("Tabs"));
        windowbutton.click();
        WebElement homewindowbutton = driver.findElement(By.id("home"));
        homewindowbutton.click();
       Set<String> windowhandles =  driver.getWindowHandles();
       Iterator<String> iterate = windowhandles.iterator();
      String parentwindow = iterate.next();
      String childwindow = iterate.next();
       driver.switchTo().window(childwindow);
     String title =  driver.getTitle();
     System.out.println(title);
    driver.findElement(By.linkText("Edit")).click();
   Set<String> windowhandles2 =  driver.getWindowHandles();
     List<String> list = new ArrayList<String>(windowhandles2);
 String name =  list.get(0);
    System.out.println(name);
//    driver.switchTo().window(childwindow);
    driver.switchTo().window(list.get(1));
  driver.close();
  list.clear();
  Set<String> windowhandles3 =  driver.getWindowHandles();
  list.addAll(windowhandles3);
  int size =  windowhandles3.size();
  System.out.println(size);
  
 
  
  
      
       
       
      
        


	}}


