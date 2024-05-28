package page_object_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class User_management_Admin_Page_object {
	// page object module
	public static WebDriver driver;
	private By addButton = By.xpath("(//button[@type='button'])[5]");
//	private By  selectD1 = By.xpath("(//div[@class='oxd-select-text--after'])[1]");
	private By  Empname = By.xpath("//input[@placeholder=\"Type for hints...\"]");
	private By use_1 = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
    private By pass_1 =By.xpath("(//input[@type=\"password\"])[1]");
    private By pass_2 =By.xpath("(//input[@type=\"password\"])[2]");
    private By save_1= By.xpath("//button[@type=\"submit\"]");
    private By cancel_1 = By.xpath("(//button[@class=\"oxd-button oxd-button--medium oxd-button--ghost\"])[1]");
    

	
	
	
	public User_management_Admin_Page_object (WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement Addclick() {
		return driver.findElement(addButton);
		
		}
//	public WebElement selectDclick() {
//		return driver.findElement(selectD1);
//	}
	public WebElement empclick() {
		return driver.findElement(Empname);
	}
	
	public WebElement Nameclick() {
		// TODO Auto-generated method stub
		return driver.findElement(use_1);
	}
	public WebElement Pass_1click() {
		return driver.findElement(pass_1);
		
	}
	public WebElement Pass_2click() {
		return driver.findElement(pass_2);
	}
	public WebElement Saveclick() {
		return driver.findElement(save_1);
	}
	public WebElement Cancelclick() {
        return driver.findElement(cancel_1)	;	
	}
	
      
       		
	
	

//	public  void adminViaDropDown() {
//        Select drop = new Select(driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")));
//        drop.selectByVisibleText("Admin").click();
//	}
}
