package testng_practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class enableddependsonmethod {
	@Test
	public void login() {
		Reporter.log("iam login",true);
		Assert.fail();
		
	}
@Test(enabled = false)
public void logout() {
	Reporter.log("iam logout",true);
}
}
