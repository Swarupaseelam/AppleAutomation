package com.ng1;

import org.testng.annotations.Test;

public class Amazonverifycart extends Amazon{
	@Test(dependsOnMethods="Amazonaddcart")
	public void amazonverifycary()
	{
		System.out.println("Your items are verified ");


}
}