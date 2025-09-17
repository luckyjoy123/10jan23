package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	WebDriver driver
	
	 =new ChromeDriver();
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
	@Test
	
	public void capture(String fileName ) throws IOException, InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver
		
		 =new ChromeDriver();
		
		driver.get("https://www.tpointtech.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("search")).sendKeys("java");
		
		driver.findElement(By.xpath("//td[@class='gsc-search-button']")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		
		TakesScreenshot take = (TakesScreenshot) driver;
		
		File sourcefile = take.getScreenshotAs(OutputType.FILE);
		
		File targetfile= new File("C:/Users/Lakshman/eclipse-workspace/java/Seleniumpractice/Screenshot/img1.jpg");
		
		FileUtils.copyFile(sourcefile, targetfile);
		
		driver.quit();
	
}
	
	



}
