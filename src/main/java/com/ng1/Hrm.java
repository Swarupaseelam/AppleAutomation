package com.ng1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrm {
	@Test
public void Hrmweb()
{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement user = driver.findElement(By.id("txtUsername"));
		user.sendKeys("Admin");
		WebElement pwd = driver.findElement(By.name("txtPassword"));
		pwd.sendKeys("admin123");
		WebElement button = driver.findElement(By.className("button"));
		button.click();
}
}
