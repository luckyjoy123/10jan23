package com.Seleniumpractice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) throws InterruptedException, ParseException {
		// TODO Auto-generated method stub
		
		
WebDriverManager.chromedriver().setup();
		
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

 
      //learntocode_searchicon

        driver.manage().window().maximize();
        
       // driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        
        int day =28;
        
        // first date 
        
        ///driver.findElement(By.id("first_date_picker")).click();
        
       // driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+ day +"]")).click();
        
       // Thread.sleep(3000);
        
        
        
        // second date 
        
       // driver.findElement(By.id("second_date_picker")).click();
        
      //  driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+day+"]")).click();
        
      //  Thread.sleep(3000);
        
 // select past and future date 
        
        String date="30/feb/2024";
        SimpleDateFormat dates = new SimpleDateFormat("dd/MMM/yyyy");
        
        dates.setLenient(false);
        
        Date  dateformat = dates.parse(date);
        
        System.out.println(dateformat);
        
        
        
        
        
        
        //driver.findElement(By.id("second_date_picker")).click();
        
      //  driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+day+"]")).click();
        
       // Thread.sleep(3000);
       // driver.quit();

	}

}
