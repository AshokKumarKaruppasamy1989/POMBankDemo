package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class AccountsOverview extends BaseTest {
	
	@FindBy(css = "div h1")
	WebElement accountOverview;
	
	@FindBy(xpath = "//a[@class='ng-binding']")
	WebElement accountNumber;
	
	@FindBy(linkText = "19782")
	WebElement accountNumber1;
	
	public AccountsOverview() {
		PageFactory.initElements(driver, this);
	}
	
	public void accountOverviewDisplayed() {
		accountOverview.isDisplayed();
	}
	
//	public void clickAccountNumber() {
//		accountNumber.click();
//	}
	
	public void clickAccountNumber() {
		accountNumber1.click();
	}

}
