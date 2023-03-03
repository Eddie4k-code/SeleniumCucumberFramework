package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Scenario;
import utils.CommonFunctions;

public class AddCustomerPage extends CommonFunctions {
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/i")
	@CacheLookup
	WebElement customerPanelBtn;
	
	
	@FindBy(xpath="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")
	@CacheLookup
	WebElement customersBtn;
	
	@FindBy(xpath="/html/body/div[3]/nav/ul/li/a/i")
	@CacheLookup
	WebElement sidePanelBtn;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/form[1]/div/div/a")
	@CacheLookup
	WebElement addNewCustomerBtn;
	
	@FindBy(xpath="fweweifhhfiopewriheofw")
	WebElement emailEntry;
	
	
	
	public WebDriver driver;

	public AddCustomerPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	public void clickCustomersPanel() {
		//Clicks "Customers" drop down 
		waitForElementToAppear(customerPanelBtn, "Customers Panel Button");
		customerPanelBtn.click();
	}
	
	public void clickCustomerBtn() {
		// Clicks "Customer" Button under "Customers" dropdown
		waitForElementToAppear(customersBtn, "Customer Button");
		customersBtn.click();
	}
	
	
	public void clickAddNewCustomerBtn() {
		//Clicks "Add New" button to add new customer
		
		waitForElementToAppear(addNewCustomerBtn, "Add New");
		addNewCustomerBtn.click();
	}
	
	public void enterEmail(String email, Scenario s) {
		
		try {
			
		
		waitForElementToAppear(emailEntry, "Email Entry");
		emailEntry.click();
		} catch(Exception e) {
			s.log(e.getLocalizedMessage());
		}
		}
		
	
	
	
	

}
