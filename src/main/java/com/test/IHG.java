package com.test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IHG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	    WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
	    Select s=new Select(country);
	    s.selectByValue("DZ");
	    List<WebElement> li=s.getOptions();
	    Iterator<WebElement> it=li.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next().getText());
	    }
	    
	}

}
