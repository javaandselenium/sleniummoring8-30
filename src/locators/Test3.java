package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
driver.findElement(By.cssSelector("input[id='password']")).sendKeys("admin");	
driver.findElement(By.cssSelector("button[class='button buttonBlue']")).click();	
	}

}
