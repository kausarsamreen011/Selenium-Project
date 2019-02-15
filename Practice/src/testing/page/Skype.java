package testing.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Skype
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rameezraja\\Desktop\\Selenium jar\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.skype.com/en/");
		driver.findElement(By.id("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1516293471&rver=7.0.6730.0&wp=MBI_SSL&wreply=https%3A%2F%2Flw.skype.com%2Flogin%2Foauth%2Fproxy%3Fclient_id%3D360605%26redirect_uri%3Dhttps%253A%252F%252Fsecure.skype.com%252Fportal%252Flogin%253Freturn_url%253Dhttps%25253A%25252F%25252Fsecure.skype.com%25252Fportal%25252Foverview%26response_type%3Dpostgrant%26state%3D0JKkeSZqyacF%26site_name%3Dlw.skype.com&lc=1033&id=293290&mkt=en-IN&uaid=2e5e1229bdf96694ccfe2ee669d7eb27&psi=skype&lw=1&cobrandid=90010&client_flight=hsu%2CReservedFlight33%2CReservedFlight67")).sendKeys(Keys.CONTROL);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	

}
