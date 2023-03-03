package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;

	public LoginPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/nav/div/ul/li[3]/a")
	@CacheLookup
	WebElement logoutBtn;
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void enterUsername(String email) {
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	
	public void clickLogOut() {
		logoutBtn.click();
	}
	
	
	
	
	
}
