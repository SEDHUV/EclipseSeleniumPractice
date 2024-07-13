package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.Collections;

public class table {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/advancedtable");
	List<WebElement> allheaders = driver.findElements(By.xpath("//Td[2]"));
	for (WebElement webElement : allheaders) {
		System.out.println(webElement.getText());
		
	}
//	WebElement country = driver.findElement(By.xpath("//td[normalize-space()='University of Abertay Dundee']//following::td[1]"));
//	String text = country.getText();
//	System.out.println(text);
	
	List<WebElement> firstone = driver.findElements(By.xpath("//Td[1]"));
	List<Integer> firstoneint = new ArrayList<Integer>();
	
	for (WebElement webElement : firstone) {
		String tex = webElement.getText();
		firstoneint.add(Integer.parseInt(tex));
//	
	}
	System.out.println(firstoneint);
	int small = Collections.min(firstoneint);
	System.out.println(small);
	String final1 = Integer.toString(small);
	String xpath = "//td[normalize-space()="+"'"+final1+"'"+"]"+"//following::td[1]";
	System.out.println(xpath);
	WebElement found = driver.findElement(By.xpath(xpath));
	System.out.println(found.getText());
	
	////td[normalize-space()='1']//following::td[1]
		

	}

}
