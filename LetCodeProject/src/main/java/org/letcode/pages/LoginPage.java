package org.letcode.pages;

import org.letcode.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage {

	public LoginPage(RemoteWebDriver driver) {

		this.driver = driver;

	}

	public LoginPage enterUserName(String username) {

		//driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys(username);

		return this;

	}

	public LoginPage enterPassword(String password) {

		driver.findElement(By.id("user_password")).sendKeys(password);

		return this;
	}

	public LoginPage selectLanguage(String lang) {

		WebElement languageDD = driver.findElement(By.id("language_select"));
		new Select(languageDD).selectByVisibleText(lang);

		return this;

	}

	public DashBoardPage clickLogin() {

		driver.findElement(By.id("sysverb_login")).click();

		return new DashBoardPage();
	}

	public ForgotPasswordPage clickForgotPassword() {

		driver.findElement(By.linkText("Forgot Password ?")).click();

		return new ForgotPasswordPage();

	}

	public void loginFeature(String user, String pass) {

		//driver.switchTo().frame(0);
		enterUserName(user);
		enterPassword(pass);
		clickLogin();

	}

}
