package com.Seleniumpractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowshandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        
        Thread.sleep(3000);
        
        String parentwindow =driver.getWindowHandle();
        
        System.out.println("paent vindow"+parentwindow);
        
        driver.findElement(By.id("newWindowBtn")).click();
        
      Set<String> windowhandles= driver.getWindowHandles();
        
        for(String s:windowhandles) {
        	driver.switchTo().window(s);
        }
        driver.manage().window().maximize();
        driver.findElement(By.id("firstName")).sendKeys("Hi");
        Thread.sleep(3000);
        driver.close();
        
        driver.switchTo().window(parentwindow);
        
        driver.findElement(By.id("newTabBtn")).click();
        
        Set<String> windows =driver.getWindowHandles();
        for (String x :windows) {
        
       driver.switchTo().window(x);
       
       driver.manage().window().maximize();
       driver.findElement(By.id("alertBox")).click();
       
       Thread.sleep(3000);
       driver.close();
       
        }
        driver.switchTo().window(parentwindow);
        driver.findElement(By.id("name")).sendKeys("joys");
        
        Thread.sleep(3000);
        driver.quit();
       
	}

}
