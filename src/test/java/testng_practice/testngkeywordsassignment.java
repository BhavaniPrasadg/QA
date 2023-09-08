package testng_practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngkeywordsassignment {
	@Test(invocationCount = 5,priority = 1)
	public void m1() {
		Reporter.log("hello good morning",true);
	}
	@Test(priority = 3,enabled = false)
	public void m2() {
		Reporter.log("hello good evening",true);
	}
	@Test(priority = 2)
	public void m3() {
		Reporter.log("hello good noon",true);
	}
@Test(priority = 4)
public void m4() {
	Reporter.log("hello good night",true);
	Assert.fail();
}
}
