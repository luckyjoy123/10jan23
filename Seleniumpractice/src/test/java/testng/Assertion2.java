package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion2 {
	@Test

    public static void test() throws InterruptedException {
    	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		SoftAssert sassert =new SoftAssert();
		
	   String s= driver.findElement(By.xpath("//a[@class='gb_X']")).getText();	
		String expectedtxt ="Gmail";
		
		String  actualtest = s;
		
		Assert.assertEquals(actualtest,expectedtxt,"gmail is matched");
		
		//asser2
		
		
		   String d= driver.findElement(By.xpath("//div[@class='gb_Z gb_0']//a[@aria-label='Search for Images ']")).getText();	
			String expectedtxt1 ="Image";
			
			String  actualtest1 = d;
			
			sassert.assertNotEquals(actualtest1,expectedtxt1,"Images is matche");
			
		///assert
			
			   String f= driver.findElement(By.xpath("//a[text()='Store']")).getText();	
				String expectedtxt2 ="Store";
				
				String  actualtest2 = f;
				
				Assert.assertEquals(actualtest2,expectedtxt2," store is matched");
				
		
		
		//Assert.assertt();
		
		Thread.sleep(3000);
		
		
		
		
				driver.quit();
				
				sassert.assertAll();
		
       
		
		
    }
}
