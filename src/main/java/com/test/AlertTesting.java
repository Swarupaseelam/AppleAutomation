package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class AlertTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement simple= driver.findElement(By.xpath("//input[@type='button']"));
		simple.click();
		 Alert at = driver.switchTo().alert();
		Thread.sleep(3000);
		at.accept();
		WebElement confor = driver.findElement(By.xpath("//input[@name='confirmation']"));
		confor.click();
		Thread.sleep(3000);
		at.dismiss();
		WebElement promt =driver.findElement(By.xpath("//input[@name='prompt']"));
		promt.click();
		//Thread.sleep(3000);
		at.sendKeys("swarupa");
		at.accept();
		
	}

	private void accept() {
		// TODO Auto-generated method stub
		
	}

}
