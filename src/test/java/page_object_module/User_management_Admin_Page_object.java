package page_object_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class User_management_Admin_Page_object {
	// page object module
	public static WebDriver driver;
	private By addButton = By.xpath("(//button[@type='button'])[5]");
	private By  selectD1 = By.xpath("(//div[@class='oxd-select-text--after'])[1]");
	
	
	
	
	
	public User_management_Admin_Page_object (WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement Addclick() {
		return driver.findElement(addButton);
		
		}
	public WebElement selectDclick() {
		return driver.findElement(selectD1);
	}	


//	public  void adminViaDropDown() {
//        Select drop = new Select(driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")));
//        drop.selectByVisibleText("Admin").click();
//	}
}
