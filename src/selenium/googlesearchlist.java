


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
public class googlesearchlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement ggole = driver.findElement(By.className("gLFyf"));
        ggole.sendKeys("java");
        Thread.sleep(10000);
       List<WebElement> list =  driver.findElements(By.className("wM6W7d"));
     System.out.println(list.size());  
     
    for(int i =0;i<list.size();i++) {
    	 String ser = list.get(i).getText();
    	System.out.println(ser);
    	if(ser.contains("java download")) {
    		list.get(i).click();
    		break;
    	}   	 
     }
//    below method another one
//	    for(int i =0;i<list.size();i++) {
//	    	
//	    	System.out.println(list.get(i).getText());
//	    	if(list.get(i).getText().equals("java download")) {
//	  		list.get(i).click();
//	   		break;
//	  	}}
//	  	 
	       


	}}


