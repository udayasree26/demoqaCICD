package DemoQA;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Demoqa;

public class DemoqaCheckbox {
	
	WebDriver driver;
	WebDriverWait wait;
	Demoqa qa;
	
	
	@BeforeTest
	public void login() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void logout() {
		driver.quit();
	}
	
	@Test
	 void selectcheckbox() throws InterruptedException {
		qa=new Demoqa(driver);
		qa.checkboxsel();
		System.out.println("checkbox test case is passed");
		Thread.sleep(10);

}
}
