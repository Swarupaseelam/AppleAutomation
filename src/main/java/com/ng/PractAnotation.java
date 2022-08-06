package com.ng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PractAnotation {

@BeforeSuite		
public void one()
{
	System.out.println("one method");
}
@BeforeTest
public void two()
{
	System.out.println("2 method");
}
	@BeforeClass
public void three()
{
	System.out.println("3 method");
}
	@BeforeMethod
public void four()
{
	System.out.println("4 method");
}
	@Test
public void five()
{
	System.out.println("5 method");
}
	@AfterMethod
public void six()
{
	System.out.println("6 method");
}
	@AfterTest
public void seven()
{
	System.out.println("7 method");
	}
	@AfterSuite
public void eight()
{
	System.out.println("8 method");
}
}