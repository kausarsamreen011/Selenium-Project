package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Chrome 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rameezraja\\Desktop\\Selenium jar\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://spicejet.com/");
	    driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
	    driver.findElement(By.xpath("//a[@value='BLR']")).click();
	    driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	    //driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[2]/li[12]/a")).click();
	    
	    //driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_friendsandfamily']")).click();
	    //System.out.println(driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
	    driver.findElement(By.xpath("//input[@type='checkbox']"));
	    System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());
	}

}
