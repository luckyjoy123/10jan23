package com.Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
         driver = new ChromeDriver();
        
       driver.manage().window().maximize();
       
       Chapter2();
        
        
        
        //driver.get("https://www.w3schools.com/");
        Thread.sleep(3000);

	}
	//Xpath
	
	public static void Chapter2() throws InterruptedException {
		
		//driver.get("https://www.w3schools.com/");
		
		//driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav/a[4]")).click();
        Thread.sleep(3000);
        
         //driver.findElement(By.xpath("//a[@id='navbtn_services']")).click();
        // Thread.sleep(3000);
         
        // driver.findElement(By.xpath("//a[@id='navbtn_exercises' or @title='Exercises and Quizzes']")).click();
         //Thread.sleep(3000);
        
      driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
      Thread.sleep(3000); 
      
      //with index
       driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr[2]"));
       Thread.sleep(3000); 
       String d = driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr/td)[22]")).getText();
       System.out.println(d);
       
       ///FUnctions of xpath
       //contains
       String d1 = driver.findElement(By.xpath(" //a[contains(text(),'Sign in')] ")).getText();
       System.out.println(d1);
       Thread.sleep(3000); 
       //text()
       String d3 = driver.findElement(By.xpath(" //a[text()='Sign in']")).getText();
       System.out.println(d3);
       
       //Start-with
       String d4 = driver.findElement(By.xpath(" //a[starts-with(text(),'Sign in into')]")).getText();
       System.out.println(d4);
       //Normalize space
       String d5 = driver.findElement(By.xpath(" //label[normalize-space(text())='First Name']")).getText();
       System.out.println(d5);
       //last 
       String d6 = driver.findElement(By.xpath(" (//table[@id='contactList']/tbody/tr)[last()]")).getText();
       System.out.println(d6);
       //position
       System.out.println(driver.findElement(By.xpath(" (//table[@id='contactList']/tbody/tr)[position()<=2]")).getSize());

       //shortcuts 
       String a = driver.findElement(By.xpath(" //a[.='Sign in']")).getText();
       System.out.println(a);
       
        //text()
       
        driver.quit();
    }
}
