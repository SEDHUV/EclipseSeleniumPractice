


package selenium;
//import java.time.Duration;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	      ChromeOptions options = new ChromeOptions();
	      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
			WebDriver driver = new ChromeDriver(options);
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Drop-Do")).click();
        WebElement fruits = driver.findElement(By.id("fruits"));
        Select sel = new Select(fruits);
        sel.selectByVisibleText("Apple");
        WebElement superheros = driver.findElement(By.id("superheros"));
        Select sel1 = new Select(superheros);
        if(sel1.isMultiple()== true)
        {
        	System.out.println("multiple options supported");
        	sel1.selectByIndex(2);
        	Thread.sleep(2000);
        	sel1.selectByValue("bt");
        	Thread.sleep(2000);
        	sel1.selectByVisibleText("Captain Marvel");
        	Thread.sleep(2000);
        	sel1.deselectAll();}
        else	
        
        {
        	System.out.println("multiple options not supported");
        }
        
        Select sel2 = new Select(driver.findElement(By.id("lang")));
        WebElement first = sel2.getFirstSelectedOption();
        String fir = first.getText();
        System.out.println(fir);
        List<WebElement> options1 = sel2.getOptions();
//        int size = options1.size();
//    alternate method:    for(int i=0;i<size;i++) {
//        	String alloptions = options.get(i).getText();
//        	System.out.println(alloptions);
//        	
//        	
//        	
//        }
        for (WebElement opt : options1) {
			System.out.println(opt.getText());
		}
       Select coun = new Select( driver.findElement(By.id("country")));
     coun.selectByValue("India");
     List<WebElement> option =   coun.getAllSelectedOptions();
     for (WebElement lastone : option) {
		System.out.println(lastone.getText());
	}
       
       
        
       
        
        
        
        
        
    	
   
        
        
      
        
    
        


	}}


