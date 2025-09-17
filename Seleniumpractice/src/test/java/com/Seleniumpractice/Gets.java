package com.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

 
      //learntocode_searchicon
        driver.manage().window().maximize();
        
        
        // tag name // get attribute name // get text // css value
        
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        
       String s=  driver.findElement(By.xpath("//label[@class='inp']")).getText();
       
       System.out.println(s);
       
       System.out.println(driver.findElement(By.id("firstName")).getTagName());
       
       driver.findElement(By.id("firstName")).sendKeys("Lucy");
       
       System.out.println(driver.findElement(By.id("firstName")).getAttribute("value"));
       
       System.out.println(driver.findElement(By.id("navigateHome")).getCssValue("background-color"));
       
       driver.quit();
        
        

	}

}
