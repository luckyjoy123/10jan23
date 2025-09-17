package com.Seleniumpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshort {

	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        ///////driver.get("https://www.w3schools.com/");
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        
        //file with chromedriver 
        
       //  File sourcefile= driver.getScreenshotAs(OutputType.FILE);
     //   File targetfile= new File("C:/Users/Lakshman/eclipse-workspace/java/Seleniumpractice/Screenshot/img.jpg");
        
      //  FileUtils.copyFile(sourcefile, targetfile);
      //  System.out.println("success");
        
        //file with webdriver
        TakesScreenshot screen= (TakesScreenshot) driver;
      File sourcefile= screen.getScreenshotAs(OutputType.FILE);
      
      
        
        File targetfile= new File("C:/Users/Lakshman/eclipse-workspace/java/Seleniumpractice/Screenshot/img.jpg");
        
        FileUtils.copyFile(sourcefile, targetfile);
        System.out.println("success");
   
        
        driver.quit();

	}

}
