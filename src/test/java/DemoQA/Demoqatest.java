package DemoQA;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import pages.Demoqa;

public class Demoqatest {
	WebDriver driver;
	WebDriverWait wait;
	Demoqa qa;
	
	
	@BeforeTest
	public void login() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void logout() {
		driver.quit();
	}
	
	@Test
	 void Enterfields() throws InterruptedException {
		qa=new Demoqa(driver);
		qa.username("ken");
		Thread.sleep(3);
		qa.useremail("ken@gmail.com");
		Thread.sleep(3);
		qa.currentaddress("Hyderabad");
		Thread.sleep(3);
		qa.permanentaddress("Hyderabad");
		Thread.sleep(3);
		qa.submitbtn();
		Thread.sleep(10);
		
	}
	

}
