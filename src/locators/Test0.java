package locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
driver.findElement(By.id("username")).sendKeys("qwertyoiuo");
driver.findElement(By.name("pwd")).sendKeys("ghfgagh");
	}

}
