package page_object_module;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_TestProvider {
	@Test
	public void TestLogin(String username,String password) {
		
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}
	@DataProvider(name ="loginTestData")
	public Object logindata() {
		Object[][] data =new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "Admin";
		data[1][1] ="test456";
		
		return data;
		
	}
	
		
	
	

}
