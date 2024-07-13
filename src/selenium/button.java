


package selenium;
//import java.time.Duratio;

import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        WebElement text1 = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/div/div"));
        String inside2 = text1.getText();                
        System.out.println(inside2);
        String top = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/header/p")).getText();
        System.out.println(top);
        WebElement click = driver.findElement(By.linkText("Click"));
        act.moveToElement(click).keyDown(Keys.ENTER).click().keyUp(Keys.ENTER).perform();
        Thread.sleep(3000);
//       driver.findElement(By.cssSelector("button[class='button is-link']")).click();
//        driver.findElement(By.cssSelector("[class='button is-link']")).click();
//      driver.findElement(By.cssSelector("button.is-link")).click();
//       driver.findElement(By.className("is-link")).click();
//       driver.findElement(By.cssSelector("button.is-link")).click();
       driver.findElement(By.cssSelector(".button.is-link")).click();
      Thread.sleep(3000);
      driver.navigate().back();
     WebElement loc =   driver.findElement(By.cssSelector("button#position"));
    Point loc1 =  loc.getLocation();
    System.out.println(loc1);
   int xvalue =  loc1.getX();
   int yvalue =  loc1.getY();
   System.out.println("x value is"+" "+ xvalue+", "+ "y value is"+" "+ yvalue);
   WebElement color1 = driver.findElement(By.className("is-primary"));
   String kalar = color1.getCssValue("color");
   System.out.println(kalar);
   String finalcolor = Color.fromString(kalar).asHex();
   System.out.println(finalcolor);
    WebElement property = driver.findElement(By.id("property"));
    Dimension prop = property.getSize();
    System.out.println(prop);
    int height = prop.getHeight();
    int width = prop.getWidth();
    System.out.println(height+" "+width);
    WebElement disable = driver.findElement(By.cssSelector("[title='Disabled button']"));
    if(disable.isEnabled()== true)
    	System.out.println("button enabled");
    else 
    	System.out.println("button disabled");
    WebElement hold = driver.findElement(By.tagName("h2"));
    System.out.println(hold.getText());
    hold.click();
    
   
   
        
        
      
        
    
        


	}}


