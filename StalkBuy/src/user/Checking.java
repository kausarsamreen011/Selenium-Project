package user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Checking {

	public static void main(String[] args)
	{
		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Rameezraja\\Desktop\\Selenium jar\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.stalkbuylove.com/");	
			Actions c=new Actions(driver);
			WebElement we=driver.findElement(By.linkText("COLLECTION"));
			c.moveToElement(we).build().perform();
	}

}
