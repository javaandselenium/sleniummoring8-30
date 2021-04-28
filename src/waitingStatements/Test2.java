package waitingStatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("arjun1791994@gmail.com");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("April@2021");
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
String t = driver.getTitle();
System.out.println(t);

	}

}
