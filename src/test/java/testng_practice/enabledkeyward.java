package testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabledkeyward {
	@Test
	public void m1() {
		Reporter.log("bhavaniprasad",true);
	}
@Test(enabled = false)
public void m2() {
	Reporter.log("venugopal",true);
}
}
