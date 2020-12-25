package pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
public class LoginPage {
	
	WebDriver driver;
	
		
	 @FindBy(xpath="//*[@id='txtUsername']") 
	 WebElement username;
	 @FindBy(xpath="//*[@id='txtPassword']")
	 WebElement password;
	 @FindBy(xpath="//*[@id='btnLogin']")
	 WebElement subBtn;
	 @FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	 WebElement admin3;
	 @FindBy(xpath="//*[@id=\"searchSystemUser_userName\"]")
	 WebElement usernam;
	 @FindBy(xpath="//input[@id='searchSystemUser_employeeName_empName']")
	 WebElement EmployeeName;
	 @FindBy(xpath="//input[@id='searchBtn']")
	 WebElement search;
	 @FindBy(xpath="//input[@id='ohrmList_chkSelectRecord_31']")
	 WebElement checkbox;
	 @FindBy(xpath="//input[@id='btnAdd']")
	 WebElement add;
	 
	 
	
	 
	 public LoginPage(WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver, this);	 
	 }
	 
	 public void 
	 
	 login(String username1,String password1,String name1,String EmployeeName1)   
	 
	 
	 {
		 username.sendKeys(username1);
		 password.sendKeys(password1);
		 subBtn.click();
		 admin3.click();
		 usernam.sendKeys(name1);
		 EmployeeName.sendKeys(EmployeeName1);
		 search.click();
		 checkbox.click();
		 add.click();
		 
		
		 
		 
	 }

}
