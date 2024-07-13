


package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        WebElement search=driver.findElement(By.id("APjFqb"));
        search.click();
        search.sendKeys("coursera" + Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));
        
        WebElement images = driver.findElement(By.linkText("Images"));
        images.click();
        WebElement imagesclick = driver.findElement(By.cssSelector("img[class='rg_i Q4LuWd']"))
        	; 
        imagesclick.click();

	}

}
