package com.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        
        //ALert box
        Thread.sleep(3000);
        
       // driver.findElement(By.id("alertBox")).click();
        Thread.sleep(3000);
        
        // hi ray
        

        
       // System.out.println( driver.switchTo().alert().getText());
        
       // driver.switchTo().alert().accept();
        
        //confirm 
        
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(3000);
        

        
        System.out.println( driver.switchTo().alert().getText());
        
        driver.switchTo().alert().accept();
        
        Thread.sleep(3000);
     
        
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(3000);
        

        
        System.out.println( driver.switchTo().alert().getText());
        
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);
        
        
        
        driver.quit();
        
        
        
	}

}
