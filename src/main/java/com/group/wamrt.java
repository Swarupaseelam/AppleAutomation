package com.group;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class wamrt {
@Test(groups= {"Regression"})
	public void guru()
	{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.guru.com/");
	driver.manage().window().maximize();
	}
}
