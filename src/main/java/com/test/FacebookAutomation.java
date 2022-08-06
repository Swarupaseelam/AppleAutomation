package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAutomation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement createbutton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createbutton.click();
		
		Thread.sleep(3000);
		//WebElement male = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		//male.click();
		//driver.findElement(By.xpath(xpathExpression))
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s= new Select(month);
		
		s.selectByValue("2");
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select d= new Select(day);
		
		d.selectByValue("31");
		Thread.sleep(3000);
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select y=new Select(year);
		y.selectByValue("2019");
				
				
				
	}
	

}
