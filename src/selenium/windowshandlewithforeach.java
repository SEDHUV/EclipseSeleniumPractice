


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
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class windowshandlewithforeach {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
        WebElement windowbutton = driver.findElement(By.linkText("Tabs"));
        windowbutton.click();
       String homewindow =  driver.getWindowHandle();
        WebElement homewindowbutton = driver.findElement(By.id("home"));
        homewindowbutton.click();
       Set<String> windowhandles =  driver.getWindowHandles();
       for (String windows : windowhandles) {
    	   Thread.sleep(4000);
    	   driver.switchTo().window(windows);
    	  System.out.println(driver.getTitle());
    	  if(windows.equals(homewindow)){
    		  
		driver.close();
		}
	}
       WebElement windowbutton1 = driver.findElement(By.linkText("Tabs"));
       windowbutton1.click();
       WebElement multi = driver.findElement(By.id("multi"));
       multi.click();
       Thread.sleep(3000);
       Set<String> windowhandles2 =  driver.getWindowHandles();
      List<String> list = new ArrayList<String>(windowhandles2);
      int size =list.size();
    System.out.println(size);
     driver.switchTo().window(list.get(0));
      String url1 =  driver.getCurrentUrl();
      System.out.println(url1);
     for (String str : list) {
 	   if(!str.equals(list.get(0))) {
 		  Thread.sleep(3000);
 		   driver.switchTo().window(str);
 		  Thread.sleep(3000);
		   driver.close();
 	   }
     }	
     Set<String> windowhandles3 =  driver.getWindowHandles();
     list.clear();
     list.addAll(windowhandles3);
     int lastone = list.size();
     System.out.println(lastone);
     
            }}


