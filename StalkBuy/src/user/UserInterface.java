package user;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.DriverServlet;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class UserInterface 
{
	WebDriver driver;
	@Test(priority=0)
	public void lauchApplication() 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rameezraja\\Desktop\\Selenium jar\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.stalkbuylove.com/");
		
	}
	@Test(priority=1)
	public void userLogin() 
	{
		driver.findElement(By.cssSelector(".user-link > svg:nth-child(1)")).click();
		driver.findElement(By.id("email")).sendKeys("rameez.raja013@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("rameez8123");
		driver.findElement(By.id("send2")).click();
		
		//driver.findElement(By.cssSelector("a.visible-lg-block")).click();
	}
	@Test(priority=2)
	public void hoverAndClick() 
	{	    
		/*Actions c=new Actions(driver);
		WebElement we=driver.findElement(By.cssSelector("a.visible-lg-block"));
		c.moveToElement(we).build().perform();
		WebElement we1=driver.findElement(By.cssSelector("#col_sub_1 > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"));
		c.moveToElement(we1).click().perform();*/  //hover collection and click summer brights
		Actions c=new Actions(driver);
		WebElement we=driver.findElement(By.cssSelector("a.visible-lg-block"));
		c.moveToElement(we).build().perform();
		
		/* List<WebElement> oLinksOnPage = driver.findElements(By.tagName("a"));

		    System.out.println(oLinksOnPage.size());

		    for(int i=0;i<oLinksOnPage.size();i++){

		        System.out.println(oLinksOnPage.get(i).getText());
		
		 }*/
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		List<WebElement> links=driver.findElements(By.xpath("/a[@class='event_menu_item_desktop']/html/body/div[4]/div[1]/section[2]/div/header/div/div[3]/nav/div/div/ul[1]/li[2]/div/div/div[1]"));
        System.out.println("no of links:" +links.size());

        for(int i=0;i<links.size();i++)
        {
            if(!(links.get(i).getText().isEmpty()))
            {
            links.get(i).click();
            driver.navigate().back();
            links=driver.findElements(By.xpath("/a[@class='event_menu_item_desktop']/html/body/div[4]/div[1]/section[2]/div/header/div/div[3]/nav/div/div/ul[1]/li[2]/div/div/div[1]"));
            }       
        }

	 
	}
	/*@Test(priority=3)
	public void categories() 
	{
		driver.findElement(By.id("left-menu-a11")).click();
		driver.findElement(By.cssSelector("#left-menu-ul11 > li:nth-child(1) > a:nth-child(1)")).click();
		
		
	}*/
	
}

