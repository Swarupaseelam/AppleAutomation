package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmForgotpassword {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//WebElement link= driver.findElement(By.linkText("Forgot your password?"));
		//link.click();
		//WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		//user.sendKeys("Admin");
		// driver.findElement(By.xpath("//div[@id='forgotPasswordLink']"))
		Thread.sleep(2000);
		
		WebElement fpwd = driver.findElement(By.linkText("Forgot your password?"));
		fpwd.click();
		
		
		
	}

}
