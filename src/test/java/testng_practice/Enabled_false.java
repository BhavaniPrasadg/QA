package testng_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Enabled_false {
	@Test(enabled = false)
	public void m1() {
		System.out.println("Good evening");
	}
	@Test(priority = 1)
	public void m2() {
		System.out.println("Good Mng ");
		
	}
	@Test(priority = 2)
	public void m3() {
		System.out.println("Good Noon");
		Assert.fail();//Intentionally we are failing the test case
		//pull from github
	}
}
