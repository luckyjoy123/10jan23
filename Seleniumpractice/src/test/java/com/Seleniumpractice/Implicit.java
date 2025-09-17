package com.Seleniumpractice;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

 
      //learntocode_searchicon
        driver.manage().window().maximize();
        
        
        driver.get("https://www.w3schools.com/");
        
        driver.findElement(By.id("search2")).sendKeys("hello");
        
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        
        driver.findElement(By.id("learntocode_searchico")).click();
        
        
        
        

	}

}
