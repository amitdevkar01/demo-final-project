package personal_Details;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import page_object_module.LoginPageObjects;
import page_object_module.Personal_2_Details_POM;
import resources.Base_class;

public class Personal_Details_1 extends Base_class {
        @Test
	  public void verify_field() throws InterruptedException, IOException {
		  driverInitialize();
		  
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
	  		LoginPageObjects lpo = new LoginPageObjects(driver);

			lpo.enterUsername().sendKeys("Admin");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  		
	  		lpo.enterpassword().sendKeys("admin123");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  		lpo.clickLogin().click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  		lpo.Myinfoclick().click(); 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  		
			Personal_2_Details_POM pdp = new Personal_2_Details_POM(driver);
		 pdp.Personal_info().click();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Thread.sleep(3000);
		 pdp.FirstNameclick().click();
		 pdp.FirstNameclick().clear();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         pdp.FirstNameclick().sendKeys("Akash");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         pdp.MiddleNameclick().clear();
         pdp.MiddleNameclick().sendKeys("Shubham");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         pdp.SurNameclick().clear();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

         pdp.SurNameclick().sendKeys("sharma");
         Thread.sleep(10000);
//         pdp.EmpIdclick().clear();
         pdp.EmpIdclick().sendKeys("24");
         Thread.sleep(3000);
         pdp.OthIdclick().clear();
         pdp.OthIdclick().sendKeys("100");
         pdp.Drivingclick().clear();
         Thread.sleep(3000);

         pdp.Drivingclick().sendKeys("DL1234567890");
         Thread.sleep(3000);
         pdp.LicencExpyclick().click();

	  }
	  
}
