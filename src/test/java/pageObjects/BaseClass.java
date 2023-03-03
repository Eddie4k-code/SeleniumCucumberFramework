package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class BaseClass {
	 public static WebDriver driver;
	 public LoginPage lp;
	 public AddCustomerPage acp;
	 
	 
	 
	 
	 
	 public class ChromeDriverFactory {
		 //Creates the webdriver
		 public WebDriver createWebDriver() {
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/Chromedriver.exe");
		        ChromeOptions options = new ChromeOptions();
		        options.addArguments("--start-maximized");
		        return new ChromeDriver(options);
		 }
	 }
	 
	 
}
