package com.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DRopdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com/communication-preferences/push?t=all");
        
        Actions act =new Actions(driver);
        
        
        act.doubleClick(driver.findElement(By.xpath("//div[text()='More']"))).perform();
        

        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//div[text()='Advertise']")).click();
    
      driver.quit();
	}

}
