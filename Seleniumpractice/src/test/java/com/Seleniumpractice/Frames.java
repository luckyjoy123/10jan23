package com.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        Thread.sleep(3000);
        
    
        
       // System.out.println(driver.getPageSource());
        
      /*  Thread.sleep(3000);
        
       driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/div[1]/div/form/input")).sendKeys("java");
       
       Thread.sleep(3000)
       
       //driver.findElement(By.id("learntocode_searchbtn")).click();
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/div[2]/div/div[1]/a[1]")).click();
       Thread.sleep(3000);
       
       driver.navigate().back();
       
       Thread.sleep(3000);
       driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/div[2]/div/div[2]/div/a")).click();
       Thread.sleep(3000);
        
        driver.switchTo().frame("moneyiframe");
        Thread.sleep(3000);
        
        driver.findElement(By.id("query")).sendKeys("123");  
        
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/a[4]")).click();
        Thread.sleep(3000);
        
        driver.switchTo().frame("moneyiframe");
        Thread.sleep(3000);*/
      // Nested frames
        
        driver.findElement(By.id("name")).sendKeys("123");  
        
        Thread.sleep(3000);
        driver.switchTo().frame("frm3");
        Thread.sleep(3000);
        
        driver.switchTo().frame("frm2");
        Thread.sleep(3000);
        
        driver.findElement(By.id("firstName")).sendKeys("xyx");
        Thread.sleep(3000);
        driver.switchTo().parentFrame();
        
        driver.switchTo().frame("frm1");
        Thread.sleep(3000);
        WebElement look = driver.findElement(By.id("course"));
        Select course = new Select(look);
        
        course.selectByValue("java");
        Thread.sleep(3000);
        
       
       
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        
        driver.findElement(By.id("name")).clear();
        
        driver.findElement(By.id("name")).sendKeys("germany");
        
        Thread.sleep(3000);
        
        driver.quit();
        
	}

}
