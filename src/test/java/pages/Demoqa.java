package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoqa {
	
	WebDriver driver;
	
	public Demoqa(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="userName")
	WebElement username;
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="currentAddress")
	WebElement currentAddress;
	
	@FindBy(id="permanentAddress")
	WebElement permanentAddress;
	
	@FindBy(id="submit")
	WebElement submit;
	
	@FindBy(xpath="//span[@role='checkbox']")
	WebElement checkbox;
	
	public void username(String user) {
		username.sendKeys(user);
	}
	
	public void useremail(String email) {
		userEmail.sendKeys(email);
	}
	
	public void currentaddress(String current) {
		currentAddress.sendKeys(current);
	}
	
	public void permanentaddress(String permanent) {
		permanentAddress.sendKeys(permanent);
	}
	
	public void submitbtn() {
		submit.click();
	}
	
	public void checkboxsel() {
		checkbox.click();
	}

}
