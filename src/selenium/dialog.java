


package selenium;
//import java.time.Duration;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class dialog {
	@Test
	public void testng() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	      ChromeOptions options = new ChromeOptions();
	      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
			WebDriver driver = new ChromeDriver(options);
//		WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
    WebElement link = driver.findElement(By.linkText("Dialog"));
    link.click();
    WebElement accept = driver.findElement(By.id("accept"));
    accept.click();
    Alert accep = driver.switchTo().alert();
   System.out.println(accep.getText()); 
   accep.accept();
   WebElement cancel = driver.findElement(By.id("confirm"));
   cancel.click();
   Alert close = driver.switchTo().alert();
  System.out.println(close.getText()); 
 close.dismiss();
 WebElement prompt = driver.findElement(By.id("prompt"));
 prompt.click();
 Alert send = driver.switchTo().alert();
System.out.println(send.getText()); 
send.sendKeys("Sedhu");
send.accept();
  WebElement modern = driver.findElement(By.id("modern"));
   modern.click();


 
   
   
       
   
        
        
      
        
    
        


	}}


