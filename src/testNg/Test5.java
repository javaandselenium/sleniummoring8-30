package testNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test5 {
	public WebDriver driver;
	@Parameters({"browsername"})
	@Test
	public void openApp(String browser) {
		if(browser.equals("chrome")) {
		driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("54655475766");
		driver.findElement(By.id("did_submit")).click();
		Reporter.log(driver.getTitle(),true);
		Reporter.log(driver.getCurrentUrl(),true);
		driver.close();
		
	}

}
