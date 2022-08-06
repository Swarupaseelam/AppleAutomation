package com.ng1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertsoft {
@Test
	
	public void Assert()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String url=("https://opensource-demo.orangehrmlive.com/");
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(driver.getCurrentUrl().equals(url));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}
