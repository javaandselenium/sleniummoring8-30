package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//driver.findElement(By.linkText("Forgotten password?")).click();
	driver.findElement(By.partialLinkText("password?")).click();
	Thread.sleep(3000);
	driver.close();
	}

}
