package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(id="email")
	private WebElement emailaddresstb;
	
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void email(String us) {
		emailaddresstb.sendKeys(us);
	}

}
