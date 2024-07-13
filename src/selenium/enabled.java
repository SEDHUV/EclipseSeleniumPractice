package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Point;

public class enabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SEDHU\\eclipse-workspace\\newbrowser\\drivers\\chromedriver.exe");
	      ChromeOptions options = new ChromeOptions();
	      options.setBinary("C:\\Users\\SEDHU\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
			WebDriver driver = new ChromeDriver(options);
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		//location find
		WebElement value = driver.findElement(By.id("female"));
	
		Point point = value.getLocation();
		int xvalue = point.getX();
		int yvalue =point.getY();
		System.out.println(xvalue+"     "+  yvalue);
		//colour find
		WebElement colorbutton = driver.findElement(By.id("idOfButton"));
		String color = colorbutton.getCssValue("background");
		System.out.println(color);
		// size find
		int height = colorbutton.getSize().getHeight();
		int width = colorbutton.getSize().getWidth();
		System.out.println(height+"   "+width);
		     
		
	}

}
