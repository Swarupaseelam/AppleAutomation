package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMXpath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		//user.sendKeys("Admin");
		//WebElement pwd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		//pwd.sendKeys("admin123");
		//WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));(systax1)
		//login.click();
		//WebElement forgotpwd = driver.findElement(By.xpath("//a[text()='Forgot your password?']"));(syntax1)
		//WebElement forgotpwd = driver.findElement(By.xpath("//a[text()[contains(.,'Forgot your password?')]]"));(syntax2)
		//WebElement forgotpwd = driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']"));//(syntax3)
		WebElement forgotpwd = driver.findElement(By.xpath("//div[@id='forgotPasswordLink']/a"));
		forgotpwd.click();
				
	}

}
