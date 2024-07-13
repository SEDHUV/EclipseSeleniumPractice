


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
public class editbutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/test");
        driver.manage().window().maximize();
        WebElement text = driver.findElement(By.className("content"));
//   (if elements has multiple class use full class name with point like this or else use above method by taking only one class)
//        WebElement text1 = driver.findElement(By.cssSelector(".content.has-text-centered"));
        String inside = text.getText();
        System.out.println(inside);
        WebElement input = driver.findElement(By.linkText("Edit"));
        input.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(5000);
        WebElement input1 = driver.findElement(By.linkText("Edit"));
        input1.click();
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle ="Interact with Input fields";
        if(actualTitle.equals(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
//     another method: case not important in that
//        if(driver.getTitle().equalsIgnoreCase("Interact with input fields")) {
//        	System.out.println("title correct");
//        }
//        else{
//        	System.out.println("title not correct");}
        WebElement fullname = driver.findElement(By.id("fullName"));
        fullname.sendKeys("sedhu");
        WebElement append = driver.findElement(By.cssSelector("#join"));
        append.clear();
        append.sendKeys("append");
        WebElement getme = driver.findElement(By.id("getMe"));
        String whattext = getme.getAttribute("value");
        System.out.println("the text is : "+ whattext);
        WebElement webedit = driver.findElement(By.id("noEdit"));
        Boolean editbutton = webedit.isEnabled();
        System.out.println(editbutton);
        if(editbutton == true)
        	System.out.println("editfield enabled");
        else
        	System.out.println("editfield disabled");
//    simple method:    if(webedit.isEnabled()) 
//        	
//        	System.out.println("editfield enabled");
//            else
//            	System.out.println("editfield disabled");
        WebElement nofill = driver.findElement(By.id("dontwrite"));
        String gett = nofill.getAttribute("value");
        if(gett.contains(" readonly"))
        System.out.println("readonly confirmed");
        else
        	System.out.println("readonly not there");
        driver.navigate().back();
        driver.quit();
//       
//        
        


	}}


