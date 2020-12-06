package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class TC01_Login {
	WebDriver driver;
	
	@BeforeMethod
	public void LaunchBorswer() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Fitaomr3\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void logintest() {
		LoginPage obj = new LoginPage(driver);
		obj.login("Admin", "admin123");
	}

}
