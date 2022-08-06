package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a=new Actions(driver);
		WebElement unm = driver.findElement(By.xpath("//input[@name='email']"));
		a.moveToElement(unm).sendKeys("swarupa").build().perform();
		Thread.sleep(3000);
		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		a.sendKeys(pwd, "Swarupa").build().perform();
	
		
	//	a.moveToElement(log).click().build().perform();

	}

}
