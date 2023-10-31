package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class ValidLogin extends BaseTest {
	
	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement logIn;

	public ValidLogin() {
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String strUser) {
		userName.sendKeys(strUser);
	}
	
	public void enterPassword(String strPwd) {
		password.sendKeys(strPwd);
	}
	
	public void logginIn() {
		logIn.click();
	}

}
