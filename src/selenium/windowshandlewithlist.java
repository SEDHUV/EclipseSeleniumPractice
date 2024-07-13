			


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
public class windowshandlewithlist {

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
       System.out.println(windowhandles);
       List<String> list = new ArrayList<String>(windowhandles);
       int size =list.size();
       System.out.println(size);
       driver.switchTo().window(list.get(1));
      String url =  driver.getCurrentUrl();
      System.out.println(url);
      driver.switchTo().window(list.get(0));
      String url1 =  driver.getCurrentUrl();
      System.out.println(url1);
      driver.close();
      Set<String> windowhandles2 =  driver.getWindowHandles();
      list.clear();
      list.addAll(windowhandles2);
     int sizeofwindow =   windowhandles2.size();
     System.out.println(sizeofwindow);
     driver.quit();
      
        


	}}


