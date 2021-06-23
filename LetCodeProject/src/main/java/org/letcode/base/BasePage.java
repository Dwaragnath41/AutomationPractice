package org.letcode.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {

	public RemoteWebDriver driver = null;

	String Url = "https://dev115664.service-now.com/login.do";

	@BeforeMethod
	public void launchBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Url);

	}

	@AfterMethod
	public void waterDown() {

		driver.quit();
	}

}
