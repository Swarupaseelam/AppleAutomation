package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChercherAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		//driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement first = driver.findElement(By.xpath("//select[@id='first']"));
		Thread.sleep(3000);
		Select f=new Select(first);
		f.selectByValue("Google");
		WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
		Thread.sleep(3000);
		Select a=new Select(animals);
		a.selectByValue("big baby cat");
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.xpath("//button[@id='custom']"));
		dropdown.click();
		Thread.sleep(3000);
			WebElement li = driver.findElement(By.xpath("//*[@class='dropdown-menu']/li/b[3]"));
		Select m=new Select(dropdown);
		m.selectByValue("2");
		
		
	

	}

}
