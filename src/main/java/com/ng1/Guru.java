package com.ng1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Guru {
@Test
	public void gru()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.guru.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}
