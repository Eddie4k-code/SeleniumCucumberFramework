package utils;



import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pageObjects.BaseClass;

public class CommonFunctions extends BaseClass {
	
	public void waitForElementToAppear(WebElement element, String elementName) {
		// Waits until element is appearing.
	    WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	    
	    wait.until(ExpectedConditions.visibilityOf(element));
	}
	

}
