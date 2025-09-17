package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	
	@Test(dataProvider = "data")
	
	public void data(String username,String password) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	
	driver.findElement(By.name("username")).sendKeys(username);
	
	driver.findElement(By.name("password")).sendKeys(password);
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	System.out.println(driver.getTitle());
	
	Thread.sleep(5000);
	driver.quit();

}
	
	@DataProvider (name="data")
	public  Object[][] dataset() {
		
		Object[][] obj= new Object[2][2];
		
		obj[0][0]="Admin";
		
		obj[0][1]="admin123";
		
        obj[1][0]="Admin";
		
		obj[1][1]="dmin123";
		
		return obj;
		
	}
	
	
}
