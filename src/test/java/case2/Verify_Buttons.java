package case2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import page_object_module.LoginPageObjects;
import resources.Base_class;

public class Verify_Buttons  extends Base_class{
	
		@Test
		public void verifyLoginButton() throws InterruptedException, IOException {
	    driverInitialize();
	    Thread.sleep(3000);

		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.enterUsername().sendKeys("Admin");
		Thread.sleep(3000);
		
		lpo.enterpassword().sendKeys("admin123");
		
		lpo.clickLogin().click();
//		Thread.sleep(3000);
		
//		lpo.clickinfo().click();
		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		Thread.sleep(3000);
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String pageTitle= driver.getTitle();
		if(pageTitle .equals("OrangeHRM")) {
			System.out.println("Succesfully login");
		}
		else
		{
			System.out.println("Failed");
		}

		}

	}


