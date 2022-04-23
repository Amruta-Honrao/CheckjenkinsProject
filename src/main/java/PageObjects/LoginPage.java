package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	//locators:
	
	public By LoginLink= By.xpath("//a[text()='Log in']");
	By Email= By.id("Email");
	By Password = By.id("Password");
	By LoginButton = By.xpath("//input[@value='Log in' and @type='submit']");
	public By logoutbutton = By.xpath("//a[text()='Log out']");
	
	
	public LoginPage(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	public boolean dologin()
	{		
		driver.findElement(LoginLink).click();
		driver.findElement(Email).sendKeys("90test@test.com");
		driver.findElement(Password).sendKeys("testing");
		driver.findElement(LoginButton).click();
		return driver.findElement(logoutbutton).isDisplayed();
		
	}

}
