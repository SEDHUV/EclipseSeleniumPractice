package selenium;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
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
import org.openqa.selenium.JavascriptExecutor;

public class images {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freepik.com/free-photos-vectors/test-automation");
		driver.manage().window().maximize();
		WebElement image =driver.findElement(By.xpath("//*[@id=\"dtl-22896753\"]/img"));
		if(image.getAttribute("naturalWidth").equals("0"))
			System.out.println("broken");
		else
			System.out.println("not broken");
		image.click();
		Thread.sleep(5000);
	WebElement add = 	driver.findElement(By.className("collection-add"));
	JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].click();", add);
		

	}

}
