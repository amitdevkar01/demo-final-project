package page_object_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Personal_2_Details_POM {

	public WebDriver driver;
	private By pers = By.xpath("//a[@class=\"orangehrm-tabs-item --active\"]");
	private By first = By.xpath("//input[@name=\"firstName\"]");
	private By middle = By.xpath("//input[@name=\"middleName\"]");
	private By last =By.xpath("//input[@name=\"lastName\"]");
	private By Eid = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
	private By othEid = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]");
	private By Dl = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[4]");
	private By licExp = By.xpath("(//i[@class=\"oxd-icon bi-calendar oxd-date-input-icon\"])[1]");
//	private By info1 = By.xpath("//a[@class=\"oxd-main-menu-item active\"]");

	public Personal_2_Details_POM(WebDriver driver2) {
	this.driver=driver2;
	}
	public WebElement Personal_info() {
		return driver.findElement(pers);	
	}
	
	public WebElement FirstNameclick() {
		return driver.findElement(first);
		}
	
	public WebElement MiddleNameclick() {
		return driver.findElement(middle);
		
	}
	public WebElement SurNameclick() {
		return driver.findElement(last);
	}
	public WebElement EmpIdclick() {
		return driver.findElement(Eid);
		
	}
	public WebElement OthIdclick() {
		return driver.findElement(othEid);
		
	}
	public WebElement Drivingclick() {
		return driver.findElement(Dl);
		
	}
	public WebElement LicencExpyclick() {
		return driver.findElement(licExp);
		
	}
		
	}
