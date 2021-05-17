package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(linkText="LOGIN")
	private WebElement loginbtn;
	
	@FindBy(id="email")
	private WebElement usnametb;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordtb;
	
	@FindBy(id="last")
	private WebElement sumbitBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void loginbutton() {
		loginbtn.click();
	}
	
	public void usernametxtbox(String email) {
		usnametb.sendKeys(email);
	}
	
	public void passwordtxtbox(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void sumbitButton() {
		sumbitBtn.click();
		
	}
	

}
