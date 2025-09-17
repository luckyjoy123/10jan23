package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	 WebDriver driver ;
	
	@BeforeTest
	
	public  void open() {
		

		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
	}
	
	
	@AfterTest
	
	public  void close() {
		
		driver.quit();
	}
	
	@Test

    public  void test() throws InterruptedException {
    	
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("hYR Tutorials",Keys.ENTER);
		
		String actual="HYRRRR";
		
		 String expected= driver.getTitle();
		
		Thread.sleep(3000);
		
	  assertEquals(actual, expected, "this is failed");
		
	
		
		
    }
	
	@Test
	
	  public  void test1() throws InterruptedException {
    	
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("hYR Tutorials",Keys.ENTER);
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		

		
		
    }
	
	
	@Test

    public void test3() throws InterruptedException {
    	
		
		driver.get("https://www.tpointtech.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("search")).sendKeys("java");
		
		driver.findElement(By.xpath("//td[@class='gsc-search-button']")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		

		
		
    }
	
}
	
	


