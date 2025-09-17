package com.Seleniumpractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testlibaries {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        
	}

}
