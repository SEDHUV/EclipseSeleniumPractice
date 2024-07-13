package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/selectable");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		List<WebElement> ele = driver.findElements(By.id("selectable"));
		System.out.println(ele.size());
		driver.findElement(By.id("container")).click();
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
//		.click(ele.get(0)).click(ele.get(1)).build().perform();
		
	
	
		

	}

}
