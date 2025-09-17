package testng;

import static org.testng.Assert.assertEquals;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent {
	 WebDriver driver ;
	 
	 public static ExtentReports extentreport;
	 
	 public static ExtentTest extentreports;
	 
	
	 
	 
	 @BeforeSuite 
	 public void initialreport() {
		 
		 ExtentSparkReporter sparkreport = new ExtentSparkReporter("lltest.html");
		 extentreport =new ExtentReports();
		 
		 extentreport.attachReporter(sparkreport);
		 
		 
	 }
	 
	 @AfterSuite
	 public void generatereport() throws IOException {
		 
		 extentreport.flush();
		 
		 Desktop.getDesktop().browse(new File("lltest.html").toURI());
		 
	 }
	 
	 
	 
	@BeforeTest
	
	public  void open(ITestContext context) {
		

		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		extentreports = extentreport.createTest(context.getName());
		
	}
	
	
	@AfterTest
	
	public  void close() {
		
		driver.quit();
	}
	
	@Test

    public  void test() throws InterruptedException {
    	
		
		driver.get("https://www.google.com/");
		
		extentreports.info("navigated to url");
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
	
	


