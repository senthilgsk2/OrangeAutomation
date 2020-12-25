package testcase;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;

public class TC01_Login {
	WebDriver driver;
	
	@BeforeMethod
	public void LaunchBorswer() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\senth\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void logintest() {
		LoginPage obj = new LoginPage(driver);
		obj.login("Admin", "admin123", "Alice.Duval", "Alice Duval");
		Select drop = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		drop.selectByVisibleText("ESS");
		Select drop1 = new Select(driver.findElement(By.id("searchSystemUser_status")));
		drop1.selectByVisibleText("Enabled");
	}

}
