package personaldetailsinfo2;

import java.io.IOException;
import page_object_module.*;

import resources.Base_class;

public class Employeecontactdetailse2 extends Base_class {
	
	 public void verify_fields_editable2() throws InterruptedException, IOException {
		 driverInitialize();
		 Thread.sleep(3000);

		 
		 LoginPageObjects lpo2 =new LoginPageObjects(driver);
		 lpo2.enterUsername().sendKeys("Admin");
		 
		 
		 
		 Thread.sleep(3000);
		 lpo2.enterpassword().sendKeys("admin123");

		 Thread.sleep(3000);
		 
}
}