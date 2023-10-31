package testScripts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountsOverview;
import pages.ValidLogin;

public class AccountOpening extends BaseTest {
	
	ValidLogin login;
	AccountsOverview accountoverview;
	
	
	@BeforeTest
	public void setUp() {
		initialize();
	}
	
	@Test
	public void loginPage() throws InterruptedException {
		login = new ValidLogin();
		login.enterUsername("username");
		login.enterPassword("password");
		login.logginIn();
	}
	
	@Test
	public void accountOverview() throws InterruptedException {
		accountoverview = new AccountsOverview();
		Thread.sleep(5000);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 * wait.until(ExpectedConditions());
		 */
//		accountoverview.accountOverviewDisplayed();
		accountoverview.clickAccountNumber();
		
	}

}
