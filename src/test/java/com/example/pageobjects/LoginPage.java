package com.example.pageobjects;

import com.example.setup.SeleniumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Page object representing github login page.
 */
public class LoginPage extends AbstractPage {



	@FindBy(name = "userName")
	WebElement loginField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(name = "login")
	WebElement loginButton;

	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")
	WebElement errorBox;


	public LoginPage() throws Exception {
		PageFactory.initElements(SeleniumDriver.getDriver(), this);
	}

	public void login(String login, String password) {
		loginField.sendKeys(login);
		passwordField.sendKeys(password);
		loginButton.click();
	}

	public boolean isSignOnDisplayed() {
		return errorBox.isDisplayed();
	}


}
