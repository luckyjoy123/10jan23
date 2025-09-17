package com.Seleniumpractice;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

 
      //learntocode_searchicon
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");
        
        //driver.findElement(By.name("username")).sendKeys("Admin");
        
        //driver.findElement(By.name("password")).sendKeys("admin123");
        
        Actions act=new Actions(driver);
        
      //  act.moveToElement(driver.findElement(By.id("nav-link-accountList")))
        
        //act.doubleClick(driver.findElement(By.id("nav-link-accountList")))
        
        //act.contextClick(driver.findElement(By.id("nav-link-accountList")))
     
        
       // .perform();
        
        
        
       act.doubleClick(driver.findElement(By.xpath("//span[@class='nav-action-inner']"))).perform();
        
       
        
        Thread.sleep(8000);
        
        driver.quit();
       
        
        

	}

}
