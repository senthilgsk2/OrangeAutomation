package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
		
	 @FindBy(xpath="//*[@id='txtUsername']") 
	 WebElement username;
	 @FindBy(xpath="//*[@id='txtPassword']")
	 WebElement password;
	 @FindBy(xpath="//*[@id='btnLogin']")
	 WebElement subBtn;
	
	 
	 public LoginPage(WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver, this);	 
	 }
	 
	 public void login(String username1,String password1) {
		 
		 username.sendKeys(username1);
		 password.sendKeys(password1);
		 subBtn.click();
		
		 
		 
	 }

}
