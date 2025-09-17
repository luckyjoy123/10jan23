package BDDCucumberpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {
	
	public class Testlibaries {

		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			
			// TODO Auto-generated method stub
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://admin-demo.nopcommerce.com/login");
	        
	        
	        driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	        
	        driver.findElement(By.id("Password")).sendKeys("admin");
	        
	        driver.findElement(By.xpath("//button[text()='Log in']")).click();
	        
	        driver.findElement(By.xpath("//a[text()='Logout']")).click();
	        
		}
		
		
		
		
		

	}


}
