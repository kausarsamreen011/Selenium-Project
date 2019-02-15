package flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rameezraja\\Desktop\\Selenium jar\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://spicejet.com/");
		
		List<WebElement> a=driver.findElements(By.xpath("//div[@id='discount-checkbox']"));
		
		int count=a.size();
		System.out.println("Total check box size:"+count);
		for(int i=0;i<count;i++)
		{
			driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
			
		
		}
	}
	
}
