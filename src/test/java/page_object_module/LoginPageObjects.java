package page_object_module;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//import resources.Base_class;

public class LoginPageObjects {


	public static WebDriver driver;
	private By username = By.name("username");
	private By Password = By.name("password");
	private By loginButton=By.xpath("//button[@type='submit']");
	private By myinfo = By.xpath("(//a[@class='oxd-main-menu-item'])[1]");
	
	public  LoginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement enterUsername() {
		return driver.findElement(username);
		
		}
	public WebElement enterpassword() {
		return driver.findElement(Password);
		
	}
	public WebElement clickLogin() {
		// TODO Auto-generated method stub
		return driver.findElement(loginButton);
	}
	public WebElement adminclick() {
		return driver.findElement(myinfo);
		
	}

}





