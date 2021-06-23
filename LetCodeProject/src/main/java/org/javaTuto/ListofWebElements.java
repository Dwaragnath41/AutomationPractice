package org.javaTuto;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ListofWebElements {

	@Test
	public void ElementList() {
		
		RemoteWebDriver letcode = new ChromeDriver();
		
		letcode.get("https://letcode.in/edit");
		
		letcode.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> titles = letcode.findElementsByTagName("label");
		
		for (WebElement ele : titles) {
			
			String word = ele.getText();
			
			System.out.println(word);
			
		}
		
		
		letcode.quit();
		
		
		
		
	}
	
	
}
