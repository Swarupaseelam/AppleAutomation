package com.ng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProviderTest {

	@Test(dataProvider="good")
	
	public void login(String user,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement userid = driver.findElement(By.id("txtUsername"));
		userid.sendKeys(user);
		WebElement pwdp = driver.findElement(By.name("txtPassword"));
		pwdp.sendKeys(pwd);
		WebElement button = driver.findElement(By.className("button"));
		button.click();
	}
	@DataProvider(name="good")
	public static Object[][] uspeople()
	{
		return new Object[][] {{"Admin,"admin123"},{"abcd","efg"}};
	}
}

