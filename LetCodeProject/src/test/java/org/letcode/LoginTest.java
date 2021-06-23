package org.letcode;

import org.letcode.base.BasePage;
import org.letcode.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {
	
	
	@Test
	public void loginTest() {
		
		new LoginPage(driver)
		.enterUserName("admin")
		.enterPassword("Integral_29")
		.clickLogin();
		
		
		
	}

}
