package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", ".//drivers//geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		
		
	}

}
