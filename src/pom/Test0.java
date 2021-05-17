package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test0 {
	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//WebElement ele = driver.findElement(By.id("email"));
		Login l=new Login(driver);
		driver.navigate().refresh();
		//ele.sendKeys("jgjhgjhgj");
		l.email("gfghfgshgfh");
	}

}
