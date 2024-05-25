package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
	public WebDriver driver;
public void  driverInitialize() throws InterruptedException, IOException {
	
	FileInputStream fis= new FileInputStream("D:\\java\\OrangeHRM_Projectg\\src\\main\\java\\resources\\data.properties");
	
	Properties prop = new Properties();
	prop.load(fis);
	String browsername= prop.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("chrome")) {
	
	driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(3000);
    driver.manage().window().maximize();
	}
	
	else if(browsername.equalsIgnoreCase("edge")){
		
	    driver = new EdgeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	}
	
else if(browsername.equalsIgnoreCase("firefox")){
		
	    driver = new FirefoxDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	}
	else {
		System.out.println("Please check y have correct browser");
	}
}
}