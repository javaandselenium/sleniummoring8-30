package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Actitime {
	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		LoginPage  l=new LoginPage(driver);
		l.loginbutton();
		l.usernametxtbox("user");
		l.passwordtxtbox("user");
		l.sumbitButton();
	}

}
