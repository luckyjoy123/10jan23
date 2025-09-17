package com.Seleniumpractice;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pageloadtimeout {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

  //setting time for page load

      driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
        
        Instant start = Instant.now();
        
        System.out.println(start);
        
        driver.get("https://www.w3schools.com/");
        
        Instant end = Instant.now();
        
        System.out.println(end);
        
      Duration d =  Duration.between(start, end);
      
      System.out.println(d.toSeconds());
      
      driver.quit();
      
      
        
        
        

	}

}
