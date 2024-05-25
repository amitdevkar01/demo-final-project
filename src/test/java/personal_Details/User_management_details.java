package personal_Details;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import page_object_module.LoginPageObjects;
import page_object_module.User_management_Admin_Page_object;
import resources.Base_class;

public class User_management_details  extends Base_class{
//	private WebElement selectD1;

	@Test
      public void verifyfieldEditable() throws InterruptedException, IOException {
    	driverInitialize();
  	    Thread.sleep(3000);

  		LoginPageObjects lpo = new LoginPageObjects(driver);
  		
  		lpo.enterUsername().sendKeys("Admin");
  		Thread.sleep(3000);
  		
  		lpo.enterpassword().sendKeys("admin123");
  		
  		lpo.clickLogin().click();
  		Thread.sleep(3000);
  		  		
  		lpo.adminclick().click();
  		Thread.sleep(3000);
  		
  		//User manegementAdmin object created
  		User_management_Admin_Page_object ump=new User_management_Admin_Page_object(driver);
  		ump.Addclick().click();;
  		Thread.sleep(2000);
//  		ump.selectDclick().click();
  		
  		
  		ump.selectDclick();
		
	    
	  }
		
       
      }

	
	
	

