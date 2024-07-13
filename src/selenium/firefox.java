package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		WebElement sel = driver.findElement(By.id("testingDropdown"));
		Select select = new Select(sel);
		//select.selectByValue("Performance");- selecting by value
		//select.selectByIndex(3);-select by index
		select.selectByVisibleText("Performance Testing");
	}

}
