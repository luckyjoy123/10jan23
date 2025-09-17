package com.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

 
      //learntocode_searchicon
        driver.manage().window().maximize();
        
        WebDriverWait  wait= new WebDriverWait(driver, 40);
        
        
        driver.get("https://www.w3schools.com/");
        
        driver.findElement(By.xpath("//a[@title='Login to your account']")).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        
        driver.findElement(By.name("email")).sendKeys("lucy");
        

	}


}
